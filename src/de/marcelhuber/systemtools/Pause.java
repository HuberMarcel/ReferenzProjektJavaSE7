package de.marcelhuber.systemtools;

/**
 *
 * @author Marcel Huber
 */
public class Pause {

    static public void breakInMillis() {
//        breakInMillis(0);
    }

    static public void breakInMillis(long timeOut) {
        try {
            Thread.sleep(timeOut);
        } catch (InterruptedException ex) {
        }
    }

    static public void breakInSeconds(long timeOut) {
        breakInMillis(1000 * timeOut);
    }

    static public void breakInSecondsWithTimer(long timeOut) {
        System.out.print("Counter gestartet ---- Dauer = " + timeOut + "s : ");
        long timeStart = System.currentTimeMillis();
        long countDown;
        long lastSecond = 0;
        do {
            countDown = System.currentTimeMillis();
            if ((long) ((countDown - timeStart) / 1000) > lastSecond) {
                lastSecond += 1;
                System.out.print("weiter geht's in " + (timeOut - lastSecond)
                        + " Sekunden  | ");
                if (lastSecond % 5 == 0) {
                    System.out.println("");
                }
            }
        } while ((countDown - timeStart) / 1000 <= timeOut - 1);
        System.out.println("Counter beendet");
        System.out.println("");
    }

    static public void breakInSeconds() {
//       breakInSeconds(0);
    }
}
