package de.marcelhuber.systemtools;

import java.io.*;

/**
 *
 * @author Marcel Huber
 */
public class PressEnter {

//    static public boolean boolFlag;

    static public void toContinue() {
        System.out.print("Press Enter to continue! ");
        try {
            System.in.read();
//            System.out.print((char) System.in.read());
        } catch (IOException e) {
            System.out.println("Fehlerhafte eingabe!");
            e.printStackTrace();
        }
    }
}
