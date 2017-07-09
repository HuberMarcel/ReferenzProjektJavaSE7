package de.marcelhuber.systemtools;

/**
 *
 * @author Marcel Huber
 */
public class Marker {

    static private StringBuilder exclamationMark = new StringBuilder("");

    static {
        for (int i = 0; i < 80; i++) {
//                exclamationMark.append("!");
            exclamationMark.append('!');
        }
    }

    static public void marker() {
        System.out.println(exclamationMark);
    }

    static public void marker(char c) {
        exclamationMark = new StringBuilder("");
        for (int i = 0; i < 80; i++) {
            exclamationMark.append(c);
        }
        marker();
    }

//    public static void main(String[] args) {
//        marker();
//    }
}
