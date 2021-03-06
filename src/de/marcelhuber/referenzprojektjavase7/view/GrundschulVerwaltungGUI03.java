package de.marcelhuber.referenzprojektjavase7.view;
// TODO: Die ganzen abstrakten Methoden sind zu implementieren
//       Weiterhin: Die Abfrage mit dem Geburtstag bzw. der Test, ob alle Felder
//       sinnvoll gefüllt sind, funktioniert noch nicht korrekt

import de.marcelhuber.referenzprojektjavase7.controller.GrundschulVerwaltungController;
import de.marcelhuber.referenzprojektjavase7.dao.MySQLMenschRealDatenDao;
import de.marcelhuber.referenzprojektjavase7.datensatzklasse.MenschDatenKonkret;
import de.marcelhuber.referenzprojektjavase7.model.GrundschulVerwaltungGesamtModel;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JTextField;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Marcel Huber; letzte Änderung: 09.08.2017
 */
public class GrundschulVerwaltungGUI03 extends javax.swing.JFrame implements GrundschulVerwaltungView {

    private MenschTableModel menschTableModel;
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
//    private int minimalAlter;
//    private int maximalAlter;
    private List<JTextField> alljTextFields;

//    {
//        minimalAlter = 0;
//        maximalAlter = 79;
//    }
    /**
     * Creates new form GrundschulVerwaltungGUI01
     */
    public GrundschulVerwaltungGUI03() {
        menschTableModel = new MenschTableModel();
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

        jDialogGeburtstagUnsinnig = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuUserLogin = new javax.swing.JMenu();
        jMenuItemLogin = new javax.swing.JMenuItem();
        jMenuOptionales = new javax.swing.JMenu();
        jMenuItemStundenplaene = new javax.swing.JMenuItem();
        jMenuItemRaumbelegung = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jDialogGeburtstagUnsinnigLayout = new javax.swing.GroupLayout(jDialogGeburtstagUnsinnig.getContentPane());
        jDialogGeburtstagUnsinnig.getContentPane().setLayout(jDialogGeburtstagUnsinnigLayout);
        jDialogGeburtstagUnsinnigLayout.setHorizontalGroup(
            jDialogGeburtstagUnsinnigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialogGeburtstagUnsinnigLayout.setVerticalGroup(
            jDialogGeburtstagUnsinnigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Grundschulverwaltungs-Software");

        jTable1.setModel(menschTableModel);
        jScrollPane1.setViewportView(jTable1);

        jMenuUserLogin.setText("User-Login");

        jMenuItemLogin.setText("Login");
        jMenuItemLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLoginActionPerformed(evt);
            }
        });
        jMenuUserLogin.add(jMenuItemLogin);

        jMenuBar1.add(jMenuUserLogin);

        jMenuOptionales.setText("Optionales");

        jMenuItemStundenplaene.setText("Stundenpläne");
        jMenuOptionales.add(jMenuItemStundenplaene);

        jMenuItemRaumbelegung.setText("Raumbelegung");
        jMenuOptionales.add(jMenuItemRaumbelegung);

        jMenuBar1.add(jMenuOptionales);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLoginActionPerformed
        if (loginDialog == null) {
            loginDialog = new LoginDialog(this);
        }

        loginDialog.showDialog();

//        resetUserRole();
//        switch (loginDialog.getUserRole()) {
//            case DIREKTOR:
//                setUserRoleDirektor();
//                break;
//            case KONTAKTPERSON:
//                setUserRoleKontaktperson();
//                break;
//            case EXTERN:
//                break;
//            case NONE:
//                showInformation("Falsche/unbekannte Nutzereingaben!", "error");
//                loginDialog.showDialog();
//                break;
//            case BREAK:
//                break;
//            default:
//                throw new AssertionError();
//        }
    }//GEN-LAST:event_jMenuItemLoginActionPerformed

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
    private javax.swing.JDialog jDialogGeburtstagUnsinnig;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemLogin;
    private javax.swing.JMenuItem jMenuItemRaumbelegung;
    private javax.swing.JMenuItem jMenuItemStundenplaene;
    private javax.swing.JMenu jMenuOptionales;
    private javax.swing.JMenu jMenuUserLogin;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private GrundschulVerwaltungController gsVController;

    @Override
    public void setController(GrundschulVerwaltungController gsVController) {
//        System.out.println("Controller ist gesetzt! --> " + gsVController);
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

    @Override
    public boolean setGeburtsdatum(Calendar geburtsdatum) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public MenschDatenKonkret getMenschDatenKonkret() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean setMenschDatenKonkret(MenschDatenKonkret mdk) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showInformation(String hinweis, String hinweisTyp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//    class MenschTableModel implements TableModel {
    class MenschTableModel extends AbstractTableModel {

        private MySQLMenschRealDatenDao myMenschDatenDao;
        private List<MenschDatenKonkret> menschDaten;
        private String[] columns = {
            "id",
            "geburtsname",
            "familienname",
            "vorname",
            "zweitname",
            "geburtsdatum"
        };

        public MenschTableModel() {
            myMenschDatenDao = new MySQLMenschRealDatenDao();
            readAllMenschDaten();
        }

        private void readAllMenschDaten() {
            menschDaten = (List<MenschDatenKonkret>) myMenschDatenDao.findAllMenschRealDaten();
//            System.out.println(menschDaten);
        }

        @Override

        public int getRowCount() {
            return menschDaten.size();
        }

        @Override
        public int getColumnCount() {
            return columns.length;
        }

        @Override
        public String getColumnName(int columnIndex) {
//            System.out.println(columns[columnIndex]);
            return columns[columnIndex];
        }

        @Override
        public Class<?> getColumnClass(int columnIndex) {
            if (columnIndex == 0) {
                return Integer.class;
            }
            return Object.class;
        }

        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return false;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            MenschDatenKonkret mdk = getMenschDatenKonkret(rowIndex);
            switch (columnIndex) {
                case 0:
                    return mdk.getGeburtsname();
                case 1:
                    return mdk.getGeburtsname();
                case 2:
                    return mdk.getFamilienname();
                case 3:
                    return mdk.getVorname();
                case 4:
                    return mdk.getZweitname();
                case 5:
                    return mdk.getGeburtsDatumAsString();
                default:
                    throw new AssertionError();
            }
        }

        public MenschDatenKonkret getMenschDatenKonkret(int rowIndex) {
            return menschDaten.get(rowIndex);
        }

//        @Override
//        public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
//        @Override
//        public void addTableModelListener(TableModelListener l) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
        @Override
        public void removeTableModelListener(TableModelListener l) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
