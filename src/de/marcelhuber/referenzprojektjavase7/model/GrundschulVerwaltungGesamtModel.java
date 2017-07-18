package de.marcelhuber.referenzprojektjavase7.model;

import de.marcelhuber.referenzprojektjavase7.dao.MySQLMenschRealDatenDao;
import de.marcelhuber.referenzprojektjavase7.daointerface.InterfaceMenschRealDatenDao;
import de.marcelhuber.referenzprojektjavase7.datensatzklasse.*;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    private InterfaceMenschRealDatenDao menschRealDatenDao;
    private int minimalAlter;
    private int maximalAlter;
    private Integer alter;

    {
        minimalAlter = 0;
        maximalAlter = 79;
    }

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

    public boolean saveMenschDatenKonkret(MenschDatenKonkret mdk) {
        // Speichern der MenschDaten in die Datenbank über das DAO
        // falls Speichern fehlschlägt (bspw. Verbindungsabbruch unerwartet)
        // --> menschDatenKonkret = null setzen, sonst menschDatenKonkret = mdk
        if (menschRealDatenDao == null) {
            menschRealDatenDao = new MySQLMenschRealDatenDao();
        }
        if (menschRealDatenDao.create(mdk) == 0) {
            return false;
        } else {
            benachrichtige();
            return true;
        }
    }

    private void benachrichtige() {
        setChanged();
        notifyObservers(menschDatenKonkret);
        // wenn speichern fehlschlägt --> menschDatenKonkret = null
    }

    public boolean birthdayIsChecked(Calendar geburtsdatum) {
        boolean birthdayIsChecked = true;
        MenschDatenKonkret mdkDummy = new MenschDatenKonkret("mdkDummyGeburtsname",
                "mdkDummyFamilienname", "mdkDummyVorname", geburtsdatum);
//        PressEnter.toContinue();
//        System.out.println(mdkDummy);
        String geburtsdatumString = mdkDummy.getGeburtsDatumAsString();
        System.out.println("birthdayIsChecked in GrundschulVerwaltungGesamtModel, "
                + "Geburtsdatum als String : "
                + geburtsdatumString);
        // die Methode wird insbesondere aufgerufen, nachdem das Textfeld
        // jFormattedTextMenschGeburtsdatum einen neuen Eintrag hat
        // danach muss geburtsdatum aktualisiert werden - das geschieht in der
        // direkt folgenden Zeile!!
//        geburtsdatum = jFormattedTextMenschGeburtsdatum.getText();
        // hier wollen wir abfragen, ob das Alter der Person realistisch ist
        // sagen wir: es sollte zwischen 0 und 80 Jahren sein
        // später eventuell mal konkretere Abfragen:
        // maximales Alter Grunschüler, Lehrer, ...
        Date date = new Date();
        DateFormat df = DateFormat.getDateInstance();
        String heutigesDatum = df.format(date);
//        System.out.println(heutigesDatum);
//        System.out.println(geburtsdatum);
        String[] aDaysInformationsAsStrings = heutigesDatum.split("\\.");
        int[] todaysInformations = new int[aDaysInformationsAsStrings.length];
        for (int k = 0; k < aDaysInformationsAsStrings.length; k++) {
            todaysInformations[k] = Integer.parseInt(aDaysInformationsAsStrings[k]);
        }
//        System.out.println(Arrays.toString(todaysInformations));
        if (geburtsdatumString.length() == 0) {
            return birthdayIsChecked = false;
        }
        aDaysInformationsAsStrings = geburtsdatumString.split("\\.");
        int[] birthdayInformations = new int[aDaysInformationsAsStrings.length];
        for (int k = 0; k < aDaysInformationsAsStrings.length; k++) {
            birthdayInformations[k] = Integer.parseInt(aDaysInformationsAsStrings[k]);
        }
        if (birthdayInformations.length != todaysInformations.length) {
            return birthdayIsChecked = false;
        }
//        System.out.println(Arrays.toString(birthdayInformations));
        int lastIndex = birthdayInformations.length - 1;
        // lastIndex zeigt die Jahreszahlen an
        alter = todaysInformations[lastIndex] - birthdayInformations[lastIndex];
        lastIndex--;
        // lastIndex zeigt jetzt die Monatszahlen an (0-basiert)
        if (todaysInformations[lastIndex] < birthdayInformations[lastIndex]) {
            --alter;
        } else if (todaysInformations[lastIndex] == birthdayInformations[lastIndex]) {
            lastIndex--;
            // lastIndex zeigt nun die Tage an
            if (todaysInformations[lastIndex] < birthdayInformations[lastIndex]) {
                --alter;
            }
        }
        // momentan sagen wir, dass es keine Personen über 50 an der Schule geben wird
        if (alter < minimalAlter || alter > maximalAlter) {
            birthdayIsChecked = false;
            System.err.println("Alter: " + alter);
        } else {
//            birthdayIsChecked = true;
            System.out.println("Alter: " + alter);
        }
//        System.out.println("birthdayIsChecked: " + birthdayIsChecked);
//        System.out.println("Alter: " + alter);
        return birthdayIsChecked;
    }

    public int getAlter() {
        return alter;
    }

    public InterfaceMenschRealDatenDao getMenschRealDatenDao() {
        if (menschRealDatenDao == null) {
            menschRealDatenDao = new MySQLMenschRealDatenDao();
        }
        return menschRealDatenDao;
    }

    public void resetMenschRealDatenDao() {
        menschRealDatenDao = new MySQLMenschRealDatenDao();
    }

    public boolean checkConnection() {
        try {
            System.out.println(((MySQLMenschRealDatenDao) menschRealDatenDao).getConnection().isValid(500));
        } catch (SQLException ex) {
            Logger.getLogger(GrundschulVerwaltungGesamtModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (!(((MySQLMenschRealDatenDao) menschRealDatenDao).getConnectionIsValid())) {
            return false;
        }
        return true;
    }
}
