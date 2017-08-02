// in/mit dieser Klasse werden alle für einen Menschen als hier relevant erachteten
// Daten verwaltet
package de.marcelhuber.referenzprojektjavase7.datensatzklasse;

//import com.sun.javafx.UnmodifiableArrayList;
import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Marcel Huber
 * letzte Änderung: 02.08.2017
 */
public class AdressDaten {

    private String strasse;                 // Pflichtattribut (Kürzel im Folgenden: PA)
    private long hausnummer = -1;           // PA
    private String postleitzahl;            // PA: als String gewählt, da es in manchen Ländern spezifisch ist
    private String wohnort;                 // PA
    private List<String> telefonnummern;
    // aufgrund der "möglichen String-Länge" als String gewählt
    // mehrere Telefonnummern möglich (Handy, Arbeit, privat, ...)
    // evtl. kann man auch 'ne Map oder sowas wählen...
    private List<String> emailadressen;     // PA: mehrere Emailadresse möglich 

    // 1. Möglichkeit: Teleskopkonstruktor
//    public AdressDaten(String strasse) {
//        this.strasse = strasse;
//    }
//
//    public AdressDaten(String strasse, long hausnummer) {
//        this(strasse);
//        this.hausnummer = hausnummer;
//    }
//
//    public AdressDaten(String strasse, long hausnummer, String postleitzahl) {
//        this(strasse, hausnummer);
//        this.postleitzahl = postleitzahl;
//    }
    public AdressDaten(String strasse, long hausnummer, String postleitzahl,
            String wohnort) {
//        this(strasse, hausnummer,postleitzahl);
        this.strasse = strasse;
        this.hausnummer = hausnummer;
        this.postleitzahl = postleitzahl;
        this.wohnort = wohnort;
    }

    public AdressDaten(String strasse, long hausnummer, String postleitzahl,
            String wohnort, List<String> telefonnummern) {
        this(strasse, hausnummer, postleitzahl, wohnort);
        this.telefonnummern = telefonnummern;
    }

    public AdressDaten(String strasse, long hausnummer, String postleitzahl,
            String wohnort, List<String> telefonnummern, List<String> emailadressen) {
        this(strasse, hausnummer, postleitzahl, wohnort, telefonnummern);
        this.emailadressen = emailadressen;
    }
    // Ende der 1. Möglichkeit (Teleskopkonstruktor)

    // 2. Möglichkeit: Mit Builder (static nested class)
    private AdressDaten(Builder builder) {
        this.strasse = builder.strasse;
        this.hausnummer = builder.hausnummer;
        this.postleitzahl = builder.postleitzahl;
        this.wohnort = builder.wohnort;
        this.telefonnummern = builder.telefonnummern;
        this.emailadressen = builder.emailadressen;
    }

    public static class Builder {

        private String strasse;                 // Pflichtattribut (Kürzel im Folgenden: PA)
        private long hausnummer;                // PA
        private String postleitzahl;            // PA: als String gewählt, da es in manchen Ländern spezifisch ist
        private String wohnort;                 // PA
        private List<String> telefonnummern;
        // aufgrund der "möglichen String-Länge" als String gewählt
        // mehrere Telefonnummern möglich (Handy, Arbeit, privat, ...)
        // evtl. kann man auch 'ne Map oder sowas wählen...
        private List<String> emailadressen;     // PA: mehrere Emailadresse möglich 

        public Builder(String strasse, long hausnummer,
                String postleitzahl, String wohnort) {
            this.strasse = strasse;
            this.hausnummer = hausnummer;
            this.postleitzahl = postleitzahl;
            this.wohnort = wohnort;
        }

        public Builder telefonnummern(List<String> telefonnummern) {
            this.telefonnummern = telefonnummern;
            return this;
        }

        public Builder emailadressen(List<String> emailadressen) {
            this.emailadressen = emailadressen;
            return this;
        }

