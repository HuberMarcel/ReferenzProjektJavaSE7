package de.marcelhuber.referenzprojektjavase7.view;
// TODO: Die ganzen abstrakten Methoden sind zu implementieren

import de.marcelhuber.referenzprojektjavase7.controller.GrundschulVerwaltungController;
import java.util.Calendar;

/**
 *
 * @author Marcel Huber
 */
public class GrundschulVerwaltungGUI01 extends javax.swing.JFrame implements GrundschulVerwaltungView {

    /**
     * Creates new form GrundschulVerwaltungGUI01
     */
    public GrundschulVerwaltungGUI01() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane2 = new javax.swing.JDesktopPane();
        jTabbedPanelGrundschulVerwaltung = new javax.swing.JTabbedPane();
        jPanelGrundschulLehrer = new javax.swing.JPanel();
        jPanelFixGrundschulLehrer = new javax.swing.JPanel();
        jTextGeburtsname = new javax.swing.JTextField();
        jLabelGeburtsname = new javax.swing.JLabel();
        jLabelFamilienname = new javax.swing.JLabel();
        jTextFamilienname = new javax.swing.JTextField();
        jLabelVorname = new javax.swing.JLabel();
        jTextVorname = new javax.swing.JTextField();
        jLabelZweitname = new javax.swing.JLabel();
        jTextZweitname = new javax.swing.JTextField();
        jLabelGeburtsdatum = new javax.swing.JLabel();
        jFormattedTextGeburtsdatum = new javax.swing.JFormattedTextField();
        jScrollPane = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jCheckBox = new javax.swing.JCheckBox();
        jPanelMensch = new javax.swing.JPanel();
        jPanelFixMensch = new javax.swing.JPanel();
        jTextMenschGeburtsname = new javax.swing.JTextField();
        jLabelMenschGeburtsname = new javax.swing.JLabel();
        jLabelMenschFamilienname = new javax.swing.JLabel();
        jTextMenschFamilienname = new javax.swing.JTextField();
        jLabelMenschVorname = new javax.swing.JLabel();
        jTextMenschVorname = new javax.swing.JTextField();
        jLabelMenschZweitname = new javax.swing.JLabel();
        jTextMenschZweitname = new javax.swing.JTextField();
        jLabelMenschGeburtsdatum = new javax.swing.JLabel();
        jFormattedTextMenschGeburtsdatum = new javax.swing.JFormattedTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Grundschulverwaltungs-Software");

        jDesktopPane2.setName(""); // NOI18N

        jTabbedPanelGrundschulVerwaltung.setFont(new java.awt.Font("Vani", 0, 14)); // NOI18N
        jTabbedPanelGrundschulVerwaltung.setName(""); // NOI18N

        jTextGeburtsname.setFont(new java.awt.Font("Vani", 0, 16)); // NOI18N
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

        jLabelVorname.setFont(new java.awt.Font("Vani", 0, 16)); // NOI18N
        jLabelVorname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelVorname.setText("Vorname");

