/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Secretary;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rossg
 */
public class SecPatientAccounts extends javax.swing.JFrame {
    

    /**
     * Creates new form SecPatientAccounts
     */
    public SecPatientAccounts() {
        initComponents();
        Data();
        Requests();
        NewRequests();
        

    }
    public void Data(){
        String UserFilePath = "Users.txt";
        File UsersFile = new File(UserFilePath);
        
        try{
            BufferedReader br = new BufferedReader(new FileReader(UsersFile));
            String firstLine = br.readLine().trim();
            String[] columnName = firstLine.split(",");
            DefaultTableModel model = (DefaultTableModel)users.getModel();
            model.setColumnIdentifiers(columnName);
            
            Object[] UserTableLines = br.lines().toArray();
            
            for(int i = 0; i < UserTableLines.length; i++)
            {
                String line = UserTableLines[i].toString().trim();
                String[] dataRow = line.split("/");
                model.addRow(dataRow);
            }
            
            System.out.println(Arrays.deepToString(UserTableLines));
            
            
        } catch(Exception ex){
            Logger.getLogger(SecPatientAccounts.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void Requests()
    {
        try 
        {
            BufferedReader reader = new BufferedReader(new FileReader("DeleteUser.txt"));
            
            Object[] UserTableLines = reader.lines().toArray();
            
            for(int i = 0; i < UserTableLines.length; i++)
            {
                DeleteBox.addItem((String)UserTableLines[i]);
            }
        }
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(SecPatientAccounts.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void NewRequests()
    {
        try 
        {
            BufferedReader reader = new BufferedReader(new FileReader("NewUser.txt"));
            
            Object[] UserTableLines = reader.lines().toArray();
            
            for(int i = 0; i < UserTableLines.length; i++)
            {
                NewBox.addItem((String)UserTableLines[i]);
            }
        }
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(SecPatientAccounts.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AccountsTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        users = new javax.swing.JTable();
        UserTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ApproveNewUserButton = new javax.swing.JButton();
        RemoveAccountButton = new javax.swing.JButton();
        RemovalRequestButton = new javax.swing.JButton();
        RemoveNewUserButton = new javax.swing.JButton();
        RemoveRequestButton = new javax.swing.JButton();
        DeleteBox = new javax.swing.JComboBox<>();
        NewBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AccountsTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AccountsTitle.setText("Patient Accounts");

        users.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(users);

        UserTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UserTitle.setText("Current Users");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("User Delete Requests");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("New User Request");

        ApproveNewUserButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ApproveNewUserButton.setText("Approve New User");
        ApproveNewUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApproveNewUserButtonActionPerformed(evt);
            }
        });

        RemoveAccountButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RemoveAccountButton.setText("Remove Existing Account");
        RemoveAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveAccountButtonActionPerformed(evt);
            }
        });

        RemovalRequestButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RemovalRequestButton.setText("Approve Removal Request");
        RemovalRequestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemovalRequestButtonActionPerformed(evt);
            }
        });

        RemoveNewUserButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RemoveNewUserButton.setText("Remove New User");
        RemoveNewUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveNewUserButtonActionPerformed(evt);
            }
        });

        RemoveRequestButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RemoveRequestButton.setText("Remove Request");
        RemoveRequestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveRequestButtonActionPerformed(evt);
            }
        });

        DeleteBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        NewBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NewBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(406, 406, 406)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ApproveNewUserButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RemoveNewUserButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RemoveAccountButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AccountsTitle)
                            .addComponent(UserTitle)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DeleteBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(406, 406, 406)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(RemovalRequestButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(RemoveRequestButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AccountsTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UserTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(RemoveAccountButton)
                        .addGap(45, 45, 45)))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RemovalRequestButton)
                    .addComponent(DeleteBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RemoveRequestButton)
                .addGap(55, 55, 55)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ApproveNewUserButton)
                    .addComponent(NewBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RemoveNewUserButton)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RemoveAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveAccountButtonActionPerformed
        // TODO add your handling code here:
        String UserFilePath = "Users.txt";
        File UsersFile = new File(UserFilePath);
        DefaultTableModel model = (DefaultTableModel) users.getModel();
        
        try {
            int rowSelectionIndex = users.getSelectedRow();
            model.removeRow(rowSelectionIndex);
            
            FileWriter fw = new FileWriter(UsersFile);
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write("User Type , ID , First Name , Last Name , Age , Sex , Address , Password");
            bw.newLine();
            
            for(int i = 0; i < users.getRowCount(); i++)
            {
                for(int j = 0;j < users.getColumnCount(); j++)
                {
                    bw.write(users.getValueAt(i, j).toString());
                    bw.write(" / ");
                }
                bw.newLine();
            }
            bw.close();
            fw.close();
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(SecPatientAccounts.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_RemoveAccountButtonActionPerformed

    private void RemovalRequestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemovalRequestButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RemovalRequestButtonActionPerformed

    private void RemoveRequestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveRequestButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RemoveRequestButtonActionPerformed

    private void ApproveNewUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApproveNewUserButtonActionPerformed
   
    }//GEN-LAST:event_ApproveNewUserButtonActionPerformed

    private void RemoveNewUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveNewUserButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RemoveNewUserButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SecPatientAccounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SecPatientAccounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SecPatientAccounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SecPatientAccounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SecPatientAccounts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccountsTitle;
    private javax.swing.JButton ApproveNewUserButton;
    private javax.swing.JComboBox<String> DeleteBox;
    private javax.swing.JComboBox<String> NewBox;
    private javax.swing.JButton RemovalRequestButton;
    private javax.swing.JButton RemoveAccountButton;
    private javax.swing.JButton RemoveNewUserButton;
    private javax.swing.JButton RemoveRequestButton;
    private javax.swing.JLabel UserTitle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable users;
    // End of variables declaration//GEN-END:variables
}
