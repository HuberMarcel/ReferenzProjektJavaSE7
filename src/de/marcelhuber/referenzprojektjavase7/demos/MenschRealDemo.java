package de.marcelhuber.referenzprojektjavase7.demos;

import de.marcelhuber.referenzprojektjavase7.datensatzklasse.MenschDatenKonkret;
import de.marcelhuber.referenzprojektjavase7.model.MenschReal;
import java.util.Calendar;

/**
 *
 * @author Marcel Huber
 */
public class MenschRealDemo {

    public static void main(String[] args) {
        new MenschRealDemo().goDemo();
    }

    private void goDemo() {
//        MenschDatenKonkret marcelsDaten = null;
        MenschDatenKonkret marcelsDaten = new MenschDatenKonkret.Builder().build();
        marcelsDaten.setFamilienname("Huber");
        System.out.println(marcelsDaten);
//        MenschReal marcel = MenschReal.getInstance(null);
        MenschReal marcel = MenschReal.getInstance(marcelsDaten);
        System.out.println("Der Reale Mensch Marcel: " + marcel);
        // jetzt Mal gucken, wie das mit dem Builder funktioniert
        marcel = MenschReal.getInstance(new MenschDatenKonkret.Builder().build());
        System.out.println(marcel);
        // der Builder erzeugt mindestens ein MenschDatenKonkret-Objekt, auch, wenn es noch keine sinnvollen Werte hat
        Calendar marcelsTagDerGeburt = Calendar.getInstance();
        marcelsTagDerGeburt.set(1980, Calendar.DECEMBER, 27);
        marcelsDaten = new MenschDatenKonkret("Huber", "Huber", "Marcel",
                marcelsTagDerGeburt);
        marcelsDaten.setSeparationsZeichen(" || ");
        System.out.println("Marcels Daten:           " + "\n" + marcelsDaten);
        marcel = MenschReal.getInstance(marcelsDaten);
        System.out.println("Der Reale Mensch Marcel: " + marcel);
        MenschReal sascha = MenschReal.getInstance(marcelsDaten);
        System.out.println(sascha);
        // sascha hat noch dieSELBEN Menschdaten wie marcel, 
        // wir wollen zwar die Daten kopieren, aber saschas Menschdaten
        // sollen eigene sein - dafür hatten wir die clone()-Methode 
        // überschrieben (in Menschdaten-konkret)!!
        MenschDatenKonkret saschasDaten
                = (MenschDatenKonkret) (marcelsDaten.clone());
        System.out.println(saschasDaten);
        saschasDaten.setVorname("Sascha");
        Calendar saschasTagDerGeburt = saschasDaten.getGeburtsDatum();
        saschasDaten.getGeburtsDatum().set(1978, Calendar.SEPTEMBER, 13);
        saschasDaten.setGeburtsDatum(saschasTagDerGeburt);
        System.out.println(saschasDaten);
        System.out.println(marcelsDaten);
    }
}
