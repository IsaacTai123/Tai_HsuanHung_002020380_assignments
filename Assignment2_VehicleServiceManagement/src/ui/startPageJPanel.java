/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import model.OwnerDirectory;
import model.ServiceCatalog;
import model.VehicleDirectory;
import ui.services.ServicesWorkAreaJPanel;
import ui.vehicle.OwnerVehicleJPanel;
import ui.vehicle.VehicleManagementJPanel;

/**
 *
 * @author tisaac
 */
public class StartPageJPanel extends javax.swing.JPanel {
    
    JPanel mainWorkArea;
    VehicleDirectory vehicleDir;
    ServiceCatalog serviceCatalog;
    OwnerDirectory ownerDir;

    /**
     * Creates new form startPageJPanel
     */
    public StartPageJPanel(JPanel mainWorkArea, VehicleDirectory vehicleDir, ServiceCatalog serviceCatalog, OwnerDirectory ownerDir) {
        initComponents();
        splitPanel.setEnabled(false); // Disable user interaction
        splitPanel.setDividerSize(0); // Hide the draggable divider
        splitPanel.setResizeWeight(0.5); // Optional: Keep equal division
        
        this.mainWorkArea = mainWorkArea;
        this.vehicleDir = vehicleDir;
        this.serviceCatalog = serviceCatalog;
        this.ownerDir = ownerDir;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPanel = new javax.swing.JSplitPane();
        workArea = new javax.swing.JPanel();
        btnVehicleOwner = new javax.swing.JButton();
        btnServices = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        viewArea = new javax.swing.JPanel();
        lblWelcome = new javax.swing.JLabel();

        splitPanel.setDividerLocation(120);
        splitPanel.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        btnVehicleOwner.setText("Vehicle & Owner");
        btnVehicleOwner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVehicleOwnerActionPerformed(evt);
            }
        });

        btnServices.setText("Services");
        btnServices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServicesActionPerformed(evt);
            }
        });

        jButton3.setText("Manage Vehicle");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout workAreaLayout = new javax.swing.GroupLayout(workArea);
        workArea.setLayout(workAreaLayout);
        workAreaLayout.setHorizontalGroup(
            workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workAreaLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(btnServices, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addComponent(btnVehicleOwner, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
        workAreaLayout.setVerticalGroup(
            workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, workAreaLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnServices, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVehicleOwner, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        splitPanel.setTopComponent(workArea);

        lblWelcome.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        lblWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWelcome.setText("Welcome to Vehicle Services Management");

        javax.swing.GroupLayout viewAreaLayout = new javax.swing.GroupLayout(viewArea);
        viewArea.setLayout(viewAreaLayout);
        viewAreaLayout.setHorizontalGroup(
            viewAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        viewAreaLayout.setVerticalGroup(
            viewAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewAreaLayout.createSequentialGroup()
                .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 108, Short.MAX_VALUE))
        );

        splitPanel.setRightComponent(viewArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnServicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServicesActionPerformed
        
        ServicesWorkAreaJPanel serviceWorkArea = new ServicesWorkAreaJPanel(mainWorkArea, serviceCatalog);
        mainWorkArea.add("ServiceWorkArea", serviceWorkArea);
        CardLayout ly = (CardLayout) mainWorkArea.getLayout();
        ly.next(mainWorkArea);
    }//GEN-LAST:event_btnServicesActionPerformed

    private void btnVehicleOwnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVehicleOwnerActionPerformed
        OwnerVehicleJPanel ownerVehicle = new OwnerVehicleJPanel(mainWorkArea, serviceCatalog, vehicleDir, ownerDir);        
        mainWorkArea.add("OwnerVehicle", ownerVehicle);
        
        // Get the reference to the JFrame that contains mainWorkArea.
        // Since mainWorkArea is a JPanel, we need to use SwingUtilities.getWindowAncestor()
        // to find its parent JFrame.
        JFrame frame = (JFrame) javax.swing.SwingUtilities.getWindowAncestor(mainWorkArea);
        if (frame != null) {
            frame.setSize(800, 800); // 調整 JFrame 大小
            frame.revalidate();
            frame.repaint();
        }
        
        CardLayout ly = (CardLayout) mainWorkArea.getLayout();
        ly.next(mainWorkArea);
        

        // Revalidate the mainWorkArea to refresh its layout and ensure the changes take effect.
        // This is especially necessary when working with dynamic layouts like CardLayout.
        mainWorkArea.revalidate(); 
        
        // Repaint the mainWorkArea to visually update any changes made to its components.
        // This forces a redraw of the UI, ensuring everything is displayed correctly.
        mainWorkArea.repaint();
    }//GEN-LAST:event_btnVehicleOwnerActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        VehicleManagementJPanel vehicleManage = new VehicleManagementJPanel(mainWorkArea, ownerDir);
        mainWorkArea.add("VehicleManagement", vehicleManage);
        CardLayout ly = (CardLayout) mainWorkArea.getLayout();
        ly.next(mainWorkArea);
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnServices;
    private javax.swing.JButton btnVehicleOwner;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JSplitPane splitPanel;
    private javax.swing.JPanel viewArea;
    private javax.swing.JPanel workArea;
    // End of variables declaration//GEN-END:variables

    
}
