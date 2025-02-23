/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Admin;

import model.UserDirectory;
import utils.NavigationUtils;

/**
 *
 * @author tisaac
 */
public class AdminWorkspace extends javax.swing.JPanel {
    
    
    NavigationUtils nv;
    

    /**
     * Creates new form AdminWorkspace
     */
    public AdminWorkspace(NavigationUtils nv) {
        initComponents();
        this.nv = nv;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnManageUserAccounts = new javax.swing.JButton();
        btnManageBranches = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();

        btnManageUserAccounts.setText("Manage User Accounts");
        btnManageUserAccounts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageUserAccountsActionPerformed(evt);
            }
        });

        btnManageBranches.setText("Manage Branches");

        lblTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Admin Workspace");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnManageBranches, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageUserAccounts, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(btnManageUserAccounts)
                .addGap(28, 28, 28)
                .addComponent(btnManageBranches)
                .addContainerGap(372, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageUserAccountsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageUserAccountsActionPerformed
        ManageUserAccount mngUser = new ManageUserAccount(nv);
        nv.showCard(mngUser, "ManageUserAccount");
    }//GEN-LAST:event_btnManageUserAccountsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageBranches;
    private javax.swing.JButton btnManageUserAccounts;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
