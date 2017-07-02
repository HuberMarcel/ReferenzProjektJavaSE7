package de.marcelhuber.referenzprojektjavase7.model;

import de.marcelhuber.referenzprojektjavase7.exceptions.MenschRealCannotBeInitiatedException;
import de.marcelhuber.referenzprojektjavase7.datensatzklasse.AdressDaten;
import de.marcelhuber.referenzprojektjavase7.datensatzklasse.MenschDatenKonkret;

/**
 *
 * @author Marcel Huber
 */
public class MenschReal {

    // ein realer Mensch kann nur dann erzeugt werden, wenn er ein Datenobjekt zur Verfügung hat
    // dieses soll also nicht "null" sein - daher der Konstruktor private und die 
    // entsprechende getInstance()-Methode, die das prüft und ggf. eine Exception wirft
    public MenschReal(MenschDatenKonkret mdk) {
        // so wird hier implizit immer der gleiche Fehler auftreten wie in der getInstance()-Methode
        // VORSICHT: Ohne if (mdk == null){...} else{...} landen wir in einer "Endlos-Konstruktion" 
        if (mdk == null) {
            this.menschDaten = MenschReal.getInstance(mdk).getMenschDaten();
        }
        this.menschDaten = mdk;
    }

    static public MenschReal getInstance(MenschDatenKonkret mdk) {
        // die folgenden zwei auskommentierten Zeilen waren nur zum Debugging
//        System.out.println("getInstance: " + mdk);
//        PressEnter.toContinue();
        if (mdk == null) {
//            mdk = new MenschDatenKonkret.Builder().build();
            throw new MenschRealCannotBeInitiatedException();
        }
        return new MenschReal(mdk);
    }

    private MenschDatenKonkret menschDaten;
    // für Adresse später noch getter()/setter() einbauen
    private AdressDaten adresse;

    public MenschDatenKonkret getMenschDaten() {
        return menschDaten;
    }

    public void setMenschDaten(MenschDatenKonkret menschDaten) {
        this.menschDaten = menschDaten;
    }

    public String toString() {
        // Hinweis: später noch Adresse und ggf. andere Attribute dranhängen
        String returnString = "Realer Mensch, meine Daten: (<-- in der toString()-Methode der MenschReal-Klasse!!)\n"
                + menschDaten.toString();
        return returnString;
    }
}
