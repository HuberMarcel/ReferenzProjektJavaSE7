package de.marcelhuber.referenzprojektjavase7.demos;

import de.marcelhuber.referenzprojektjavase7.datensatzklasse.AdressDaten;
import de.marcelhuber.systemtools.Pause;
import de.marcelhuber.systemtools.PressEnter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marcel Huber
 */
public class AdresseKonstruktorDemo {

    AdressDaten adresse01;
    AdressDaten adresse02;

    public static void main(String[] args) {
        new AdresseKonstruktorDemo().goMitTeleskopkonstruktor01();
        PressEnter.toContinue();
        new AdresseKonstruktorDemo().goMitTeleskopkonstruktor02();
        PressEnter.toContinue();
        new AdresseKonstruktorDemo().goMitTeleskopkonstruktor03();
        PressEnter.toContinue();
        new AdresseKonstruktorDemo().goMitBuilder();
    }

    private void goMitTeleskopkonstruktor01() {
        System.out.println("go1()-Methode".toUpperCase());
        adresse01 = new AdressDaten("Hohensteinstraße", 6, "54294", "Trier");
        System.out.println("Aktueller Stand adresse01\n" + adresse01);
        System.out.println("");
        System.out.println("Entferne Emailadresse \"huberm01\"");
        adresse01.removeEmailadresse("huberm01");
        System.out.println("Aktueller Stand adresse01\n" + adresse01);
        System.out.println("");
        System.out.println("Füge Emailadresse \"huberm01\" hinzu");
        adresse01.addEmailadresse("huberm01");
        System.out.println("Aktueller Stand adresse01\n" + adresse01);
        System.out.println("");
        System.out.println("Füge Emailadresse \"huberm02\" hinzu");
        adresse01.addEmailadresse("huberm02");
        System.out.println("Aktueller Stand adresse01\n" + adresse01);
        System.out.println("");
        System.out.println("Entferne Emailadresse \"huberm01\"");
        adresse01.removeEmailadresse("huberm01");
        System.out.println("Aktueller Stand adresse01\n" + adresse01);
        System.out.println("");
        System.out.println("Entferne Emailadresse \"huberm02\"");
        adresse01.removeEmailadresse("huberm02");
        System.out.println("Aktueller Stand adresse01\n" + adresse01);
        System.out.println("");
        System.out.println("Füge Telefonnummer \"06501825\" hinzu");
        adresse01.addTelefonnummer("06501825");
        System.out.println("Aktueller Stand adresse01\n" + adresse01);
        System.out.println("");
        System.out.println("Füge Emailadresse \"huberm02\" hinzu");
        adresse01.addEmailadresse("huberm02");
        System.out.println("Aktueller Stand adresse01\n" + adresse01);
        System.out.println("");
        System.out.println("Füge Telefonnummer \"06501833\" hinzu");
        adresse01.addTelefonnummer("06501833");
        System.out.println("Aktueller Stand adresse01\n" + adresse01);
        System.out.println("");
        System.out.println("Entferne Telefonnummer \"06501825\"");
        adresse01.removeTelefonnummer("06501825");
        System.out.println("Aktueller Stand adresse01\n" + adresse01);
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }

    private void goMitTeleskopkonstruktor02() {
        System.out.println("go2()-Methode".toUpperCase());
        List<String> telefonnummern = new ArrayList<>();
        telefonnummern.add("06501456");
        telefonnummern.add("06501444");
        telefonnummern.add("06501999");
        adresse01 = new AdressDaten("Hohensteinstraße", 6, "54294", "Trier",
                telefonnummern);
        System.out.println("Aktueller Stand adresse01\n" + adresse01);
        System.out.println("");
        System.out.println("Füge Emailadresse \"huberm01go02()\" hinzu");
        adresse01.addEmailadresse("huberm01go02()");
        System.out.println("Aktueller Stand adresse01\n" + adresse01);
        System.out.println("");
        System.out.println("Entferne die Telefonnummer \"06501444\"");
        adresse01.removeTelefonnummer("06501444");
        System.out.println("Aktueller Stand adresse01\n" + adresse01);
        System.out.println("");
        System.out.println("Wir ändern den Namen der Strasse "
                + adresse01.getStrasse() + " zu Hornstraße");
        adresse01.setStrasse("Hornstraße");
        System.out.println("Aktueller Stand adresse01\n" + adresse01);
        System.out.println("");
        System.out.println("Damit man nicht von der Adresse losgelöst die "
                + "zugehörigen Emailadressen bearbeiten kann,\n"
                + "bekommt man sie mit dem getter als unmodifiableList:");
        System.out.println("");
        System.out.println("Verboten: ");
        System.out.println("List<String> emailadressenVonAdress01 = adresse01.getEmailadressen();\n"
                + "emailadressenVonAdress01.add(\"Hugo\");\n");
        List<String> emailadressenVonAdress01 = adresse01.getEmailadressen();
        try {
            emailadressenVonAdress01.add("Hugo");
        } catch (UnsupportedOperationException ex) {
            long waitingTime = System.currentTimeMillis() + 2000;
            while (true) {
                System.out.print(". ");
                Pause.breakInMillis(500);
                if (System.currentTimeMillis() > waitingTime) {
                    break;
                }
            }
            System.out.println("");
            System.err.println("add ist auf einer \"unmodifiabel List\" verboten, Exception: "
                    + ex);
            System.out.println("");
            Pause.breakInMillis(200);
        }
        System.out.println("Erlaubt:");
        System.out.println("adresse01.addEmailadresse(\"Hugo\");\n");
        adresse01.addEmailadresse("Hugo");
        System.out.println("Aktueller Stand adresse01\n" + adresse01);
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }

    private void goMitTeleskopkonstruktor03() {
        System.out.println("go3()-Methode".toUpperCase());
        List<String> telefonnummern = new ArrayList<>();
        telefonnummern.add("06501456");
        telefonnummern.add("06501444");
        telefonnummern.add("06501999");
        List<String> emailadressen = new ArrayList<>();
        emailadressen.add("huberm01");
        emailadressen.add("huberm02");
        emailadressen.add("huberm03");
        adresse01 = new AdressDaten("Hohensteinstraße", 6, "54294", "Trier",
                telefonnummern, emailadressen);
        System.out.println("Aktueller Stand adresse01\n" + adresse01);
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }

    private void goMitBuilder() {
        System.out.println("go3()-Methode mit Builder".toUpperCase());
        List<String> telefonnummern = new ArrayList<>();
        telefonnummern.add("06501456");
        telefonnummern.add("06501444");
        telefonnummern.add("06501999");
        List<String> emailadressen = new ArrayList<>();
        emailadressen.add("huberm01");
        emailadressen.add("huberm02");
        emailadressen.add("huberm03");
        adresse01 = new AdressDaten.Builder("Hohensteinstraße", 6, "54294", "Trier")
                .emailadressen(emailadressen).build();
        System.out.println("Aktueller Stand adresse01\n" + adresse01);
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }

}
