package de.marcelhuber.referenzprojektjavase7.db;
// DER SQL-Connector kann momentan auch Tables erstellen und löschen
// Rein zu Testzwecken

import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.*;

/**
 *
 * @author Marcel Huber; letzte Änderung: 09.08.2017
 */
// MySQLDBConnection als Singleton!
public enum MySQLDBConnection {

    INSTANCE;

    private Connection connection;
    // rein zu Testzwecken die Möglichkeit einer weiteren Verbindung
    // soll später natürlich entfernt werden!!!!
//    private Connection anotherConnection;
    private Statement statement;
    // 
    // verbindungs-parameter
    private String host;
    private String user;
    private String pass;
    private String db;
    private boolean connectionIsLost;

    private MySQLDBConnection() {
        initParameter();
    }

    private void initParameter() {
        Properties props = new Properties();
        try (FileReader fr = new FileReader("dbconnectionReferenzprojekt.properties")) {
            props.load(fr);
            // Verbindungsparameter aus properties-file
            host = props.getProperty("jdbc.host", "localhost" + ":3306");
            user = props.getProperty("jdbc.user");
            pass = props.getProperty("jdbc.pass");
            db = props.getProperty("jdbc.db");
//            System.out.println("Where Am I? " + new File("").getAbsolutePath());
//            PressEnter.toContinue();
        } catch (IOException ioEx) {
            System.err.println(ioEx);
            ioEx.printStackTrace();
        }

        String url = "jdbc:mysql://" + host + "/" + db;
        try {
            // WICHTIG: Das Connection-Objekt erhalten wir über "den" DriverManager            
////            System.out.println("Where Am I? " + new File("").getAbsolutePath());
////            PressEnter.toContinue();
//            try {
//                Class.forName("com.mysql.jdbc.Driver");
//            } catch (ClassNotFoundException ex) {
//                Logger.getLogger(MySQLDBConnection.class.getName()).log(Level.SEVERE, null, ex);
//            }
            connection = DriverManager.getConnection(url, user, pass);
//            Connection connection2 = DriverManager.getConnection(url, user, pass);
            // mit dem Connection-Objekt können wir (versuchen,)  ein Statement (zu) erzeugen
            statement = connection.createStatement();
            connectionIsLost = false;
            System.out.println("MySQL-Verbindung erfolgreich hergestellt!");
            System.out.println("Connection: " + connection);
//            System.out.println("Connection2: " + connection2);
            System.out.println("Statement: " + statement);
        } catch (SQLException sqlex) {
            System.out.println("Connection (Klasse MySQLDBConnection): " + connection);
            System.err.println(sqlex);
            sqlex.printStackTrace();
            connectionIsLost = true;
        }
    }

//    public Connection getAnotherConnection() {
//        try {
//            String url = "jdbc:mysql://" + host + "/" + db;
//            anotherConnection = DriverManager.getConnection(url, user, pass);
//            System.out.println("Eine weitere Verbindung wurde erfolgreich "
//                    + "hergestellt!");
//        } catch (SQLException sqlex) {
//            System.out.println(sqlex);
//            sqlex.printStackTrace();
//        }
//        return anotherConnection;
//    }
    public Connection getConnection() {
        System.out.println("(MySQLDBConnection) getConnection() ");
        System.out.println("(MySQLDBConnection) Connection:     " + connection);
        // bessere Alternative zu getAnotherConnection
        connectionIsLost = getConnectionIsLost();
        System.out.println("connectionIsLost (MySQLDBConnection): " + connectionIsLost);
//        finally {
//            System.out.println("Connection: " + connection);
//        }
        if (connectionIsLost) {
            initParameter();
        }
        return connection;
    }

    public Statement getStatement() {
        return statement;
    }

    public void closeConnection() {
        try {
            connection.close();
        } catch (SQLException ex) {
            System.out.println("Schließen der Verbindung fehlgeschlagen!");
            System.err.println(ex);
            ex.printStackTrace();
        }
    }

    public void createTable(String table, String createBefehl) throws SQLException {
        try {
            statement.execute("CREATE TABLE `" + table + "`"
                    + createBefehl);
        } catch (SQLException sqlex) {
//            System.out.println(sqlex);
//            sqlex.printStackTrace();
            throw (sqlex);
        }
    }

    public void dropTable(String table) {
        try {
            statement.execute("DROP TABLE `" + table + "`");
        } catch (SQLException sqlex) {
            System.out.println(sqlex);
            sqlex.printStackTrace();
        }
    }

    public void deleteTable(String table) {
        dropTable(table);
    }

    public boolean getConnectionIsLost() {
        try {
            if (connection == null || connection.isClosed() || !connection.isValid(500)) {
                return connectionIsLost = true;
            }
        } catch (SQLException sqlex) {
            System.out.println(sqlex);
            sqlex.printStackTrace();
            return connectionIsLost = true;
        }
        return connectionIsLost = false;
    }
}
