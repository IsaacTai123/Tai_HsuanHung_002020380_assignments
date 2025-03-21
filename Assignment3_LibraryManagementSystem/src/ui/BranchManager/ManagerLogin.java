/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.BranchManager;

import interfaces.IUserProfile;
import javax.swing.JOptionPane;
import model.BranchManager;
import model.Library;
import model.LibraryDirectory;
import model.UserDirectory;
import utils.NavigationUtils;

/**
 *
 * @author tisaac
 */
public class ManagerLogin extends javax.swing.JPanel {
    
    LibraryDirectory libDir;
    UserDirectory userList;
    NavigationUtils nv;

    /**
     * Creates new form ManagerWorkspace
     */
    public ManagerLogin(NavigationUtils nv) {
        initComponents();
        this.libDir = LibraryDirectory.getInstance();
        this.userList = UserDirectory.getInstance();
        this.nv = nv;
        populateLibraryBranchs();
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
        lblLibraryBranch = new javax.swing.JLabel();
        cmbLibraryBranch = new javax.swing.JComboBox<>();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblPwd = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        ptxtPwd = new javax.swing.JPasswordField();

        lblTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Branch Manager Workspace");

        lblLibraryBranch.setText("Check Your Library Branch");

        cmbLibraryBranch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbLibraryBranchActionPerformed(evt);
            }
        });

        lblUsername.setText("Username");

        lblPwd.setText("Password");

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(lblLibraryBranch, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbLibraryBranch, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(ptxtPwd, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtUsername, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLibraryBranch)
                    .addComponent(cmbLibraryBranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPwd)
                    .addComponent(ptxtPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(btnLogin)
                .addContainerGap(228, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbLibraryBranchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbLibraryBranchActionPerformed
        
    }//GEN-LAST:event_cmbLibraryBranchActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String username = txtUsername.getText().trim();
        char[] password = ptxtPwd.getPassword();
        String selectedLibraryBranch = (String) cmbLibraryBranch.getSelectedItem();

        if (username.isEmpty() || password.length == 0 || selectedLibraryBranch == null) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        // Varify
        IUserProfile user = userList.findUserByName(username);

        if (user == null) {
            JOptionPane.showMessageDialog(this, "User not found!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!(user instanceof BranchManager)) {
            JOptionPane.showMessageDialog(this, "User is not a Branch Manager!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        BranchManager branchManager = (BranchManager) user;

        if (!branchManager.getPwd().equals(new String(password))) {
            JOptionPane.showMessageDialog(this, "Incorrect password!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Varify if the branch manager is responsible for this library
        Library selectedLibrary = LibraryDirectory.getInstance().getLibraryByName(selectedLibraryBranch);

        if (selectedLibrary == null || !selectedLibrary.getManager().equals(branchManager)) {
            JOptionPane.showMessageDialog(this, "Branch Manager not associated with selected library!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        JOptionPane.showMessageDialog(this, "Login successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
        
        BranchManagerWorkspace mngWork = new BranchManagerWorkspace(nv, selectedLibrary);     
        nv.showCard(mngWork, "BranchMngWorkspace");

        txtUsername.setText("");
        ptxtPwd.setText("");
        cmbLibraryBranch.setSelectedIndex(-1);
    }//GEN-LAST:event_btnLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JComboBox<String> cmbLibraryBranch;
    private javax.swing.JLabel lblLibraryBranch;
    private javax.swing.JLabel lblPwd;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPasswordField ptxtPwd;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables


    private void populateLibraryBranchs() {
        cmbLibraryBranch.removeAllItems();

        for (Library l : libDir.getAllLibraries()) { 
            cmbLibraryBranch.addItem(l.getName());
        }
    }
}
