/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CCTBankProject;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class Frame_Transfer extends javax.swing.JFrame {

    /**
     * Creates new form TransferFrame
     */
    public Frame_Transfer() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
    }
    public int receivernum, receiversort;
    public double receivertransfer, receiverbalance;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        AccNumber_TextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Sortcode_TextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Initialbalance_TextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        RTransferAmount_TextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        RAccNumber_TextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        RSortcode_TextField = new javax.swing.JTextField();
        UpdateButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Transfer funds");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("Account Number");

        AccNumber_TextField.setEditable(false);
        AccNumber_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccNumber_TextFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Sort Code");

        Sortcode_TextField.setEditable(false);
        Sortcode_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sortcode_TextFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("Initial Balance");

        Initialbalance_TextField.setEditable(false);
        Initialbalance_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Initialbalance_TextFieldActionPerformed(evt);
            }
        });

        jLabel4.setText("Transfer Amount");

        RTransferAmount_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RTransferAmount_TextFieldActionPerformed(evt);
            }
        });

        jLabel5.setText("Recipient Account Number");

        RAccNumber_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RAccNumber_TextFieldActionPerformed(evt);
            }
        });

        jLabel6.setText("Recipient Sort Code");

        RSortcode_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RSortcode_TextFieldActionPerformed(evt);
            }
        });

        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Initialbalance_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Sortcode_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AccNumber_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(RTransferAmount_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(UpdateButton)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(RAccNumber_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(RSortcode_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RAccNumber_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RSortcode_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AccNumber_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Sortcode_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Initialbalance_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RTransferAmount_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UpdateButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AccNumber_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccNumber_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AccNumber_TextFieldActionPerformed

    private void Sortcode_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sortcode_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Sortcode_TextFieldActionPerformed

    private void Initialbalance_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Initialbalance_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Initialbalance_TextFieldActionPerformed

    private void RTransferAmount_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RTransferAmount_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RTransferAmount_TextFieldActionPerformed

    private void RAccNumber_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RAccNumber_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RAccNumber_TextFieldActionPerformed

    private void RSortcode_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RSortcode_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RSortcode_TextFieldActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        AccountVar account = new AccountVar();

        receivernum = Integer.parseInt(RAccNumber_TextField.getText().toString());
        receiversort = Integer.parseInt(RSortcode_TextField.getText().toString());
        receivertransfer = Double.parseDouble(RTransferAmount_TextField.getText().toString());
        account.setAccountnumber(Integer.parseInt(AccNumber_TextField.getText()));
        account.setSortcode(Integer.parseInt(Sortcode_TextField.getText()));
        account.setBalance(Integer.parseInt(Initialbalance_TextField.getText()));

        try {
            this.dispose();
            DBMethods.transferFunds(account, receivernum, receivertransfer);
            Frame_Accounts test = new Frame_Accounts();
            new Frame_Accounts().setVisible(true);
        } catch (NumberFormatException ex) {
            Logger.getLogger(Frame_Transfer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Frame_Transfer.class.getName()).log(Level.SEVERE, null, ex);
        }
        Transactions trans = new Transactions();
        trans.setAccountNumber(Integer.parseInt(AccNumber_TextField.getText()));
        trans.setDescription("Transfer from account: " + trans.getAccountNumber());
        trans.setDebit(Integer.parseInt(RTransferAmount_TextField.getText()));
        trans.setBalance(Integer.parseInt(Initialbalance_TextField.getText()) - Integer.parseInt(RTransferAmount_TextField.getText()));
        try {
            DBMethods.updatetransaction1(trans);
            this.dispose();
            new Frame_Accounts().setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame_Transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_Transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_Transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_Transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_Transfer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField AccNumber_TextField;
    public javax.swing.JTextField Initialbalance_TextField;
    public javax.swing.JTextField RAccNumber_TextField;
    public javax.swing.JTextField RSortcode_TextField;
    public javax.swing.JTextField RTransferAmount_TextField;
    public javax.swing.JTextField Sortcode_TextField;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
