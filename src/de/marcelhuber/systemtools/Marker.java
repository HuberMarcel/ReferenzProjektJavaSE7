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

//    public static void main(String[] args) {
//        marker();
//    }
}
