package de.marcelhuber.referenzprojektjavase7.demos;

import de.marcelhuber.referenzprojektjavase7.datensatzklasse.MenschDatenKonkret;
import de.marcelhuber.referenzprojektjavase7.db.MySQLDBConnection;
import de.marcelhuber.referenzprojektjavase7.dao.MySQLMenschRealDatenDao;
import de.marcelhuber.systemtools.PressEnter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marcel Huber
 */
public class MySQLMenschRealDatenDaoDemo {

    static private void erzeugeTabelleMensch(boolean wirklichErzeugen) {
        Connection con = MySQLDBConnection.INSTANCE.getConnection();
        File file = new File("SQLBefehleFuerCreateTable.txt");
        String sql = "";
        String zeile = "";
        if (wirklichErzeugen) {
            try {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while ((zeile = br.readLine()) != null) {
                    sql += "\n" + zeile;
                }
            } catch (IOException ex) {
                System.err.println(ex);
                ex.printStackTrace();
            }
        }

        boolean checkSQLString = false;
        if (checkSQLString) {
            System.out.println(sql);
        }
//        Connection connection = MySQLDBConnection.INSTANCE.getConnection();
        Statement statement = MySQLDBConnection.INSTANCE.getStatement();
        if (wirklichErzeugen) {
            try {
                statement.execute(sql);
            } catch (SQLException ex) {
                System.err.println(ex);
                ex.printStackTrace();
            }
        }
    }

    static private void loescheTabelleMensch(boolean wirklichLoeschen) {
        Statement statement = MySQLDBConnection.INSTANCE.getStatement();
        try {
            if (wirklichLoeschen) {
                statement.execute("DROP TABLE `Mensch`");
            }
        } catch (SQLException ex) {
            Logger.getLogger(MySQLMenschRealDatenDaoDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        MySQLDBConnection.INSTANCE.closeConnection();
    }

    public static void main(String[] args) {
        boolean bool01 = false;
        boolean bool02 = false;
        if (args.length == 2) {
            if (args[0].toLowerCase().equals("true")) {
                bool01 = true;
            }
            if (args[1].toLowerCase().equals("true")) {
                bool02 = true;
            }
        }
        erzeugeTabelleMensch(bool01);
        loescheTabelleMensch(bool02);
        // Hinweis: Wenn die Connection geclosed wurde, kann man 
        //          nicht mehr wie in der insertNewMenschRealDaten()
        //          Daten in die SQL-DB hinzufügen - MySQLDBConnection ist 
        //          "eigentlich" ein Singleton 
        new MySQLMenschRealDatenDaoDemo().go();
    }

    private void go() {
        insertNewMenschRealDaten();
    }

    private void insertNewMenschRealDaten() {
        MySQLMenschRealDatenDao mySQLDummyInsertDao
                = new MySQLMenschRealDatenDao();
        Calendar marcelsTagDerGeburt
                = Calendar.getInstance();
        marcelsTagDerGeburt.set(1980, Calendar.DECEMBER, 27);
        MenschDatenKonkret marcelsDaten
                = new MenschDatenKonkret.Builder()
                .geburtsname("Huber")
                .familienname("Huber")
                .vorname("Marcel")
                .zweitname("B.")
                .geburtsDatum(marcelsTagDerGeburt)
                .build();
        System.out.println(marcelsDaten);
        System.out.println(marcelsDaten.getGeburtsDatumAsString());
//        PressEnter.toContinue();
        mySQLDummyInsertDao.create(marcelsDaten);
//        PressEnter.toContinue();
        Calendar saschasTagDerGeburt
                = Calendar.getInstance();
        saschasTagDerGeburt.set(1978, Calendar.SEPTEMBER, 13);
        MenschDatenKonkret saschasDaten
                = new MenschDatenKonkret("Huber", "Huber", "Sascha", saschasTagDerGeburt);
        mySQLDummyInsertDao.create(saschasDaten);
        Calendar pascalsTagDerGeburt
                = Calendar.getInstance();
        pascalsTagDerGeburt.set(1992, Calendar.SEPTEMBER, 15);
        MenschDatenKonkret pascalsDaten
                = new MenschDatenKonkret.Builder()
                .familienname("Huber")
                .vorname("Pascal")
                .geburtsDatum(pascalsTagDerGeburt)
                .build();
        mySQLDummyInsertDao.create(pascalsDaten);
        MenschDatenKonkret mamasDaten
                = (MenschDatenKonkret) marcelsDaten.clone();
        mamasDaten.getGeburtsDatum().set(1954, Calendar.AUGUST, 19);
        mamasDaten.setFamilienname("Huber");
        mamasDaten.setGeburtsname("Hg.");
        mamasDaten.setZweitname("S.");
        mamasDaten.setVorname("G.");
        mySQLDummyInsertDao.create(mamasDaten);
        mySQLDummyInsertDao.create(marcelsDaten);
        mySQLDummyInsertDao.closeConnection();
    }
}
