package de.marcelhuber.referenzprojektjavase7.view;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author javafish
 */
public class LoginDialog extends javax.swing.JDialog {

    private EnumUserRole userRole;

    public LoginDialog(java.awt.Frame parent) {
        super(parent, true);
        initComponents();
        setLocationRelativeTo(parent);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        textUsername = new JTextField();
        textPassword = new JPasswordField();
        checkPasswordVisible = new JCheckBox();
        buttonOK = new JButton();
        buttonCancle = new JButton();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");

        jLabel1.setText("Username");

        jLabel2.setText("Passwort");

        checkPasswordVisible.setText("Passwort anzeigen");
        checkPasswordVisible.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                checkPasswordVisibleActionPerformed(evt);
            }
        });

        buttonOK.setText("OK");
        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                buttonOKActionPerformed(evt);
            }
        });

        buttonCancle.setText("Abbrechen");
        buttonCancle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                buttonCancleActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonOK)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonCancle))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(checkPasswordVisible)
                        .addGap(0, 171, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(textPassword)
                            .addComponent(textUsername))))
                .addContainerGap())
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textUsername, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkPasswordVisible)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonOK)
                    .addComponent(buttonCancle))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCancleActionPerformed(ActionEvent evt) {//GEN-FIRST:event_buttonCancleActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancleActionPerformed

    private void buttonOKActionPerformed(ActionEvent evt) {//GEN-FIRST:event_buttonOKActionPerformed
        dispose();
        // prüfe ob Username / Password korrekt
        if (textUsername.getText().equalsIgnoreCase("Marcel")) {
            userRole = EnumUserRole.DIREKTOR;
        } 
        if (textUsername.getText().equalsIgnoreCase("Stefan")) {
           userRole = EnumUserRole.KONTAKTPERSON;
        }
        if (textUsername.getText().equalsIgnoreCase("Peter")) {
           userRole = EnumUserRole.EXTERN;
        }
    }//GEN-LAST:event_buttonOKActionPerformed

    private void checkPasswordVisibleActionPerformed(ActionEvent evt) {//GEN-FIRST:event_checkPasswordVisibleActionPerformed
        if (checkPasswordVisible.isSelected()) {
            textPassword.setEchoChar('\u0000');
        } else {
            textPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_checkPasswordVisibleActionPerformed

    public void showDialog() {
        userRole = EnumUserRole.NONE;
        textUsername.setText("");
        textPassword.setText("");
        setVisible(true);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton buttonCancle;
    private JButton buttonOK;
    private JCheckBox checkPasswordVisible;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JPasswordField textPassword;
    private JTextField textUsername;
    // End of variables declaration//GEN-END:variables

    public EnumUserRole getUserRole() {
        return userRole;
    }
}
