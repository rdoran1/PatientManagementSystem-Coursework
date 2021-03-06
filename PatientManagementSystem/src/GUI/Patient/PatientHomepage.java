/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Patient;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rossg
 */
public class PatientHomepage extends javax.swing.JFrame {
    
    public String id;

    public void setId(String id) {
        this.id = id;
    }
    
    
    /**
     * Creates new form PatientHomepage
     */
    public PatientHomepage() {
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

        PatientTitle = new javax.swing.JLabel();
        AppointmentsButton = new javax.swing.JButton();
        PrescriptionsButton = new javax.swing.JButton();
        RatingsButton = new javax.swing.JButton();
        HistoryButton = new javax.swing.JButton();
        TerminateButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PatientTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PatientTitle.setText("Patient Homepage");

        AppointmentsButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AppointmentsButton.setText("Appointments");
        AppointmentsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AppointmentsButtonActionPerformed(evt);
            }
        });

        PrescriptionsButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PrescriptionsButton.setText("Prescriptions");
        PrescriptionsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrescriptionsButtonActionPerformed(evt);
            }
        });

        RatingsButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RatingsButton.setText("Doctor Ratings");
        RatingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RatingsButtonActionPerformed(evt);
            }
        });

        HistoryButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        HistoryButton.setText("History");
        HistoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistoryButtonActionPerformed(evt);
            }
        });

        TerminateButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TerminateButton.setText("Request Account Termination");
        TerminateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TerminateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PatientTitle)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(AppointmentsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RatingsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(HistoryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PrescriptionsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(TerminateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PatientTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AppointmentsButton)
                    .addComponent(PrescriptionsButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RatingsButton)
                    .addComponent(HistoryButton))
                .addGap(18, 18, 18)
                .addComponent(TerminateButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AppointmentsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AppointmentsButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new PatientAppointment().setVisible(true);
    }//GEN-LAST:event_AppointmentsButtonActionPerformed

    private void PrescriptionsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrescriptionsButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_PrescriptionsButtonActionPerformed

    private void RatingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RatingsButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new PatientRatings().setVisible(true);
    }//GEN-LAST:event_RatingsButtonActionPerformed

    private void HistoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistoryButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_HistoryButtonActionPerformed

    private void TerminateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TerminateButtonActionPerformed
        try {
            // TODO add your handling code here:
            BufferedWriter buffer = new BufferedWriter(new FileWriter("DeleteUser.txt", true));
            buffer.newLine();
            BufferedReader br = new BufferedReader(new FileReader("DeleteUser.txt"));
            
            Object[] UserTableLines = br.lines().toArray();
            
            for (Object UserTableLine : UserTableLines) {
                if (UserTableLine.toString().equals(id)) {
                    JOptionPane.showMessageDialog(this , "Exsisting Request" , "Account Termination Request Already Made", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
                buffer.write(id);
            } 
            
            buffer.close();
            
        } catch (IOException ex) {
            Logger.getLogger(PatientHomepage.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(this , "Account request has been submitted." , "Account Termination Request Made", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_TerminateButtonActionPerformed

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
            java.util.logging.Logger.getLogger(PatientHomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientHomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientHomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientHomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientHomepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AppointmentsButton;
    private javax.swing.JButton HistoryButton;
    private javax.swing.JLabel PatientTitle;
    private javax.swing.JButton PrescriptionsButton;
    private javax.swing.JButton RatingsButton;
    private javax.swing.JButton TerminateButton;
    // End of variables declaration//GEN-END:variables
}
