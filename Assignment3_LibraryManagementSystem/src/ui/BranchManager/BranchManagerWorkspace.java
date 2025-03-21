/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.BranchManager;

import model.BranchManager;
import model.Library;
import utils.NavigationUtils;

/**
 *
 * @author tisaac
 */
public class BranchManagerWorkspace extends javax.swing.JPanel {

    NavigationUtils nv;
    Library selectedLib;
    
    /**
     * Creates new form Workspace
     */
    public BranchManagerWorkspace(NavigationUtils nv, Library selectedLib) {
        initComponents();
        this.nv = nv;
        this.selectedLib = selectedLib;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        btnManageBooks = new javax.swing.JButton();
        btnManageAuthors = new javax.swing.JButton();
        btnManageRentalRequests = new javax.swing.JButton();
        btnViewRevenue = new javax.swing.JButton();

        lblTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Branch Manager Workspace");

        btnManageBooks.setText("Manage Books");
        btnManageBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageBooksActionPerformed(evt);
            }
        });

        btnManageAuthors.setText("Manage Authors");
        btnManageAuthors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageAuthorsActionPerformed(evt);
            }
        });

        btnManageRentalRequests.setText("Manage Rental Requests");
        btnManageRentalRequests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageRentalRequestsActionPerformed(evt);
            }
        });

        btnViewRevenue.setText("View Revenue");
        btnViewRevenue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewRevenueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnViewRevenue, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageRentalRequests, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageAuthors, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(183, 183, 183))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(btnManageBooks)
                .addGap(18, 18, 18)
                .addComponent(btnManageAuthors)
                .addGap(18, 18, 18)
                .addComponent(btnManageRentalRequests)
                .addGap(18, 18, 18)
                .addComponent(btnViewRevenue)
                .addContainerGap(289, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageBooksActionPerformed
        ManageBooks mb = new ManageBooks(nv, selectedLib);
        nv.showCard(mb, "ManageBooks");
    }//GEN-LAST:event_btnManageBooksActionPerformed

    private void btnManageAuthorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageAuthorsActionPerformed
        ManageAuthor ma = new ManageAuthor(nv);
        nv.showCard(ma, "ManageAuthor");
    }//GEN-LAST:event_btnManageAuthorsActionPerformed

    private void btnManageRentalRequestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageRentalRequestsActionPerformed
        ManageRentalRequests mrr = new ManageRentalRequests(nv, selectedLib);
        nv.showCard(mrr, "ManageRentalRequest");
    }//GEN-LAST:event_btnManageRentalRequestsActionPerformed

    private void btnViewRevenueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewRevenueActionPerformed
        ViewRevenue vr = new ViewRevenue(nv, selectedLib);
        nv.showCard(vr, "ViewRevenue");
    }//GEN-LAST:event_btnViewRevenueActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageAuthors;
    private javax.swing.JButton btnManageBooks;
    private javax.swing.JButton btnManageRentalRequests;
    private javax.swing.JButton btnViewRevenue;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
