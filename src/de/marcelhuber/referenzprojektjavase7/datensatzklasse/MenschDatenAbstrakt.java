// die Klasse der abstrakten Daten, die unseres Erachtens hier einen 
// Menschen (im Wesentlichen) charakterisieren
package de.marcelhuber.referenzprojektjavase7.datensatzklasse;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Marcel Huber
 * letzte Änderung: 02.08.2017
 */
public abstract class MenschDatenAbstrakt {

    private String geburtsname;         // Pflichtfeld
    private String familienname;        // Pflichtfeld
    private String vorname;             // Pflichtfeld
    private String zweitname;
    private Calendar geburtsDatum;      // Pflichtfeld
    private String separationsZeichen;  // nur hilfreich bei der toString()-Methode
    private Date date;
    private DateFormat df;
    private Locale locale;

    // Initialsierungsblock für das Separationszeichen... und DateFormat inkl. locale
    {
        separationsZeichen = "; ";
//        locale = Locale.CANADA;
//        locale = Locale.ENGLISH;
//        locale = Locale.GERMANY;
//        locale = Locale.UK;
//        locale = new Locale("en", "GB");
//        locale = Locale.US;
//        locale = new Locale("de", "CH");
//        locale = new Locale("de", "AT");
        // die "Lokalität", also "wo befinden wir uns" bzw. welche Sprache 
        // soll verwendet werden
        locale = new Locale("de", "DE");
        // ein Date-Objekt
        df = DateFormat.getDateInstance(DateFormat.MEDIUM, locale);
    }

    // dient nur zu Darstellungszwecken
    public String getSeparationsZeichen() {
        return separationsZeichen;
    }

    public void setSeparationsZeichen(String separationsZeichen) {
        this.separationsZeichen = separationsZeichen;
    }
    // "Ende" für alles, was das Separationszeichen betrifft (abgesehen vom Einsatz in der toString()-Methode) 

    /**
     * der Geburtsname wird zurückgegeben
     * @return geburtsname, der Geburtsname
     */
    public String getGeburtsname() {
        return geburtsname;
    }

    /**
     * der Geburtsname wird gesetzt
     * @param geburtsname, der zu setzende Geburtsname 
     */
    public void setGeburtsname(String geburtsname) {
        this.geburtsname = geburtsname;
    }

    /**
     * der Familienname wird abgeholt
     * @return familienname, der Familienname
     */
    public String getFamilienname() {
        return familienname;
    }

    /**
     * der Familienname wird gesetzt
     * @param familienname, der zu setzende Familienname 
     */
    public void setFamilienname(String familienname) {
        this.familienname = familienname;
    }

    /**
     * der Vorname wird abgeholt
     * @return vorname, der Vorname
     */
    public String getVorname() {
        return vorname;
    }

    /**
     * der Vorname wird gesetzt
     * @param vorname, der zu setzende Vorname 
     */
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    /**
     * der Zweitname wird abgeholt
     * @return zweitname, der abzuholende Zweitname
     */
    public String getZweitname() {
        return zweitname;
    }

    /**
     * der Zweitname wird gesetzt
     * @param zweitname, der zu setzende Zweitname 
     */
    public void setZweitname(String zweitname) {
        this.zweitname = zweitname;
    }

    /**
     * das Geburtsdatum als Calendar-Objekt wird abgeholt
     * @return geburtsDatum, das Geburtsdatum als Calendar-Objekt
     */
    public Calendar getGeburtsDatum() {
        return geburtsDatum;
    }

    /**
      * das Geburtsdatum wird als String abgeholt
     * @return geburtsDatumAsString, das Geburtsdatum als String-Objekt
     */
    public String getGeburtsDatumAsString() {
        String geburtsDatumString = "";
        if (this.geburtsDatum != null) {
            date = this.getGeburtsDatum().getTime();
            geburtsDatumString = df.format(date);
        }
        return geburtsDatumString;
    }

    /**
     * das Geburtsdatum wird durch ein Calendar-Objekt gesetzt
     * @param geburtsDatum, das zu setzende Geburtsdatum
     */
    public void setGeburtsDatum(Calendar geburtsDatum) {
        this.geburtsDatum = geburtsDatum;
    }

    /**
     * liefert das Date-Objekt zurück
     * @return date, das Date-Objekt
     */
    public Date getDate() {
        return date;
    }

    /**
     * setzt das Date-Objekt
     * @param date, das zu setzende Date-Objekt
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * liefert das entsprechende DateFormat-Objekt zurück
     * @return df, das DateFormat-Objekt
     */
    public DateFormat getDf() {
        return df;
    }

    /**
     * setzt das DateFormat Objekt mittels df
     * @param df, das DateFormat-Objekt
     */
    public void setDf(DateFormat df) {
        this.df = df;
    }

    /**
     * Überschreibung der toString()-Methode aus der Klasse Object
     * @return den String mit den Informationen des Objekts, durch die es
     * beschrieben wird
     */
    @Override
    public String toString() {
        String returnString
                = "Vorname: " + this.getVorname() + separationsZeichen;
        if (this.getZweitname() != null && this.getZweitname().length() > 0) {
            returnString += "Zweitname: " + this.getZweitname() + separationsZeichen;
        }
        returnString += "Familienname: " + this.getFamilienname() + separationsZeichen
                + "Geburtsname: " + this.getGeburtsname() + separationsZeichen;
        if (this.geburtsDatum != null) {
            returnString += "Tag der Geburt: " 
                    + getGeburtsDatumAsString() + separationsZeichen;
        }
        return returnString;
    }
}
