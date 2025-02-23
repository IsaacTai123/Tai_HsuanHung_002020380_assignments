/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import javax.swing.JPanel;
import model.CustomerDirectory;
import ui.Admin.AdminWorkspace;
import ui.BranchManager.BranchManagerWorkspace;
import ui.Customer.CustomerWorkspace;
import utils.NavigationUtils;

/**
 *
 * @author tisaac
 */
public class MainJFrame extends javax.swing.JFrame {
    
    NavigationUtils nv;

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        nv = new NavigationUtils(WorkArea);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplitPanel = new javax.swing.JSplitPane();
        CtrlArea = new javax.swing.JPanel();
        btnAdmin = new javax.swing.JButton();
        btnBranchManager = new javax.swing.JButton();
        btnCustomer = new javax.swing.JButton();
        WorkArea = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SplitPanel.setDividerLocation(150);
        SplitPanel.setPreferredSize(new java.awt.Dimension(800, 600));

        btnAdmin.setText("Admin");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        btnBranchManager.setText("Branch Manager");
        btnBranchManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBranchManagerActionPerformed(evt);
            }
        });

        btnCustomer.setText("Customer");
        btnCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CtrlAreaLayout = new javax.swing.GroupLayout(CtrlArea);
        CtrlArea.setLayout(CtrlAreaLayout);
        CtrlAreaLayout.setHorizontalGroup(
            CtrlAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CtrlAreaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CtrlAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBranchManager, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CtrlAreaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        CtrlAreaLayout.setVerticalGroup(
            CtrlAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CtrlAreaLayout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(btnAdmin)
                .addGap(18, 18, 18)
                .addComponent(btnBranchManager)
                .addGap(18, 18, 18)
                .addComponent(btnCustomer)
                .addContainerGap(321, Short.MAX_VALUE))
        );

        SplitPanel.setLeftComponent(CtrlArea);

        WorkArea.setLayout(new java.awt.CardLayout());
        SplitPanel.setRightComponent(WorkArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        AdminWorkspace adminWork = new AdminWorkspace(nv);
        nv.showCard(adminWork, "AdminWorkspace");
    }//GEN-LAST:event_btnAdminActionPerformed

    private void btnBranchManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBranchManagerActionPerformed
        BranchManagerWorkspace mngWork = new BranchManagerWorkspace(nv);     
        nv.showCard(mngWork, "BranchMngWorkspace");
    }//GEN-LAST:event_btnBranchManagerActionPerformed

    private void btnCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerActionPerformed
        CustomerWorkspace csWork = new CustomerWorkspace(nv);
        nv.showCard(csWork, "CustomerWorkspace");
    }//GEN-LAST:event_btnCustomerActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CtrlArea;
    private javax.swing.JSplitPane SplitPanel;
    private javax.swing.JPanel WorkArea;
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnBranchManager;
    private javax.swing.JButton btnCustomer;
    // End of variables declaration//GEN-END:variables

    public void nextCard(JPanel jpanel, String name) { 
        WorkArea.add(name, jpanel);
        CardLayout ly = (CardLayout) WorkArea.getLayout();
        ly.next(WorkArea);
    }
}
