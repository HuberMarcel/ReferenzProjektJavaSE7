package de.marcelhuber.referenzprojektjavase7.datensatzklasse;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Marcel Huber
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
        locale = new Locale("de", "DE");
        df = DateFormat.getDateInstance(DateFormat.MEDIUM, locale);
    }

    public String getSeparationsZeichen() {
        return separationsZeichen;
    }

    public void setSeparationsZeichen(String separationsZeichen) {
        this.separationsZeichen = separationsZeichen;
    }
    // "Ende" für alles, was das Separationszeichen betrifft (abgesehen vom Einsatz in der toString()-Methode) 

    public String getGeburtsname() {
        return geburtsname;
    }

    public void setGeburtsname(String geburtsname) {
        this.geburtsname = geburtsname;
    }

    public String getFamilienname() {
        return familienname;
    }

    public void setFamilienname(String familienname) {
        this.familienname = familienname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getZweitname() {
        return zweitname;
    }

    public void setZweitname(String zweitname) {
        this.zweitname = zweitname;
    }

    public Calendar getGeburtsDatum() {
        return geburtsDatum;
    }

    public String getGeburtsDatumAsString() {
        String geburtsDatumString = "";
        if (this.geburtsDatum != null) {
            date = this.getGeburtsDatum().getTime();
            geburtsDatumString = df.format(date);
        }
        return geburtsDatumString;
    }

    public void setGeburtsDatum(Calendar geburtsDatum) {
        this.geburtsDatum = geburtsDatum;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public DateFormat getDf() {
        return df;
    }

    public void setDf(DateFormat df) {
        this.df = df;
    }

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
