package de.marcelhuber.referenzprojektjavase7.db.test;

import de.marcelhuber.referenzprojektjavase7.db.MySQLDBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Marcel Huber
 */
public class MySQLDBConnectionTester {

    static private String dummyTable;

    static {
        dummyTable = "DUMMYTABLE";
    }
    Connection firstConnection;
//    Connection secondConnection;
    Statement stmt;
    ResultSet resultSet;

    public static void main(String[] args) {
        MySQLDBConnectionTester dummy = new MySQLDBConnectionTester();
        dummy.go();
        dummy.createTable();
        dummy.add("Huber");
        dummy.add("Herrig");
        dummy.add("Roth");
        dummy.showTable(dummyTable);
//        dummy.deleteTable();
        dummy.closeAll();
    }

    private void go() {
        // kurzer Test, ob MySQLDBConnection ein Singleton ist
        MySQLDBConnection mysqlconnector = MySQLDBConnection.INSTANCE;
        MySQLDBConnection my2ndsqlconnector = mysqlconnector.INSTANCE;
        System.out.println("Haben wir etwa ein und das selber Connection-"
                + "Objekt, nur zwei Referenzen dahin? "
                + (mysqlconnector == my2ndsqlconnector));
        firstConnection = mysqlconnector.getConnection();
//        secondConnection = mysqlconnector.getAnotherConnection();
//        System.out.println(firstConnection == MySQLDBConnection.INSTANCE.getConnection());
//        System.out.println(firstConnection == secondConnection);
//        int counter = 0;
//        try {
//            ++counter;
////            firstConnection.close();
//            ++counter;
//            secondConnection.close();
//        } catch (SQLException ex) {
//            System.out.println("Problem beim Schließen der " + counter + "en "
//                    + "Connection (Verbindung)!");
//        }
    }

    private void createTable() {
        try {
            MySQLDBConnection.INSTANCE.createTable(dummyTable, "(\n"
                    + "  `id` int unsigned NOT NULL AUTO_INCREMENT,\n"
                    + "  `geburtsname` varchar(255) COLLATE utf8_unicode_ci NOT NULL,\n"
                    + "  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,\n"
                    + "  `updated_at` timestamp NULL DEFAULT NULL,\n"
                    + "  PRIMARY KEY (`id`)\n"
                    + ") ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;");
        } catch (SQLException sqlex) {
            System.out.println(sqlex);
            sqlex.printStackTrace();
            return;
        }
    }

    private void add(String geburtsname) {
        String sql = "INSERT INTO `" + dummyTable + "` (`geburtsname`) "
                + "VALUES ('" + geburtsname + "')";
        try {
            stmt = firstConnection.createStatement();
            int number = stmt.executeUpdate(sql);
            System.out.println("\n" + number + " Datensätze hinzugefügt");
        } catch (SQLException sqlex) {
            System.out.println(sqlex);
            System.exit(0);
        }
    }

    private void deleteTable() {
        MySQLDBConnection.INSTANCE.deleteTable(dummyTable);
    }

    private void showTable(String table) {
        String sql = "SELECT * FROM " + table;
        try {
            ResultSet resultSet
                    = stmt.executeQuery(sql);
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1) + " - " + resultSet.getString(2));
            }
        } catch (SQLException sqlex) {
            System.out.println(sqlex);
            sqlex.printStackTrace();
        }

    }

    private void closeAll() {
        try {
            if (stmt != null) {
                stmt.close();
            }
            if (resultSet != null) {
                resultSet.close();
            }
        } catch (SQLException sqlex) {
            System.out.println(sqlex);
            sqlex.printStackTrace();
        } finally {
            if (firstConnection != null) {
                try {
                    firstConnection.close();
                } catch (SQLException sqlex) {
                    System.out.println(sqlex);
                    sqlex.printStackTrace();
                }
            }
        }

//        if (secondConnection != null) {
//            try {
//                secondConnection.close();
//            } catch (SQLException sqlex) {
//                System.out.println(sqlex);
//                sqlex.printStackTrace();
//            }
//        }
    }
}

