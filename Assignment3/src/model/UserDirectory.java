/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author tisaac
 */
public class UserDirectory {
    private ArrayList<UserProfile> userList;
    
    public UserDirectory() {
        userList = new ArrayList<>();
    }
    
    public Admin createAdmin() {
        Admin admin = new Admin();
        userList.add(admin);
        return admin;
    }

    public BranchManager createBranchManager() {
        BranchManager manager = new BranchManager();
        userList.add(manager);
        return manager;
    }

    public Customer createCustomer() {
        Customer customer = new Customer();
        userList.add(customer);
        return customer;
    }
    
    public ArrayList<UserProfile> getAllUsers() {
        return userList;
    }
}