        jTextVorname.setFont(new java.awt.Font("Vani", 0, 16)); // NOI18N
        jTextVorname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextVornameActionPerformed(evt);
            }
        });

        jLabelZweitname.setFont(new java.awt.Font("Vani", 0, 16)); // NOI18N
        jLabelZweitname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelZweitname.setText("Zweitname");

        jTextZweitname.setFont(new java.awt.Font("Vani", 0, 16)); // NOI18N

        jLabelGeburtsdatum.setFont(new java.awt.Font("Vani", 0, 16)); // NOI18N
        jLabelGeburtsdatum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelGeburtsdatum.setText("Geburtsdatum");

        jFormattedTextGeburtsdatum.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM))));
        jFormattedTextGeburtsdatum.setFont(new java.awt.Font("Vani", 0, 16)); // NOI18N

        jList2.setFont(new java.awt.Font("Vani", 0, 16)); // NOI18N
        jList2.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Fach 01", "Fach 02", "Fach 03" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane.setViewportView(jList2);

        jCheckBox.setFont(new java.awt.Font("Vani", 0, 16)); // NOI18N
        jCheckBox.setText("Unterrichtsfächer");

        javax.swing.GroupLayout jPanelFixGrundschulLehrerLayout = new javax.swing.GroupLayout(jPanelFixGrundschulLehrer);
        jPanelFixGrundschulLehrer.setLayout(jPanelFixGrundschulLehrerLayout);
        jPanelFixGrundschulLehrerLayout.setHorizontalGroup(
            jPanelFixGrundschulLehrerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFixGrundschulLehrerLayout.createSequentialGroup()
                .addGroup(jPanelFixGrundschulLehrerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFixGrundschulLehrerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabelGeburtsdatum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelFamilienname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelVorname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelZweitname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelGeburtsname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelFixGrundschulLehrerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(jPanelFixGrundschulLehrerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jFormattedTextGeburtsdatum, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextZweitname, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextVorname, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFamilienname, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextGeburtsname, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE))
                .addContainerGap(223, Short.MAX_VALUE))
        );
        jPanelFixGrundschulLehrerLayout.setVerticalGroup(
            jPanelFixGrundschulLehrerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFixGrundschulLehrerLayout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addGroup(jPanelFixGrundschulLehrerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGeburtsname)
                    .addComponent(jTextGeburtsname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelFixGrundschulLehrerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFamilienname)
                    .addComponent(jTextFamilienname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelFixGrundschulLehrerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelVorname)
                    .addComponent(jTextVorname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelFixGrundschulLehrerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelZweitname)
                    .addComponent(jTextZweitname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelFixGrundschulLehrerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGeburtsdatum)
                    .addComponent(jFormattedTextGeburtsdatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelFixGrundschulLehrerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox))
                .addGap(58, 58, 58))
        );

        javax.swing.GroupLayout jPanelGrundschulLehrerLayout = new javax.swing.GroupLayout(jPanelGrundschulLehrer);
        jPanelGrundschulLehrer.setLayout(jPanelGrundschulLehrerLayout);
        jPanelGrundschulLehrerLayout.setHorizontalGroup(
            jPanelGrundschulLehrerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFixGrundschulLehrer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelGrundschulLehrerLayout.setVerticalGroup(
            jPanelGrundschulLehrerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGrundschulLehrerLayout.createSequentialGroup()
                .addComponent(jPanelFixGrundschulLehrer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        jTabbedPanelGrundschulVerwaltung.addTab("Grundschul-Lehrer", jPanelGrundschulLehrer);

        jTextMenschGeburtsname.setFont(new java.awt.Font("Vani", 0, 16)); // NOI18N
        jTextMenschGeburtsname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextMenschGeburtsnameActionPerformed(evt);
            }
        });

        jLabelMenschGeburtsname.setFont(new java.awt.Font("Vani", 0, 16)); // NOI18N
        jLabelMenschGeburtsname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMenschGeburtsname.setText("Geburtsname");

        jLabelMenschFamilienname.setFont(new java.awt.Font("Vani", 0, 16)); // NOI18N
        jLabelMenschFamilienname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMenschFamilienname.setText("Familienname");

        jTextMenschFamilienname.setFont(new java.awt.Font("Vani", 0, 16)); // NOI18N

        jLabelMenschVorname.setFont(new java.awt.Font("Vani", 0, 16)); // NOI18N
        jLabelMenschVorname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMenschVorname.setText("Vorname");

        jTextMenschVorname.setFont(new java.awt.Font("Vani", 0, 16)); // NOI18N
        jTextMenschVorname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextMenschVornameActionPerformed(evt);
            }
        });

        jLabelMenschZweitname.setFont(new java.awt.Font("Vani", 0, 16)); // NOI18N
        jLabelMenschZweitname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMenschZweitname.setText("Zweitname");

        jTextMenschZweitname.setFont(new java.awt.Font("Vani", 0, 16)); // NOI18N

        jLabelMenschGeburtsdatum.setFont(new java.awt.Font("Vani", 0, 16)); // NOI18N
        jLabelMenschGeburtsdatum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMenschGeburtsdatum.setText("Geburtsdatum");

        jFormattedTextMenschGeburtsdatum.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM))));
        jFormattedTextMenschGeburtsdatum.setFont(new java.awt.Font("Vani", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPanelFixMenschLayout = new javax.swing.GroupLayout(jPanelFixMensch);
        jPanelFixMensch.setLayout(jPanelFixMenschLayout);
        jPanelFixMenschLayout.setHorizontalGroup(
            jPanelFixMenschLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFixMenschLayout.createSequentialGroup()
                .addGroup(jPanelFixMenschLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelMenschGeburtsdatum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelMenschFamilienname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelMenschVorname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelMenschZweitname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelMenschGeburtsname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanelFixMenschLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jFormattedTextMenschGeburtsdatum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                    .addComponent(jTextMenschZweitname, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextMenschVorname, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextMenschFamilienname, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextMenschGeburtsname, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(223, Short.MAX_VALUE))
        );
        jPanelFixMenschLayout.setVerticalGroup(
            jPanelFixMenschLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFixMenschLayout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addGroup(jPanelFixMenschLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMenschGeburtsname)
                    .addComponent(jTextMenschGeburtsname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelFixMenschLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMenschFamilienname)
                    .addComponent(jTextMenschFamilienname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelFixMenschLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMenschVorname)
                    .addComponent(jTextMenschVorname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelFixMenschLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMenschZweitname)
                    .addComponent(jTextMenschZweitname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelFixMenschLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMenschGeburtsdatum)
                    .addComponent(jFormattedTextMenschGeburtsdatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(179, 179, 179))
        );

        javax.swing.GroupLayout jPanelMenschLayout = new javax.swing.GroupLayout(jPanelMensch);
        jPanelMensch.setLayout(jPanelMenschLayout);
        jPanelMenschLayout.setHorizontalGroup(
            jPanelMenschLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFixMensch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelMenschLayout.setVerticalGroup(
            jPanelMenschLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenschLayout.createSequentialGroup()
                .addComponent(jPanelFixMensch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        jTabbedPanelGrundschulVerwaltung.addTab("Mensch", jPanelMensch);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPanelGrundschulVerwaltung)
                .addContainerGap())
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPanelGrundschulVerwaltung)
                .addContainerGap())
        );
        jDesktopPane2.setLayer(jTabbedPanelGrundschulVerwaltung, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTabbedPanelGrundschulVerwaltung.getAccessibleContext().setAccessibleDescription("");

        jMenu1.setText("File");

        jMenuItem2.setText("jMenuItem2");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("jMenu3");

        jMenuItem1.setText("jMenuItem1");
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jDesktopPane2.getAccessibleContext().setAccessibleName("");
        jDesktopPane2.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextVornameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextVornameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextVornameActionPerformed

    private void jTextGeburtsnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextGeburtsnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextGeburtsnameActionPerformed

    private void jTextMenschGeburtsnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextMenschGeburtsnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextMenschGeburtsnameActionPerformed

    private void jTextMenschVornameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextMenschVornameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextMenschVornameActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
//                new GrundschulVerwaltungGUI01().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JFormattedTextField jFormattedTextGeburtsdatum;
    private javax.swing.JFormattedTextField jFormattedTextMenschGeburtsdatum;
    private javax.swing.JLabel jLabelFamilienname;
    private javax.swing.JLabel jLabelGeburtsdatum;
    private javax.swing.JLabel jLabelGeburtsname;
    private javax.swing.JLabel jLabelMenschFamilienname;
    private javax.swing.JLabel jLabelMenschGeburtsdatum;
    private javax.swing.JLabel jLabelMenschGeburtsname;
    private javax.swing.JLabel jLabelMenschVorname;
    private javax.swing.JLabel jLabelMenschZweitname;
    private javax.swing.JLabel jLabelVorname;
    private javax.swing.JLabel jLabelZweitname;
    private javax.swing.JList jList2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanelFixGrundschulLehrer;
    private javax.swing.JPanel jPanelFixMensch;
    private javax.swing.JPanel jPanelGrundschulLehrer;
    private javax.swing.JPanel jPanelMensch;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTabbedPane jTabbedPanelGrundschulVerwaltung;
    private javax.swing.JTextField jTextFamilienname;
    private javax.swing.JTextField jTextGeburtsname;
    private javax.swing.JTextField jTextMenschFamilienname;
    private javax.swing.JTextField jTextMenschGeburtsname;
    private javax.swing.JTextField jTextMenschVorname;
    private javax.swing.JTextField jTextMenschZweitname;
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
}
