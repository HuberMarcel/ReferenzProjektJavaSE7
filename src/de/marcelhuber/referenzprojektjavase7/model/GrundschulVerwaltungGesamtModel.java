package de.marcelhuber.referenzprojektjavase7.model;

import de.marcelhuber.referenzprojektjavase7.dao.MySQLMenschRealDatenDao;
import de.marcelhuber.referenzprojektjavase7.datensatzklasse.*;
import java.util.*;

/**
 *
 * @author Marcel Huber
 */
public class GrundschulVerwaltungGesamtModel extends Observable {

    private MenschReal menschReal;
    private MenschDatenKonkret menschDatenKonkret;
    private GrundschulLehrer grundschulLehrer;
    private GrundschulLehrerDaten grundschulLehrerDaten;
    private AdressDaten adressDaten;
    private MySQLMenschRealDatenDao menschRealDatenDao;

    public MenschReal getMenschReal() {
        return menschReal;
    }

    public void setMenschReal(MenschReal menschReal) {
        this.menschReal = menschReal;
    }

    public MenschDatenKonkret getMenschDatenKonkret() {
        return menschDatenKonkret;
    }

    public void setMenschDatenKonkret(MenschDatenKonkret menschDatenKonkret) {
        this.menschDatenKonkret = menschDatenKonkret;
    }

    public GrundschulLehrer getGrundschulLehrer() {
        return grundschulLehrer;
    }

    public void setGrundschulLehrer(GrundschulLehrer grundschulLehrer) {
        this.grundschulLehrer = grundschulLehrer;
    }

    public GrundschulLehrerDaten getGrundschulLehrerDaten() {
        return grundschulLehrerDaten;
    }

    public void setGrundschulLehrerDaten(GrundschulLehrerDaten grundschulLehrerDaten) {
        this.grundschulLehrerDaten = grundschulLehrerDaten;
    }

    public AdressDaten getAdressDaten() {
        return adressDaten;
    }

    public void setAdressDaten(AdressDaten adressDaten) {
        this.adressDaten = adressDaten;
    }

    public void saveMenschDatenKonkret(MenschDatenKonkret mdk){
        // Speichern der MenschDaten in die Datenbank über das DAO
        // falls Speichern fehlschlägt (bspw. Verbindungsabbruch unerwartet)
        // --> menschDatenKonkret = null setzen, sonst menschDatenKonkret = mdk
        benachrichtige();
    }
    
    private void benachrichtige() {
        setChanged();
        notifyObservers(menschDatenKonkret);
        // wenn speichern fehlschlägt --> menschDatenKonkret = null
    }
}
