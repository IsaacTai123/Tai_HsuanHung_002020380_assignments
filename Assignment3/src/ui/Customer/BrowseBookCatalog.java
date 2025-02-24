/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Customer;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Book;
import model.BookCollection;
import model.Customer;
import model.Library;
import model.LibraryDirectory;
import model.RentalRequest;
import model.RentalRequestDirectory;
import model.UserDirectory;
import utils.NavigationUtils;

/**
 *
 * @author tisaac
 */
public class BrowseBookCatalog extends javax.swing.JPanel {

    NavigationUtils nv;
    BookCollection allBooks;
    RentalRequestDirectory requestList;
    LibraryDirectory libList;
    UserDirectory userList;
    Customer currentCustomer;
    
    /**
     * Creates new form BrowseBookCatalog
     */
    public BrowseBookCatalog(NavigationUtils nv, Customer cs) {
        initComponents();
        this.nv = nv;
        this.currentCustomer = cs;
        this.allBooks = BookCollection.getInstance();
        this.libList = LibraryDirectory.getInstance();
        this.requestList = RentalRequestDirectory.getInstance();
        this.userList = UserDirectory.getInstance();
        
        
        populateLibraryBranchComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRent = new javax.swing.JButton();
        lblLibraryBranch = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBooks = new javax.swing.JTable();
        btnViewDetail = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        cmbLibraryBranch = new javax.swing.JComboBox<>();
        txtSearchBook = new javax.swing.JTextField();
        btnSearchBook = new javax.swing.JButton();

        btnRent.setText("Rent");
        btnRent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRentActionPerformed(evt);
            }
        });

        lblLibraryBranch.setText("Library Branch");

        btnBack.setText("<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblBooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Serial Num", "Book Name", "Price", "Avail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblBooks);
        if (tblBooks.getColumnModel().getColumnCount() > 0) {
            tblBooks.getColumnModel().getColumn(0).setResizable(false);
            tblBooks.getColumnModel().getColumn(2).setResizable(false);
            tblBooks.getColumnModel().getColumn(3).setResizable(false);
        }

        btnViewDetail.setText("View Book Detail");

        lblTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Browse Book Catalog");

        cmbLibraryBranch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbLibraryBranchActionPerformed(evt);
            }
        });

        btnSearchBook.setText("Search Item");
        btnSearchBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchBookActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRent, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnViewDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblLibraryBranch, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbLibraryBranch, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtSearchBook, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSearchBook)))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLibraryBranch, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbLibraryBranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSearchBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSearchBook)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRent)
                    .addComponent(btnViewDetail))
                .addGap(60, 60, 60))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        nv.goBack();
    }//GEN-LAST:event_btnBackActionPerformed

    private void cmbLibraryBranchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbLibraryBranchActionPerformed
        String selectedLibName = (String) cmbLibraryBranch.getSelectedItem();
        Library selectedLib = libList.getLibraryByName(selectedLibName);
        refreshBookTable(selectedLib);
    }//GEN-LAST:event_cmbLibraryBranchActionPerformed

    private void btnSearchBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchBookActionPerformed
        String selectedLibraryName = (String) cmbLibraryBranch.getSelectedItem();
        String searchKeyword = txtSearchBook.getText().trim();

        if (selectedLibraryName == null || selectedLibraryName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please select a library branch first!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Library selectedLibrary = libList.getLibraryByName(selectedLibraryName);
        searchBookByName(searchKeyword, selectedLibrary);
    }//GEN-LAST:event_btnSearchBookActionPerformed

    private void btnRentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRentActionPerformed
        int selectedRow = tblBooks.getSelectedRow();
    
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a book to rent.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String serialNum = (String) tblBooks.getValueAt(selectedRow, 0);
        Book selectedBook = BookCollection.getInstance().searchBookBySerialNumber(serialNum);

        if (!selectedBook.isIsAvailable()) {
            JOptionPane.showMessageDialog(this, "This book is currently unavailable.", "Unavailable", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Library selectedLibrary = selectedBook.getLibrary();

        // Create a pending RentalRequest
        RentalRequest newRequest = requestList.createRequest(
            currentCustomer, selectedBook, selectedLibrary, selectedBook.getPrice());

        JOptionPane.showMessageDialog(this, "Rental request sent successfully! Please wait for approval.", "Success", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnRentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRent;
    private javax.swing.JButton btnSearchBook;
    private javax.swing.JButton btnViewDetail;
    private javax.swing.JComboBox<String> cmbLibraryBranch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLibraryBranch;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblBooks;
    private javax.swing.JTextField txtSearchBook;
    // End of variables declaration//GEN-END:variables

    private void refreshBookTable(Library selectedLibrary) {
        DefaultTableModel model = (DefaultTableModel) tblBooks.getModel();
        model.setRowCount(0);

        if (selectedLibrary != null) {
            for (Book book : allBooks.getBooksByLibrary(selectedLibrary)) {
                Object[] row = new Object[4];
                row[0] = book.getSerialNum();
                row[1] = book.getName();
                row[2] = book.getPrice();
                row[3] = book.isIsAvailable() ? "Available" : "Unavailable";

                model.addRow(row);
            }
        }
    }
    
    private void searchBookByName(String bookName, Library selectedLibrary) {
        DefaultTableModel model = (DefaultTableModel) tblBooks.getModel();
        model.setRowCount(0);

        if (selectedLibrary != null) {
            for (Book book : allBooks.getBooksByLibrary(selectedLibrary)) {
                if (book.getName().toLowerCase().contains(bookName.toLowerCase())) {
                    Object[] row = new Object[4];
                    
                    row[0] = book.getSerialNum();
                    row[1] = book.getName();
                    row[2] = book.getPrice();
                    row[3] = book.isIsAvailable() ? "Available" : "Unavailable";

                    model.addRow(row);
                }
            }
        }
    }
    
    private void populateLibraryBranchComboBox() {
        cmbLibraryBranch.removeAllItems();
        for (Library lib : LibraryDirectory.getInstance().getAllLibraries()) {
            cmbLibraryBranch.addItem(lib.getName());
        }
        cmbLibraryBranch.setSelectedIndex(-1);
    }
}
