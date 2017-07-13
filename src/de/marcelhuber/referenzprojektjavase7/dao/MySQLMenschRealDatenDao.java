package de.marcelhuber.referenzprojektjavase7.dao;

import de.marcelhuber.referenzprojektjavase7.daointerface.InterfaceMenschRealDatenDao;
import de.marcelhuber.referenzprojektjavase7.datensatzklasse.MenschDatenKonkret;
import de.marcelhuber.referenzprojektjavase7.db.MySQLDBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;

/**
 *
 * @author Marcel Huber
 */
public class MySQLMenschRealDatenDao implements InterfaceMenschRealDatenDao {

    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;
    private String sql;
    private boolean connectionIsLost;

    // Connection wird hier durch den INI-Block aufgebaut und empfangen
    {
        initConnectionAndStatement();
    }

    private void initConnectionAndStatement() {
        connection = MySQLDBConnection.INSTANCE.getConnection();
        statement = MySQLDBConnection.INSTANCE.getStatement();
    }

    @Override
    public Collection<MenschDatenKonkret> findAllMenschRealDaten() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public MenschDatenKonkret findMenschRealDatenById(int uid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int create(MenschDatenKonkret mdk) {
        connectionIsLost = MySQLDBConnection.INSTANCE.checkIfConnectionIsLost();
        System.out.println("connection is lost: " + connectionIsLost);
        // Connection kann invalid sein
        // eigene Methode "pruefe, ob Connection neu erstellt werden muss" schreiben
        System.out.println("Connection (MySQLRealDatenDAO):            " + connection);
        sql = "INSERT INTO `Mensch`"
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

    @Override
    public void delete(MenschDatenKonkret mrD) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(MenschDatenKonkret mrD) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

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
}
