package de.marcelhuber.referenzprojektjavase7.view;
// TODO: Die ganzen abstrakten Methoden sind zu implementieren
//       Weiterhin: Die Abfrage mit dem Geburtstag bzw. der Test, ob alle Felder
//       sinnvoll gefüllt sind, funktioniert noch nicht korrekt

import de.marcelhuber.referenzprojektjavase7.controller.GrundschulVerwaltungController;
import de.marcelhuber.referenzprojektjavase7.datensatzklasse.MenschDatenKonkret;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JTextField;

/**
 *
 * @author Marcel Huber
 */
public class GrundschulVerwaltungGUI02 extends javax.swing.JFrame implements GrundschulVerwaltungView {

    private LoginDialog loginDialog;

    private boolean showjPanelDirektor;
    private boolean showjPanelFixMensch;
    private MenschDatenKonkret mdk;
    private String geburtsname;
    private String familienname;
    private String vorname;
    private String zweitname;
    private String geburtsdatum;
    private String heutigesDatum;
    private Byte textfeldNummer;
    private Date date;
    private DateFormat df;
    private String[] aDaysInformationsAsStrings;
    private int[] todaysInformations;
    private int[] birthdayInformations;
    private Integer alter;
    private int minimalAlter;
    private int maximalAlter;
    private List<JTextField> alljTextFields;

    {
        minimalAlter = 0;
        maximalAlter = 79;
    }

