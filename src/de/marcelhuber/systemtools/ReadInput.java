package de.marcelhuber.systemtools;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Marcel Huber
 */
public class ReadInput {

    public static boolean readBoolean() {
        try {
            return Boolean.parseBoolean(readString());
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    public static boolean readBooleanWithExceptionHandling() {
        try {
            boolean boolRead = Boolean.parseBoolean(readString());
            System.out.println("Boolean.parseBoolean(readString()) gibt nur bei "
                    + "String \"true\".toLowerCase()==true auch true zurück: " + boolRead);
            return boolRead;
        } catch (Throwable throwObj) {
            System.out.println("Fehleingabe, neuer Versuch; Fehlermeldung: " + throwObj);
            readBooleanWithExceptionHandling();
        }
        return true;
    }

    public static double readDouble() {
        try {
            return Double.parseDouble(readString());
        } catch (NumberFormatException ex) {
            return 0.0;
        }
    }

    public static double readDoubleWithExceptionHandling() {
        try {
            return Double.parseDouble(readString());
        } catch (Throwable throwObj) {
            System.out.println("Fehleingabe, neuer Versuch; Fehlermeldung: " + throwObj);
            readDoubleWithExceptionHandling();
        }
        return 0.0;
    }

    public static int readInt() {
        try {
            return Integer.parseInt(readString());
        } catch (NumberFormatException ex) {
            return 0;
        }
    }

    public static int readIntWithExceptionHandling() {
        try {
            return Integer.parseInt(readString());
        } catch (Throwable throwObj) {
            System.out.println("Fehleingabe, neuer Versuch; Fehlermeldung: " + throwObj);
            readIntWithExceptionHandling();
        }
        return 0;
    }

    public static long readLong() {
        try {
            return Long.parseLong(readString());
        } catch (NumberFormatException ex) {
            return 0;
        }
    }

    public static long readLongWithExceptionHandling() {
        try {
            return Long.parseLong(readString());
        } catch (Throwable throwObj) {
            System.out.println("Fehleingabe, neuer Versuch; Fehlermeldung: " + throwObj);
            readLongWithExceptionHandling();
        }
        return 0;
    }

    public static String readString() {
        // Mit Kanonen auf Spatzen schiessen
//        return new Scanner(System.in).nextLine();

        // effizienter:
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            return br.readLine();
        } catch (IOException ex) {
            return "";
        }
    }
}