        public AdressDaten build() {
            if (this.strasse == null) {
                throw new IllegalArgumentException("Stasse ist Pflichtpfeld");
            }
            if (this.hausnummer == -1) {
                throw new IllegalArgumentException("Hausnummer ist Pflichtpfeld");
            }
            if (this.postleitzahl == null) {
                throw new IllegalArgumentException("Postleitzahl ist Pflichtpfeld");
            }
            if (this.wohnort == null) {
                throw new IllegalArgumentException("Wohnort ist Pflichtpfeld");
            }
            return new AdressDaten(this);
        }

    }
    //

    /**
     * @return the strasse
     */
    public String getStrasse() {
        return strasse;
    }

    /**
     * @param strasse the strasse to set
     */
    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    /**
     * @return the hausnummer
     */
    public long getHausnummer() {
        return hausnummer;
    }

    /**
     * @param hausnummer the hausnummer to set
     */
    public void setHausnummer(long hausnummer) {
        this.hausnummer = hausnummer;
    }

    /**
     * @return the postleitzahl
     */
    public String getPostleitzahl() {
        return postleitzahl;
    }

    /**
     * @param postleitzahl the postleitzahl to set
     */
    public void setPostleitzahl(String postleitzahl) {
        this.postleitzahl = postleitzahl;
    }

    /**
     * @return the wohnort
     */
    public String getWohnort() {
        return wohnort;
    }

    /**
     * @param wohnort the wohnort to set
     */
    public void setWohnort(String wohnort) {
        this.wohnort = wohnort;
    }

    /**
     * @return the telefonnummern - unmodifiable
     */
    public List<String> getTelefonnummern() {
        // wichtig: UnmodifiableArrayList zurückgeben!
        return Collections.unmodifiableList(telefonnummern);
    }

    /**
     * @param telefonnummern the telefonnummern to set
     */
    public void setTelefonnummern(List<String> telefonnummern) {
        this.telefonnummern = telefonnummern;
    }

    /**
     * @return the emailadressen - unmodifiable
     */
    public List<String> getEmailadressen() {
        // wichtig: UnmodifiableArrayList zurückgeben!
        return Collections.unmodifiableList(emailadressen);
    }

    /**
     * @param emailadressen the emailadressen to set
     */
    public void setEmailadressen(List<String> emailadressen) {
        this.emailadressen = emailadressen;
    }

    /**
     * eine Emailadresse wird hinzugefügt
     * @param emailadresse die Emailadresse, die hinzugefügt werden soll
     */
    public void addEmailadresse(String emailadresse) {
        if (emailadressen == null) {
            emailadressen = new ArrayList<>();
        }
        emailadressen.add(emailadresse);
    }

    /**
     * eine Emailadresse wird entfernt
     * @param emailadresse die Emailadresse, die entfernt werden soll
     */
    public void removeEmailadresse(String emailadresse) {
        if (emailadressen != null) {
            emailadressen.remove(emailadresse);
        }
    }

    /**
     * eine Telefonnummer wird hinzugefügt
     * @param telefonnummer die Telefonnummer, die hinzugefügt werden soll
     */
    public void addTelefonnummer(String telefonnummer) {
        if (telefonnummern == null) {
            telefonnummern = new ArrayList<>();
        }
        telefonnummern.add(telefonnummer);
    }

    /**
     * Entfernen einer Telefonnummer
     * @param telefonnummer die Telefonnummer, die zu entfernen ist
     */
    public void removeTelefonnummer(String telefonnummer) {
        if (telefonnummern != null) {
            telefonnummern.remove(telefonnummer);
        }
    }

    /**
     * typische toString()-Methode
     * @return die Informationen, die das Objekt beschreiben, in einem String
     */
    @Override
    public String toString() {
        String adressenInformationen;
        adressenInformationen = "Straße: " + strasse
                + "; Hausnummer: " + hausnummer
                + "; PLZ: " + postleitzahl
                + "; Wohnort: " + wohnort;
        if (telefonnummern != null && telefonnummern.size() > 0) {
            adressenInformationen += "\nTelefonnummern: " + telefonnummern;
        }
        if (emailadressen != null && emailadressen.size() > 0) {
            adressenInformationen += "\nEmail-Adressen: " + emailadressen;
        }
        return adressenInformationen;
    }
}
