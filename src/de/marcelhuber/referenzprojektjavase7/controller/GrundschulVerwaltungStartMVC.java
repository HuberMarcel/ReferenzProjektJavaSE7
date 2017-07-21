// diese Klasse dient für den Start des Programms, gemäß des MVC-Modells
package de.marcelhuber.referenzprojektjavase7.controller;
// Hinweis: Nachfragen, ob diese "Starklasse" in ein eigenes Package gehört
//          bzw. ausgelagert bzgl. der M-V-C packages...
//          nach Rückfrage: Kann im Package für den Controller bleiben

import de.marcelhuber.referenzprojektjavase7.model.GrundschulVerwaltungGesamtModel;
import de.marcelhuber.referenzprojektjavase7.view.*;
import de.marcelhuber.referenzprojektjavase7.view.GrundschulVerwaltungView;

/**
 *
 * @author Marcel Huber
 * letzte Änderung: 21.07.2017
 */
public class GrundschulVerwaltungStartMVC {

    private GrundschulVerwaltungGesamtModel gsVmodel;
    private GrundschulVerwaltungView gsVView;
    private GrundschulVerwaltungController gsVController;

    public static void main(String[] args) {
        new GrundschulVerwaltungStartMVC().go();
    }

    private void go() {
        gsVmodel = new GrundschulVerwaltungGesamtModel();
        gsVView = getView();
        gsVController = new GrundschulVerwaltungController(gsVmodel, gsVView);
//
        gsVController.showView();
    }

    private GrundschulVerwaltungView getView() {
//        return new GrundschulVerwaltungGUI();
//        return new GrundschulVerwaltungGUI02();
//        return new GrundschulVerwaltungGUI03();
        return new GrundschulVerwaltungGUI04();
    }

}
