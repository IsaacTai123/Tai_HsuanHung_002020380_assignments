/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Customer;

import model.Customer;
import utils.NavigationUtils;

/**
 *
 * @author tisaac
 */
public class CustomerWorkspace extends javax.swing.JPanel {

    NavigationUtils nv;
    Customer customer;
    
    /**
     * Creates new form CustomerWorkspace
     */
    public CustomerWorkspace(NavigationUtils nv, Customer cs) {
        initComponents();
        this.nv = nv;
        this.customer = cs;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRentalHistory = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        btnCustomerBookCatalog = new javax.swing.JButton();

        btnRentalHistory.setText("View Rental History");
        btnRentalHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRentalHistoryActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Customer Workspace");

        btnCustomerBookCatalog.setText("Browse Book Catalog");
        btnCustomerBookCatalog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerBookCatalogActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRentalHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCustomerBookCatalog, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(btnCustomerBookCatalog)
                .addGap(28, 28, 28)
                .addComponent(btnRentalHistory)
                .addContainerGap(372, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCustomerBookCatalogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerBookCatalogActionPerformed
        BrowseBookCatalog bbCatalog = new BrowseBookCatalog(nv, customer);
        nv.showCard(bbCatalog, "BrowseBookCatalog");
    }//GEN-LAST:event_btnCustomerBookCatalogActionPerformed

    private void btnRentalHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRentalHistoryActionPerformed
        ViewRentalHistory vrh = new ViewRentalHistory(nv);
        nv.showCard(vrh, "ViewRentalHistory");
    }//GEN-LAST:event_btnRentalHistoryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCustomerBookCatalog;
    private javax.swing.JButton btnRentalHistory;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
