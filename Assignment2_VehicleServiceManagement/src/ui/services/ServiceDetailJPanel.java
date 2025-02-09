/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.services;

import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Service;


/**
 *
 * @author tisaac
 */
public class ServiceDetailJPanel extends javax.swing.JPanel {
    
    JPanel mainWorkArea;
    Service service;

    /**
     * Creates new form ServicesViewJPanel
     */
    public ServiceDetailJPanel(JPanel mainWorkArea, Service service) {
        initComponents();
        this.mainWorkArea = mainWorkArea;
        this.service = service;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblServiceID = new javax.swing.JLabel();
        txtServiceID = new javax.swing.JTextField();
        lblServiceType = new javax.swing.JLabel();
        txtServiceType = new javax.swing.JTextField();
        lblCost = new javax.swing.JLabel();
        txtCost = new javax.swing.JTextField();
        lblMechanicName = new javax.swing.JLabel();
        txtMechanicName = new javax.swing.JTextField();
        lblServiceDuration = new javax.swing.JLabel();
        txtServiceDuration = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(800, 600));

        lblServiceID.setText("Service ID");

        lblServiceType.setText("Service Type");

        lblCost.setText("Cost");

        lblMechanicName.setText("Mechanic's Name");

        lblServiceDuration.setText("Service Duration");

        btnCreate.setText("Create Service");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Service");

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnBack)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblServiceType)
                            .addComponent(lblCost)
                            .addComponent(lblMechanicName)
                            .addComponent(lblServiceDuration)
                            .addComponent(lblServiceID))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtServiceID, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtServiceType, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCost, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMechanicName, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtServiceDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(341, 341, 341)
                        .addComponent(btnCreate)))
                .addContainerGap(247, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblServiceID)
                    .addComponent(txtServiceID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblServiceType)
                    .addComponent(txtServiceType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCost)
                    .addComponent(txtCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMechanicName)
                    .addComponent(txtMechanicName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblServiceDuration)
                    .addComponent(txtServiceDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addComponent(btnCreate)
                .addContainerGap(153, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        backAction();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // Check if any field is empty
        if (txtServiceID.getText().trim().isEmpty() ||
            txtServiceType.getText().trim().isEmpty() ||
            txtCost.getText().trim().isEmpty() ||
            txtMechanicName.getText().trim().isEmpty() ||
            txtServiceDuration.getText().trim().isEmpty()) {
            
            JOptionPane.showMessageDialog(this, "All fields must be filled!", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Validate Service ID (integer)
//        int serviceID;
//        try {
//            serviceID = Integer.parseInt(txtServiceID.getText().trim());
//            if (serviceID <= 0) {
//                JOptionPane.showMessageDialog(this, "Service ID must be a positive integer!", "Input Error", JOptionPane.ERROR_MESSAGE);
//                return;
//            }
//        } catch (NumberFormatException e) {
//            JOptionPane.showMessageDialog(this, "Service ID must be a valid integer!", "Input Error", JOptionPane.ERROR_MESSAGE);
//            return;
//        }
        
        // Validate Cost (double)
        double cost;
        try {
            cost = Double.parseDouble(txtCost.getText().trim());
            if (cost < 0) {
                JOptionPane.showMessageDialog(this, "Cost cannot be negative!", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Cost must be a valid number!", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Validate Service Duration (short)
        short duration;
        try {
            duration = Short.parseShort(txtServiceDuration.getText().trim());
            if (duration <= 0) {
                JOptionPane.showMessageDialog(this, "Service Duration must be a positive number!", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Service Duration must be a valid number!", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // If all validations pass
        JOptionPane.showMessageDialog(this, "Service Created Successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        
        // Store the value
        service.setId(txtServiceID.getText().trim());
        service.setCost(cost);
        service.setDuration(duration);
        service.setMechanicName(txtMechanicName.getText().trim());
        service.setType(txtServiceType.getText().trim());
        
        // Reset the text fields
        txtServiceID.setText("");
        txtServiceDuration.setText("");
        txtServiceType.setText("");
        txtCost.setText("");
        txtMechanicName.setText("");
        
        
    }//GEN-LAST:event_btnCreateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel lblCost;
    private javax.swing.JLabel lblMechanicName;
    private javax.swing.JLabel lblServiceDuration;
    private javax.swing.JLabel lblServiceID;
    private javax.swing.JLabel lblServiceType;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtCost;
    private javax.swing.JTextField txtMechanicName;
    private javax.swing.JTextField txtServiceDuration;
    private javax.swing.JTextField txtServiceID;
    private javax.swing.JTextField txtServiceType;
    // End of variables declaration//GEN-END:variables

    private void backAction() {
        mainWorkArea.remove(this);
        
        Component[] componentArray = mainWorkArea.getComponents();
        Component cp = componentArray[componentArray.length - 1];
        if (cp instanceof ServicesWorkAreaJPanel) {
            ((ServicesWorkAreaJPanel) cp).refreshTable();
        }
        
        CardLayout ly = (CardLayout) mainWorkArea.getLayout();
        ly.previous(mainWorkArea);
    }
}
