// diese Klasse dient zum Start des Programms gemäß dem MVC-Modell
// das Modell und die GUI (View) werden geladen und "verwaltet"
package de.marcelhuber.referenzprojektjavase7.dao;

import de.marcelhuber.referenzprojektjavase7.daointerface.InterfaceMenschRealDatenDao;
import de.marcelhuber.referenzprojektjavase7.datensatzklasse.MenschDatenKonkret;
import de.marcelhuber.referenzprojektjavase7.db.MySQLDBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author Marcel Huber
 * letzte Änderung: 21.07.2017
 */
public class MySQLMenschRealDatenDao implements InterfaceMenschRealDatenDao {

    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;
    private String sql;
    private boolean connectionIsLost;
    private String[] columns = {
        "id",
        "geburtsname",
        "familienname",
        "vorname",
        "zweitname",
        "geburtsdatum"
    };
    private String tableName = "mensch";

    // Connection wird hier durch den INI-Block aufgebaut und empfangen
    {
        initConnectionAndStatement();
    }

    // Initialisierung der Connection zur MySQL-Datenbank und bereitstellen/
    //  kreieren des Statements
    private void initConnectionAndStatement() {
        connection = MySQLDBConnection.INSTANCE.getConnection();
        statement = MySQLDBConnection.INSTANCE.getStatement();
        connectionIsLost = MySQLDBConnection.INSTANCE.getConnectionIsLost();
    }

    /**
     * Aus der MySQL-Datenbanktabelle (siehe tableName) werden die Daten der
     * Tabelle in einer ArrayList abgespeichert und zurückgegeben
     * @return eine ArrayList der "Mensch-Daten" aus der mySQL-Datenbanktabelle 
     * 'tableName'
    */
    @Override
    public Collection<MenschDatenKonkret> findAllMenschRealDaten() {
        if (connectionIsLost) {
            initConnectionAndStatement();
        }
        List<MenschDatenKonkret> menschDaten = new ArrayList<>();

        String sql = "SELECT * FROM `" + tableName + "`";
        try (ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                menschDaten.add(getMenschDatenFromResultSet(resultSet));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }

        return menschDaten;
    }

    /**
     * entsprechend der Spalten der mySQL-Tabell 'mensch' wird ein 
     * 'MenschDatenKonkret'-Objekt erzeugt und zuückgegeben
     * 
     * @param resultSet: ein ResultSet aus der mySQL-Datenbanktabelle 'tableName'
     * @return ein "MenschDatenKonkret"-Objekt 
     * @throws SQLException 
     */
    private MenschDatenKonkret getMenschDatenFromResultSet(ResultSet resultSet) throws SQLException {
        System.out.println("Neuer Datensatz:");
        System.out.println("id:            " + resultSet.getString(columns[0]));
        System.out.println("Geburtsname:   " + resultSet.getString(columns[1]));
        System.out.println("Familiennname: " + resultSet.getString(columns[2]));
        System.out.println("Vorname:       " + resultSet.getString(columns[3]));
        System.out.println("Zweitname:     " + resultSet.getString(columns[4]));
        System.out.println("Geburtsdatum:  " + resultSet.getString(columns[5]));
        System.out.println("");

        Calendar birthdayOfMdkDummy = Calendar.getInstance();
//        System.out.println(resultSet.getString(columns[5]));
        String[] birthdayAsStringArray = resultSet.getString(columns[5]).split("\\.");
//        System.out.println(Arrays.toString(birthdayAsStringArray));
        // der Eintrg der Datenbanktabelle sollte syntaktisch korrekt sein
        if (birthdayAsStringArray.length != 3) {
            throw new SQLException("Geburtstagsfeldeintrag fehlerhaft!");
        }
        int bYear = Integer.parseInt(birthdayAsStringArray[2]);
        int bMonth = Integer.parseInt(birthdayAsStringArray[1]);
        int bDay = Integer.parseInt(birthdayAsStringArray[0]);
        birthdayOfMdkDummy.set(bYear, bMonth - 1, bDay);       // Monate werden in Java 0-basiert gezählt
        MenschDatenKonkret mdkDummy = new MenschDatenKonkret.Builder()
                .geburtsname(resultSet.getString(columns[1]))
                .familienname(resultSet.getString(columns[2]))
                .vorname(resultSet.getString(columns[3]))
                .zweitname(resultSet.getString(columns[4]))
                .geburtsDatum(birthdayOfMdkDummy)
                .build();
        mdkDummy.setId(resultSet.getInt(columns[0]));
        System.out.println(mdkDummy);
        return mdkDummy;
    }

