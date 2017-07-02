package de.marcelhuber.referenzprojektjavase7.demos;

import de.marcelhuber.referenzprojektjavase7.datensatzklasse.MenschDatenKonkret;
import de.marcelhuber.referenzprojektjavase7.model.GrundschulLehrer;
import de.marcelhuber.referenzprojektjavase7.model.MenschReal;
import de.marcelhuber.systemtools.Marker;
import de.marcelhuber.systemtools.PressEnter;
import java.util.Calendar;

/**
 *
 * @author Marcel Huber
 */
public class GrundschulLehrerDemo {

    public static void main(String[] args) {
        new GrundschulLehrerDemo().goDemo();
    }

    private void goDemo() {
        Calendar marcelsTagDerGeburt = Calendar.getInstance();
        marcelsTagDerGeburt.set(1980, Calendar.DECEMBER, 27);
        MenschDatenKonkret marcelsDaten = new MenschDatenKonkret("Huber", "", "Marcel",
                marcelsTagDerGeburt);
        System.out.println(marcelsDaten);
        MenschReal marcel = MenschReal.getInstance(marcelsDaten);
        System.out.println(marcel);
        marcel.getMenschDaten().setZweitname("B.");
        System.out.println(marcel);
        marcelsDaten.setFamilienname("Huber".toUpperCase());
        System.out.println(marcel);
        GrundschulLehrer marcelAlsGrundschullehrer = GrundschulLehrer.getInstance(marcel);
        System.out.println(marcelAlsGrundschullehrer);
        marcelAlsGrundschullehrer.setSeparationsZeichen(" --- ");
        System.out.println(marcelAlsGrundschullehrer);
        marcelAlsGrundschullehrer.addUnterrichtsFach("Mathematik");
        System.out.println("Der GS (Grundschullehrer) Marcel mit seinem Unterrichtsfach: ");
        System.out.println(marcelAlsGrundschullehrer);
        MenschDatenKonkret saschasDaten = (MenschDatenKonkret) (marcelsDaten.clone());
        saschasDaten.setVorname("Sascha");
        saschasDaten.getGeburtsDatum().set(1978, Calendar.SEPTEMBER, 12);
        MenschReal sascha = MenschReal.getInstance(saschasDaten);
        System.out.println(sascha);
//        //
//        PressEnter.toContinue();
//        Marker.marker();
//        Marker.marker();
//        System.out.println("Zum Vergleich nochmal:");
//        System.out.println(marcelsDaten);
//        System.out.println(marcel);
//        System.out.println(marcelAlsGrundschullehrer);
//        Marker.marker();
//        System.out.println(saschasDaten);
//        System.out.println(sascha);
//        // Datumskorrektur
//        sascha.getMenschDaten().getGeburtsDatum().add(Calendar.DAY_OF_MONTH, 1);
//        // 
//        Marker.marker();
//        System.out.println(saschasDaten);
//        System.out.println(sascha);
//        Marker.marker();
//        Marker.marker();
//        PressEnter.toContinue();
//        //
        GrundschulLehrer saschaAlsGrundschullehrer = GrundschulLehrer.getInstance(sascha);
        saschaAlsGrundschullehrer.addUnterrichtsFaecher(new String[]{"Sport", "Philosophie"});
        System.out.println(saschaAlsGrundschullehrer);
        GrundschulLehrer.nutzeMarkiereNeuenAbschnitt();
        saschaAlsGrundschullehrer.removeUnterrichtsFaecher(new String[]{"Philosophie", "Sport"});
        GrundschulLehrer.nutzeMarkiereNeuenAbschnitt();
//        // die folgenden 3 Zeilen sind auskommentiert, wurden wegen der Exc. getestet
//        MenschReal oma = null;
//        Pause.breakInSeconds(3);
//        GrundschulLehrer omaAlsGrundschullehrer = GrundschulLehrer.getInstance(oma);
        MenschReal oma = MenschReal.getInstance(new MenschDatenKonkret.Builder().build());
        GrundschulLehrer omaAlsGrundschullehrer = GrundschulLehrer.getInstance(oma);
        omaAlsGrundschullehrer.addUnterrichtsFaecher(new String[]{"Häkeln", "Lifehacks"});
        System.out.println(omaAlsGrundschullehrer);
        MenschDatenKonkret omasDaten = omaAlsGrundschullehrer.getMenschDaten();
        omasDaten.setVorname("Kath.");
        omasDaten.setFamilienname("Huber");
        omasDaten.setGeburtsname("HabeIchGeradeVergessen");
        System.out.println(omaAlsGrundschullehrer);
        Calendar omasTagDerGeburt = Calendar.getInstance();
        omasTagDerGeburt.set(1932, Calendar.JULY, 19);
        omasDaten.setGeburtsDatum(omasTagDerGeburt);
        System.out.println(omasDaten);
        Marker.marker();
        System.out.println(oma);
        System.out.println(omaAlsGrundschullehrer);
    }
}
