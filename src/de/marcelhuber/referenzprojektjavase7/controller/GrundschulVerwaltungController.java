package de.marcelhuber.referenzprojektjavase7.controller;

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

        // TODO
    }

    public void getMenschDatenKonret() {
    }

    public void showView() {
        this.gsVView.showView();
    }
}