    /**
     * Creates new form GrundschulVerwaltungGUI01
     */
    public GrundschulVerwaltungGUI02() {
        initComponents();
        alljTextFields = new ArrayList<>();
        fillAlljTextFields();
        setShowjPanelDirektor(false);
        setShowjPanelFixMensch(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFixMensch = new javax.swing.JPanel();
        jTextGeburtsname = new javax.swing.JTextField();
        jLabelGeburtsname = new javax.swing.JLabel();
        jLabelFamilienname = new javax.swing.JLabel();
        jTextFamilienname = new javax.swing.JTextField();
        jLabelVorname = new javax.swing.JLabel();
        jTextVorname = new javax.swing.JTextField();
        jLabelZweitname = new javax.swing.JLabel();
        jTextZweitname = new javax.swing.JTextField();
        jLabelGeburtsdatum = new javax.swing.JLabel();
        jFormattedTextMenschGeburtsdatum = new javax.swing.JFormattedTextField();
        jPanelDirektor = new javax.swing.JPanel();
        jScrollPanelDirektor = new javax.swing.JScrollPane();
        jListUnterrichtsfaecher = new javax.swing.JList();
        jCheckBoxUnterrichtsfaecher = new javax.swing.JCheckBox();
        jButtonCreatePerson = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuUserLogin = new javax.swing.JMenu();
        jMenuItemDirektor = new javax.swing.JMenuItem();
        jMenuItemExtern = new javax.swing.JMenuItem();
        jMenuItemLogin = new javax.swing.JMenuItem();
        jMenuOptionales = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Grundschulverwaltungs-Software");

        jTextGeburtsname.setFont(new java.awt.Font("Vani", 0, 16)); // NOI18N
        jTextGeburtsname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextGeburtsnameFocusGained(evt);
            }
        });
        jTextGeburtsname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextGeburtsnameActionPerformed(evt);
            }
        });

        jLabelGeburtsname.setFont(new java.awt.Font("Vani", 0, 16)); // NOI18N
        jLabelGeburtsname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelGeburtsname.setText("Geburtsname");

        jLabelFamilienname.setFont(new java.awt.Font("Vani", 0, 16)); // NOI18N
        jLabelFamilienname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFamilienname.setText("Familienname");

        jTextFamilienname.setFont(new java.awt.Font("Vani", 0, 16)); // NOI18N
        jTextFamilienname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFamiliennameFocusGained(evt);
            }
        });

        jLabelVorname.setFont(new java.awt.Font("Vani", 0, 16)); // NOI18N
        jLabelVorname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelVorname.setText("Vorname");

        jTextVorname.setFont(new java.awt.Font("Vani", 0, 16)); // NOI18N
        jTextVorname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextVornameFocusGained(evt);
            }
        });
        jTextVorname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextVornameActionPerformed(evt);
            }
        });

        jLabelZweitname.setFont(new java.awt.Font("Vani", 0, 16)); // NOI18N
        jLabelZweitname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelZweitname.setText("Zweitname");

        jTextZweitname.setFont(new java.awt.Font("Vani", 0, 16)); // NOI18N
        jTextZweitname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextZweitnameFocusGained(evt);
            }
        });

        jLabelGeburtsdatum.setFont(new java.awt.Font("Vani", 0, 16)); // NOI18N
        jLabelGeburtsdatum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelGeburtsdatum.setText("Geburtsdatum");

        jFormattedTextMenschGeburtsdatum.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM))));
        jFormattedTextMenschGeburtsdatum.setFont(new java.awt.Font("Vani", 0, 16)); // NOI18N
        jFormattedTextMenschGeburtsdatum.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFormattedTextMenschGeburtsdatumFocusGained(evt);
            }
        });

        javax.swing.GroupLayout jPanelFixMenschLayout = new javax.swing.GroupLayout(jPanelFixMensch);
        jPanelFixMensch.setLayout(jPanelFixMenschLayout);
        jPanelFixMenschLayout.setHorizontalGroup(
            jPanelFixMenschLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFixMenschLayout.createSequentialGroup()
                .addGroup(jPanelFixMenschLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelFamilienname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelVorname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelZweitname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelGeburtsname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelGeburtsdatum, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addGroup(jPanelFixMenschLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jFormattedTextMenschGeburtsdatum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
                    .addComponent(jTextZweitname, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextVorname, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFamilienname, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextGeburtsname, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        jPanelFixMenschLayout.setVerticalGroup(
            jPanelFixMenschLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFixMenschLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelFixMenschLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGeburtsname)
                    .addComponent(jTextGeburtsname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelFixMenschLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFamilienname)
                    .addComponent(jTextFamilienname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelFixMenschLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelVorname)
                    .addComponent(jTextVorname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelFixMenschLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelZweitname)
                    .addComponent(jTextZweitname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelFixMenschLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGeburtsdatum)
                    .addComponent(jFormattedTextMenschGeburtsdatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(283, 283, 283))
        );

        jListUnterrichtsfaecher.setFont(new java.awt.Font("Vani", 0, 16)); // NOI18N
        jListUnterrichtsfaecher.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Fach 01", "Fach 02", "Fach 03" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPanelDirektor.setViewportView(jListUnterrichtsfaecher);

        jCheckBoxUnterrichtsfaecher.setFont(new java.awt.Font("Vani", 0, 16)); // NOI18N
        jCheckBoxUnterrichtsfaecher.setText("Unterrichtsfächer");
        jCheckBoxUnterrichtsfaecher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxUnterrichtsfaecherActionPerformed(evt);
            }
        });

        jButtonCreatePerson.setFont(new java.awt.Font("Vani", 0, 16)); // NOI18N
        jButtonCreatePerson.setText("Neue Person anlegen");
        jButtonCreatePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreatePersonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelDirektorLayout = new javax.swing.GroupLayout(jPanelDirektor);
        jPanelDirektor.setLayout(jPanelDirektorLayout);
        jPanelDirektorLayout.setHorizontalGroup(
            jPanelDirektorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDirektorLayout.createSequentialGroup()
                .addGroup(jPanelDirektorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDirektorLayout.createSequentialGroup()
                        .addComponent(jCheckBoxUnterrichtsfaecher, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPanelDirektor))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDirektorLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonCreatePerson)))
                .addContainerGap())
        );
        jPanelDirektorLayout.setVerticalGroup(
            jPanelDirektorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDirektorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDirektorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxUnterrichtsfaecher)
                    .addComponent(jScrollPanelDirektor, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCreatePerson)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuUserLogin.setText("User-Login");

        jMenuItemDirektor.setText("Direktor");
        jMenuItemDirektor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDirektorActionPerformed(evt);
            }
        });
        jMenuUserLogin.add(jMenuItemDirektor);

        jMenuItemExtern.setText("Extern");
        jMenuUserLogin.add(jMenuItemExtern);

        jMenuItemLogin.setText("Login");
        jMenuItemLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLoginActionPerformed(evt);
            }
        });
        jMenuUserLogin.add(jMenuItemLogin);

        jMenuBar1.add(jMenuUserLogin);

        jMenuOptionales.setText("Optionales");

        jMenuItem1.setText("Stundenpläne");
        jMenuOptionales.add(jMenuItem1);

        jMenuBar1.add(jMenuOptionales);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelDirektor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelFixMensch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelFixMensch, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelDirektor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemDirektorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDirektorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemDirektorActionPerformed

    private void jTextGeburtsnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextGeburtsnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextGeburtsnameActionPerformed

    private void jTextVornameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextVornameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextVornameActionPerformed

    private void jCheckBoxUnterrichtsfaecherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxUnterrichtsfaecherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxUnterrichtsfaecherActionPerformed

    private void jButtonCreatePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreatePersonActionPerformed
