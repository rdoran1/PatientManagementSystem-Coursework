/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Administartor;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
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
public class AdminAccounts extends javax.swing.JFrame {

    /**
     * Creates new form AddDocSec
     */
    public AdminAccounts() {
        initComponents();
        Data();
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
            
            for(int i = 0; i < UserTableLines.length; i++){
            String line = UserTableLines[i].toString().trim();
            String[] dataRow = line.split(" / ");
            model.addRow(dataRow);
            }
            
            System.out.println(Arrays.deepToString(UserTableLines));
            
            
        } catch(Exception ex){
            Logger.getLogger(AdminAccounts.class.getName()).log(Level.SEVERE, null, ex);
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

        AddAccountTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        users = new javax.swing.JTable();
        AddAccountButton = new javax.swing.JButton();
        Remo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AddAccountTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AddAccountTitle.setText("Add and Remove User Accounts");

        users.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(users);

        AddAccountButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AddAccountButton.setText("Add Account");
        AddAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddAccountButtonActionPerformed(evt);
            }
        });

        Remo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Remo.setText("Remove Account");
        Remo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AddAccountTitle)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AddAccountButton)
                .addGap(18, 18, 18)
                .addComponent(Remo)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AddAccountTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Remo)
                    .addComponent(AddAccountButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddAccountButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new AdminAdd().setVisible(true);
    }//GEN-LAST:event_AddAccountButtonActionPerformed

    private void RemoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoActionPerformed
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
            Logger.getLogger(AdminAccounts.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_RemoActionPerformed

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
            java.util.logging.Logger.getLogger(AdminAccounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminAccounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminAccounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminAccounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminAccounts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddAccountButton;
    private javax.swing.JLabel AddAccountTitle;
    private javax.swing.JButton Remo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable users;
    // End of variables declaration//GEN-END:variables
}
