package de.marcelhuber.referenzprojektjavase7.datensatzklasse;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Marcel Huber
 */
public class MenschDatenKonkret extends MenschDatenAbstrakt implements Cloneable {

    // diese Klasse dient dazu, einen MenschBuilder zu implementieren
    static public class Builder {

        // Wir benötigen die gleichen Attribute wie in der MenschDatenAbstrakt-Klasse
        private String geburtsname;
        private String familienname;
        private String vorname;
        private String zweitname;

        // der Zweitname ist optional, wir wollen später aber keine
        // null-Einträge in die DB schreiben; daher initialisieren wir
        // ihn immer als leeren String
        {
            zweitname = "";
        }
        // wichtig: beim Geburtsdatum bei clone() beim Geburtsdatum ein neues Objekt rausgeben!!
        //          sonst kann das kopierte Onjekt mit dem getter auf das
        //          gleiche Objekt wie das ursprüngliche zugreifen, und jede Veränderung
        //          wirkt sich auf beide aus - die Kopie ist dann nur teilweise eine Kopie
        private Calendar geburtsDatum;

        public Builder geburtsname(String geburtsname) {
            this.geburtsname = geburtsname;
            return this;
        }

        public Builder familienname(String familienname) {
            this.familienname = familienname;
            return this;
        }

        public Builder vorname(String vorname) {
            this.vorname = vorname;
            return this;
        }

        public Builder zweitname(String zweitname) {
            this.zweitname = zweitname;
            return this;
        }

        public Builder geburtsDatum(Calendar geburtsDatum) {
            this.geburtsDatum = geburtsDatum;
            return this;
        }

        public MenschDatenKonkret build() {
            return new MenschDatenKonkret(this);
        }

    }

    // der Konstruktor für den Builder!
    private MenschDatenKonkret(Builder build) {
//        System.out.println("Ist build == null? " + (build == null));
        this.setGeburtsname(build.geburtsname);
        this.setFamilienname(build.familienname);
        this.setVorname(build.vorname);
        this.setZweitname(build.zweitname);
        this.setGeburtsDatum(build.geburtsDatum);
    }

    // alternativ kann man auch einen vollständigen Konstruktor verwenden
    // nur mit allen Pflichtfeldern
    public MenschDatenKonkret(String geburtsname, String familienname, String vorname,
            Calendar geburtsDatum) {
        this.setGeburtsname(geburtsname);
        this.setFamilienname(familienname);
        this.setVorname(vorname);
        this.setGeburtsDatum(geburtsDatum);
        this.setZweitname("");
    }

    public MenschDatenKonkret(String geburtsname, String familienname, String vorname, String zweitname,
            Calendar geburtsDatum) {
        this(geburtsname, familienname, vorname, geburtsDatum);
        this.setZweitname(zweitname);
    }

//    // Standardkonstruktor
//    public MenschDatenKonkret() {
//    }
//    // diese toString() wurde nun in die abstrakte Klasse verlagert, daher hier ganz auskom    
//    @Override
//    public String toString() {
//        String separationsZeichen = ", ";
//        String returnString
//                = "Vorname: " + this.getVorname() + separationsZeichen;
//        if (this.getZweitname() != null && this.getZweitname().length() > 0) {
//            returnString += "Zweitname: " + this.getZweitname() + separationsZeichen;
//        }
//        returnString += "Familienname: " + this.getFamilienname() + separationsZeichen
//                + "Geburtsname: " + this.getGeburtsname() + separationsZeichen;
//        if (this.getGeburtsDatum() != null) {
//            this.setDate(this.getGeburtsDatum().getTime());
//            returnString += "Tag der Geburt: "
//                    + this.getDf().format(this.getDate()) + separationsZeichen;
//        }
//        return returnString;
//    }
    /**
     *
     * @return @throws CloneNotSupportedException
     */
    @Override
    public Object clone() {
        Object returnObject = null;
        try {
            returnObject = super.clone();
            Calendar geburtsDatumKopie = Calendar.getInstance();
            geburtsDatumKopie.set(
                    this.getGeburtsDatum().get(Calendar.YEAR),
                    this.getGeburtsDatum().get(Calendar.MONTH),
                    this.getGeburtsDatum().get(Calendar.DAY_OF_MONTH)
            );
            this.setGeburtsDatum(geburtsDatumKopie);
        } catch (CloneNotSupportedException cnsex) {
            System.out.println("Exception: " + cnsex);
        }
        return returnObject;
    }

    private Integer id;      // wir brauchen die ID nur später für die DB, deswegen 
    // erlauben wir es generell, dass sie den Wert "null" hat

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