    /**
     * innerhalb der Datenbanktabelle 'tableName' wird mithilfe der id eine
     * Person gefunden, mithilfe der Daten aus der Datenbank dann ein 
     * MenschDatenKonkret-Objekt erzeugt und dieses dann zurückgegeben
     * @param id die id zum Auffinden einer Person in der Datenbanktabelle 'tableName'
     * @return das zur id zugehörige MenschDatenKonkret-Objekt
     */
    @Override
    public MenschDatenKonkret findMenschRealDatenById(int id) {
        String sql = "SELECT * FROM `" + tableName + "` WHERE `id`='" + id + "'";

        try (ResultSet resultSet = statement.executeQuery(sql)) {
            if (resultSet.next()) {
                return getMenschDatenFromResultSet(resultSet);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }

    /**
     * ein MenschDatenKonkret-Objekt wird übergeben, um es in der Datenbanktabelle
     * 'tableName' abzulegen
     * @param mdk enthält die MenschDaten = Eckdaten eines Mensches als Objekt
     * @return liefert 0 bei Misserfolg (Daten wurden nicht in der Tabell gespeichert)
     * und 1 bei Erfolgt (Daten des mdk's wurden in die obige Tabelle gespeichert)
     */
    @Override
    public int create(MenschDatenKonkret mdk) {
        connectionIsLost = MySQLDBConnection.INSTANCE.getConnectionIsLost();
        System.out.println("connection is lost: " + connectionIsLost);
        // Connection kann invalid sein
        // eigene Methode "pruefe, ob Connection neu erstellt werden muss" schreiben
        System.out.println("Connection (MySQLRealDatenDAO):            " + connection);
        sql = "INSERT INTO `" + tableName + "`"
                + "("
                + "`geburtsname`,"
                + "`familienname`,"
                + "`vorname`,"
                + "`zweitname`,"
                + "`geburtsdatum`"
                + ") VALUES "
                + "("
                + "'" + mdk.getGeburtsname() + "', "
                + "'" + mdk.getFamilienname() + "', "
                + "'" + mdk.getVorname() + "', "
                + "'" + mdk.getZweitname() + "', "
                + "'" + mdk.getGeburtsDatumAsString() + "'"
                + ")";
        System.out.println(sql);
        return modifiziere(sql);
    }

    /**
     * Die Daten des Objekts mdk sollen in der Datenbank lokalisiert und dann 
     * aus dieser entfernt werden
     * @param mdk die Daten des zu löschenden Objekts/der zu löschenden Daten
     * @return true, falls die Daten (anhand der id) in der Tabelle waren 
     * und gelöscht werden konnten und false, falls das Löschen schiefgegangen ist
     */
    @Override
    public boolean delete(MenschDatenKonkret mdk) {
        String sql = "DELETE FROM `" + tableName + "` WHERE `id`='" + mdk.getId() + "'";
        int numberOfDeletedPersons = modifiziere(sql);
        if (numberOfDeletedPersons == 0) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * noch zu implementieren: Daten eines Mensches aus der Datenbank sollen
     * geupdatet werden können
     * @param mdk 
     */
    @Override
    public void update(MenschDatenKonkret mdk) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * hier wird das executeUpdate für entsprechende sql-Befehle gestartet
     * @param sql der sql-Befehl für das executeUpdate
     * @return 
     */
    private int modifiziere(String sql) {
        int numberOfnewPersons = 0;
        try {
            numberOfnewPersons = statement.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println(ex);
            return numberOfnewPersons;
        }
        return numberOfnewPersons;
    }

    public void closeConnection() {
        MySQLDBConnection.INSTANCE.closeConnection();
    }

    /**
     * prüfe, ob die Verbindung nicht null ist bzw. noch valide ist
     * @return true, falls Verbindung da/valide ist; falls, bei Verbindungsproblem
     * zur mySQL-Datenbank
     */
    public boolean getConnectionIsValid() {
        connectionIsLost = MySQLDBConnection.INSTANCE.getConnectionIsLost();
        if (connectionIsLost) {
            return false;
        } else {
            return true;
        }
    }
    /**
     * liefert die Connection 
     * @return die Connection
     */
    public Connection getConnection() {
        return connection;
    }
    /**
     * liefert das Statement
     * @return das statement der connection
     */
    public Statement getStatement() {
        return statement;
    }
}
