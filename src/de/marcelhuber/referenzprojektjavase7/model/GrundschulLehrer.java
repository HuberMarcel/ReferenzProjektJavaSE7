package de.marcelhuber.referenzprojektjavase7.model;

import de.marcelhuber.referenzprojektjavase7.exceptions.GrundschulLehrerCannotBeInitiatedException;
import de.marcelhuber.referenzprojektjavase7.datensatzklasse.MenschDatenKonkret;
import de.marcelhuber.systemtools.Marker;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Marcel Huber; letzte Änderung: 09.08.2017
 */
public class GrundschulLehrer extends MenschReal {

    // der String und Konstuktor für das Separationszeichen ist rein zu Testzwecken
    // für die Ausgabe und das kann später auskommentiert oder ganz entfernt werden
    private String separationsZeichen;

    {
        separationsZeichen = "; ";
    }

    private List<String> unterrichtsFaecher;

    private GrundschulLehrer(MenschReal mr) {
        super(mr.getMenschDaten());
    }

    public String getSeparationsZeichen() {
        return separationsZeichen;
    }

    public void setSeparationsZeichen(String separationsZeichen) {
        this.separationsZeichen = separationsZeichen;
    }

    public List<String> getUnterrichtsFaecher() {
        ifUnterrichtsFaecherIsNullInitializeNewList();
        return Collections.unmodifiableList(unterrichtsFaecher);
    }

    public void changeUnterrichtsFaecher(String unterrichtsFachOld,
            String unterrichtsFachNew) {
        removeUnterrichtsFach(unterrichtsFachOld);
        addUnterrichtsFach(unterrichtsFachNew);
    }

    public void clearAllUnterrichtsFaecher() {
        if (ifUnterrichtsFaecherIsNullInitializeNewList()) {
            return;
        }
        unterrichtsFaecher.clear();
    }

    public void addUnterrichtsFach(String unterrichtsFach) {
        ifUnterrichtsFaecherIsNullInitializeNewList();
        addUnterrichtsFaecher(new String[]{unterrichtsFach});
    }

    public void addUnterrichtsFaecher(String[] unterrichtsFaecher) {
        ifUnterrichtsFaecherIsNullInitializeNewList();
        // der boolsche Rückgabewert ist beim adden uninteressant
        if (unterrichtsFaecher != null && unterrichtsFaecher.length > 0) {
            for (String fach : unterrichtsFaecher) {
                this.unterrichtsFaecher.add(fach);
            }
        }
    }

    public void removeUnterrichtsFach(String unterrichtsFach) {
        if (ifUnterrichtsFaecherIsNullInitializeNewList() == true) {
            return;
        }
        unterrichtsFaecher.remove(unterrichtsFach);
    }

    public void removeUnterrichtsFaecher(String[] unterrichtsFaecher) {
        if (ifUnterrichtsFaecherIsNullInitializeNewList() == true) {
            // es wäre sinnlos, auf null die remove-Methode
            // aufzurufen bzw. spätestens jetzt auf ein leeres Listenobjekt
            return;
        }
        if (unterrichtsFaecher != null && unterrichtsFaecher.length > 0) {
            for (String fach : unterrichtsFaecher) {
                if (this.unterrichtsFaecher.size() == 0) {
                    // sobald die unterrichtsFaecher-Liste leer ist, können wir aufhören
                    return;
                }
                this.unterrichtsFaecher.remove(fach);
            }
        }
    }

    // liefert false zurück, falls unterrichtsFaecher != null war!!
    // liefert true zurück, falls unterrichtsFaecher == null war!!
    private boolean ifUnterrichtsFaecherIsNullInitializeNewList() {
        boolean isUnterrichtsFaecherNull = false;
        if (this.unterrichtsFaecher == null) {
            isUnterrichtsFaecherNull = true;
            this.unterrichtsFaecher = new ArrayList<>();
        }
        return isUnterrichtsFaecherNull;
    }

    static public GrundschulLehrer getInstance(MenschReal mr) {
        MenschDatenKonkret mdk = new MenschDatenKonkret.Builder().build();
        if (mr == null) {
            // die folgende auskommentierte Fallbehandlung wird verboten,
            // weil sonst die Daten wider Erwarten nicht zu dem Objekt 
            // mr erzeugt werden
//            mr = new MenschReal(mdk);
//            mr.getMenschDaten().setFamilienname("Dummy-Object".toUpperCase());
//            return new GrundschulLehrer(mr);
            throw new GrundschulLehrerCannotBeInitiatedException();
        }
        if (mr.getMenschDaten() == null) {
            mr.setMenschDaten(mdk);
        }
        return new GrundschulLehrer(mr);
    }

    public String toString() {
        String returnString;
        System.out.println("Grundschullehrer, meine Daten: (<-- in der toString()-Methode der "
                + "Grundschullehrer-Klasse!!)");
//        PressEnter.toContinue();
        returnString = super.toString();
        if (unterrichtsFaecher != null && unterrichtsFaecher.size() > 0) {
            returnString += "\nUnterrichtsfächer: " + unterrichtsFaecher;
        }
        returnString += "";
        return returnString;
    }

    // alles Folgende ist nur hilfreich für die zugehörige Demo-Klasse
    // die direkt folgende Methode existiert nur wegen dem, was hier in der Main-Methode stand
    private void markiereNeuenAbschnitt() {
        Marker.marker();
        Marker.marker();
        Marker.marker();
        Marker.marker();
        System.out.println("");
        System.out.println("");
    }

    // alles Folgende ist nur hilfreich für die zugehörige Demo-Klasse
    static private GrundschulLehrer dummy;
    static private int counter = 0;

    static public void nutzeMarkiereNeuenAbschnitt() {
        if (dummy == null) {
            Calendar dummyCalendar = Calendar.getInstance();
//            dummyCalendar.set(1800,0,13);      // 13.01.1800
            dummyCalendar.set(1800, Calendar.JANUARY, 13);      // 13.01.1800
            dummy = new GrundschulLehrer(MenschReal.getInstance(new MenschDatenKonkret(
                    "dummyGeburtsname", "dummyFamilienname", "dummyVorname",
                    dummyCalendar)));
            dummy.getMenschDaten().setFamilienname("GS Hilfsobjekt Nr.: "
                    + (++counter));
            dummy.addUnterrichtsFach("Being a dummy...");
        }
        System.out.println("Ich bin ein Dummy-Objekt: " + dummy.getMenschDaten().getFamilienname());
        System.out.println(dummy);
        dummy.markiereNeuenAbschnitt();
    }
}
