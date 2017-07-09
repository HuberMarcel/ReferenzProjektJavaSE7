package de.marcelhuber.referenzprojektjavase7.controller;

import de.marcelhuber.referenzprojektjavase7.datensatzklasse.MenschDatenKonkret;
import de.marcelhuber.referenzprojektjavase7.model.*;
import de.marcelhuber.referenzprojektjavase7.view.*;
import java.util.*;

/**
 *
 * @author Marcel Huber
 */
public class GrundschulVerwaltungController implements Observer {

    private GrundschulVerwaltungGesamtModel gsVgModel;
    private GrundschulVerwaltungView gsVView;

    // MVC mit main()-Klasse als Starter (im OCP-Bsp.)
    public GrundschulVerwaltungController(GrundschulVerwaltungGesamtModel gsVgModel,
            GrundschulVerwaltungView gsVView) {
        this.gsVgModel = gsVgModel;
        this.gsVView = gsVView;
        gsVView.setController(this);
        gsVgModel.addObserver(this);
    }

    // Bei anzeigewürdigen neuen Daten --> Model entscheidet
    public void update(Observable o, Object arg) {
        // Das Objekt arg wird aus "notifyObservers(...)" mit übergeben
        // Falls Typ MenschDatenKonkret und == null --> Fehleranzeige, 
        // dass das Speichern nicht funktioniert hat
        // 1. Prüfe, was hat sich geändert
        // TODO
    }

    public boolean checkTheBirthdayInformations() {
        return gsVgModel.birthdayIsChecked(gsVView.getGeburtsdatum());
    }

    public Integer getAlterFromModell() {
        return gsVgModel.getAlter();
    }

    public void getMenschDatenKonkret() {
        // Controller erzeugt Menschobjekt (MenschDaten) 
        // Controller ruft das Modell auf, und gibt Befehl zum Speichern
        // Modell prüft inhaltliche Korrektheit, nicht View
        // 
////        Die folgenden Zeilen sind wegen Umstrukturierung auskommentiert
//        MenschDatenKonkret mdkFromView = gsVView.getMenschDatenKonkret();
//        System.out.println("Controller: Ich lasse mal das Modell checken, ob "
//                + "das Geburtsdatum sinnig (>= minimalAlter und <= maximalAlter) ist):");
//        System.out.println("Controller: Habe folgende Menschdaten abgeholt: " + mdkFromView);
////        System.out.println("Controller Geburtsdatum: " + gsVView.getGeburtsdatum());
//        System.out.println("Das Model checkt, ob das Geburtsdatum sinnig ist "
//                + "(d.h., ob das Alter im Bereich [minimalAlter, maximalAlter]\n"
//                + "(die zugehörigen Werte findet man im Model)) ist. "
//                + "Analyse-Ergebnis: ");
////        if (!checkTheBirthdayInformations()) {
//        System.out.println(gsVgModel.birthdayIsChecked(gsVView.getGeburtsdatum()));
//        } else {
//            System.out.println(gsVgModel.birthdayIsChecked(gsVView.getGeburtsdatum()));
//            // jetzt haben können wir das Model beauftragen, das DAO zu erzeugen und die 
//            // Daten in der Datenbank abzulegen
//        }

//        gsVgModel.saveMenschDatenKonkret(gsVView.getMenschDatenKonkret());
        MenschDatenKonkret mdk;
        mdk = gsVView.getMenschDatenKonkret();
        System.out.println("Controller (getMenschDatenKonkret) - fixe Daten:");
        System.out.println(mdk);
        System.out.println("Controller (getMenschDatenKonkret) - Alter:\n"
                + getAlterFromModell());
    }

    public void showView() {
        this.gsVView.showView();
    }
}