//        System.out.println("textfeldNummer in jButtonCreatePersonActionPerformed: "
//                + textfeldNummer);
        if (textfeldNummer == null) {
            textfeldNummer = 1;
        }
        if (textfeldNummer != 0) {
            // vielleicht noch Dialogfenster, dass Daten einzutragen sind,
            // ergänzen
            textfeldNummer = checkTheInformations(textfeldNummer);
        }
        if (textfeldNummer == 0) {
            createMenschDatenKonkret();
        }
    }//GEN-LAST:event_jButtonCreatePersonActionPerformed

    private void jMenuItemLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLoginActionPerformed
//        selectAllForAlljTextFields();
        if (loginDialog == null) {
            loginDialog = new LoginDialog(this);
        }

        loginDialog.showDialog();

        if (loginDialog.isLoginOK()) {
            setShowjPanelFixMensch(true);
            jTextGeburtsname.requestFocus();
            setShowjPanelDirektor(true);
            setAlljTextFieldsEnabled();
        } else {
            setShowjPanelFixMensch(true);
            jTextGeburtsname.requestFocus();
            setAlljTextFieldsDisabled();
            setShowjPanelDirektor(false);
        }
    }//GEN-LAST:event_jMenuItemLoginActionPerformed

    private void jTextGeburtsnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextGeburtsnameFocusGained
        jTextGeburtsname.selectAll();
    }//GEN-LAST:event_jTextGeburtsnameFocusGained

    private void jTextFamiliennameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFamiliennameFocusGained
        jTextFamilienname.selectAll();
    }//GEN-LAST:event_jTextFamiliennameFocusGained

    private void jTextVornameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextVornameFocusGained
        jTextVorname.selectAll();
    }//GEN-LAST:event_jTextVornameFocusGained

    private void jTextZweitnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextZweitnameFocusGained
        jTextZweitname.selectAll();
    }//GEN-LAST:event_jTextZweitnameFocusGained

    private void jFormattedTextMenschGeburtsdatumFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextMenschGeburtsdatumFocusGained
        jFormattedTextMenschGeburtsdatum.selectAll();
    }//GEN-LAST:event_jFormattedTextMenschGeburtsdatumFocusGained

    // eigentlich sollte die GUI nur kontrollieren, ob die Einträge OK
    // anderer Methodenname
    // besser: diese Aufgabe dem Controller übergeben, eigentlich darf die 
    //         GUI keine Geschätslogik enthalten
    private void createMenschDatenKonkret() {
//        System.out.println("Alter in createMenschDatenKonkret(): " + alter);
        checkTheInformations((byte) 1);
        // die obige Funktion kann sorgt immer dafür, dass, falls Felder geänder
        // wurden, der neue Eintrag in die MenschDatenKonkret übernommen wird
        // ihr eigentlicher ursprünglicher Sinn war es, leere Felder zu 
        // lokalisieren und zu markieren
        boolean everyTextFieldIsFilled = true;
        if (checkStringAndRequestFocusIfNecessary(jTextGeburtsname).length() == 0) {
            everyTextFieldIsFilled = false;
            checkTheInformations((byte) 1);
        }
        if (checkStringAndRequestFocusIfNecessary(jTextFamilienname).length() == 0) {
            everyTextFieldIsFilled = false;
            checkTheInformations((byte) 2);
        }
        if (checkStringAndRequestFocusIfNecessary(jTextVorname).length() == 0) {
            everyTextFieldIsFilled = false;
            checkTheInformations((byte) 3);
        }
        if (checkStringAndRequestFocusIfNecessary(jTextZweitname).length() == 0) {
            everyTextFieldIsFilled = false;
            checkTheInformations((byte) 4);
        }
        if (checkStringAndRequestFocusIfNecessary(jFormattedTextMenschGeburtsdatum).length() == 0) {
            everyTextFieldIsFilled = false;
            checkTheInformations((byte) 5);
        }
//        Marker.marker();
        if (everyTextFieldIsFilled) {
//            System.out.println(birthdayIsChecked());
            if (birthdayIsChecked()) {
                // kein Objekt erzeugen, sondern Controller informieren
                // Controller die Daten ab, und erzeugt das entsprechende DAO
                // der Rest wird vom DAO erledigt
                mdk = new MenschDatenKonkret.Builder()
                        .geburtsname(geburtsname)
                        .familienname(familienname)
                        .vorname(vorname)
                        .zweitname(zweitname)
                        //                        .geburtsDatum(geburtsdatum) // String in Calendar-Objekt konvertieren
                        .build();
                System.out.println("Menschdaten: " + mdk);
            } else {
//                jFormattedTextMenschGeburtsdatum.setText("");
                // hier sollte vielleicht besser ein Dialogfeld erscheinen,
                // wo angezeigt wird, dass der Geburtstag sicher unsinnig ist
                jFormattedTextMenschGeburtsdatum.requestFocus();
//                jFormattedTextMenschGeburtsdatum.selectAll();
            }
        }
    }

    private boolean birthdayIsChecked() {
        boolean birthdayIsChecked = true;
        // die Methode wird insbesondere aufgerufen, nachdem das Textfeld
        // jFormattedTextMenschGeburtsdatum einen neuen Eintrag hat
        // danach muss geburtsdatum aktualisiert werden - das geschieht in der
        // direkt folgenden Zeile!!
        geburtsdatum = jFormattedTextMenschGeburtsdatum.getText();
        // hier wollen wir abfragen, ob das Alter der Person realistisch ist
        // sagen wir: es sollte zwischen 0 und 80 Jahren sein
        // später eventuell mal konkretere Abfragen:
        // maximales Alter Grunschüler, Lehrer, ...
        date = new Date();
        df = DateFormat.getDateInstance();
        heutigesDatum = df.format(date);
//        System.out.println(heutigesDatum);
//        System.out.println(geburtsdatum);
        aDaysInformationsAsStrings = heutigesDatum.split("\\.");
        todaysInformations = new int[aDaysInformationsAsStrings.length];
        for (int k = 0; k < aDaysInformationsAsStrings.length; k++) {
            todaysInformations[k] = Integer.parseInt(aDaysInformationsAsStrings[k]);
        }
//        System.out.println(Arrays.toString(todaysInformations));
        if (geburtsdatum.length() == 0) {
            return birthdayIsChecked = false;
        }
        aDaysInformationsAsStrings = geburtsdatum.split("\\.");
        birthdayInformations = new int[aDaysInformationsAsStrings.length];
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

    private byte checkTheInformations(byte b) {
        switch (b) {
            case 1:
                geburtsname = checkStringAndRequestFocusIfNecessary(jTextGeburtsname);
                if (geburtsname.length() == 0) {
                    return 1;
                }
//                break;
            case 2:
                familienname = checkStringAndRequestFocusIfNecessary(jTextFamilienname);
                if (familienname.length() == 0) {
                    return 2;
                }
//                break;
            case 3:
                vorname = checkStringAndRequestFocusIfNecessary(jTextVorname);
                if (vorname.length() == 0) {
                    return 3;
                }
//                break;
            case 4:
                zweitname = checkStringAndRequestFocusIfNecessary(jTextZweitname);
                if (zweitname.length() == 0) {
                    return 4;
                }
//                break;
            case 5:
                geburtsdatum = checkStringAndRequestFocusIfNecessary(jFormattedTextMenschGeburtsdatum);
                if (geburtsdatum.length() == 0) {
                    return 5;
                }
            default:
                textfeldNummer = 0;
                return textfeldNummer;
//                throw new AssertionError();
        }
    }

    private String checkStringAndRequestFocusIfNecessary(JTextField textfeld) {
        String eingabeText = textfeld.getText().trim();
        textfeld.setText(eingabeText);
        if (eingabeText.length() == 0) {
            textfeld.requestFocus();
            textfeld.selectAll();
        }
        return eingabeText;
    }

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(GrundschulVerwaltungGUI01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(GrundschulVerwaltungGUI01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(GrundschulVerwaltungGUI01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(GrundschulVerwaltungGUI01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new GrundschulVerwaltungGUI02().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCreatePerson;
    private javax.swing.JCheckBox jCheckBoxUnterrichtsfaecher;
    private javax.swing.JFormattedTextField jFormattedTextMenschGeburtsdatum;
    private javax.swing.JLabel jLabelFamilienname;
    private javax.swing.JLabel jLabelGeburtsdatum;
    private javax.swing.JLabel jLabelGeburtsname;
    private javax.swing.JLabel jLabelVorname;
    private javax.swing.JLabel jLabelZweitname;
    private javax.swing.JList jListUnterrichtsfaecher;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemDirektor;
    private javax.swing.JMenuItem jMenuItemExtern;
    private javax.swing.JMenuItem jMenuItemLogin;
    private javax.swing.JMenu jMenuOptionales;
    private javax.swing.JMenu jMenuUserLogin;
    private javax.swing.JPanel jPanelDirektor;
    private javax.swing.JPanel jPanelFixMensch;
    private javax.swing.JScrollPane jScrollPanelDirektor;
    private javax.swing.JTextField jTextFamilienname;
    private javax.swing.JTextField jTextGeburtsname;
    private javax.swing.JTextField jTextVorname;
    private javax.swing.JTextField jTextZweitname;
    // End of variables declaration//GEN-END:variables

    private GrundschulVerwaltungController gsVController;

    public boolean setGeburtsdatum(Calendar geburtsdatum) {
        boolean geburtsdatumIsAccepted = false;
        // TODO: Genaue Implementierung
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return geburtsdatumIsAccepted;
    }

    @Override
    public void setController(GrundschulVerwaltungController gsVController) {
        this.gsVController = gsVController;
    }

    @Override
    public void showView() {
        setVisible(true);
    }

    @Override
    public void reset() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getGeburtsname() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean setGeburtsname(String geburtsname) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getFamilienname() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean setFamilienname(String familienname) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getVorname() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean setVorname(String vorname) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getZweitname() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean setZweitname(String zweitname) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Calendar getGeburtsdatum() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setShowjPanelDirektor(boolean showjPanelDirektor) {
        this.showjPanelDirektor = showjPanelDirektor;
        jPanelDirektor.setVisible(showjPanelDirektor);
    }

    private void setShowjPanelFixMensch(boolean showjPanelFixMensch) {
        this.showjPanelFixMensch = showjPanelFixMensch;
        jPanelFixMensch.setVisible(showjPanelFixMensch);
    }

    private void setAlljTextFieldsDisabled() {
        for (JTextField jTextField : alljTextFields) {
            jTextField.setEnabled(false);
        }
    }

    private void setAlljTextFieldsEnabled() {
        for (JTextField jTextField : alljTextFields) {
            jTextField.setEnabled(true);
        }
    }

//    private void selectAllForAlljTextFields() {
//        for (JTextField jTextField : alljTextFields) {
//            jTextField.selectAll();
//        }
//    }
    private void fillAlljTextFields() {
        alljTextFields.add(jTextFamilienname);
        alljTextFields.add(jTextGeburtsname);
        alljTextFields.add(jTextVorname);
        alljTextFields.add(jTextZweitname);
        alljTextFields.add(jFormattedTextMenschGeburtsdatum);
    }
}
