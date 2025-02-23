/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import interfaces.IUserProfile;
import common.Role;
import java.util.ArrayList;

/**
 *
 * Singleton UserDirectory Class
 * @author tisaac
 */
public class UserDirectory {
    
    private static UserDirectory instance;
    private ArrayList<IUserProfile> userList;
    
    private UserDirectory() {
        userList = new ArrayList<>();
    }
    
    public static synchronized UserDirectory getInstance() {
        if (instance == null) {
            instance = new UserDirectory(); 
        } 
        
        return instance;
    }
    
    public Admin createAdmin(String name, String pwd, Role role) {
        Admin admin = new Admin(name, pwd, role);
        userList.add(admin);
        return admin;
    }

    public BranchManager createBranchManager(String name, String pwd, Role role) {
        BranchManager manager = new BranchManager(name, pwd, role);
        userList.add(manager);
        return manager;
    }

    public Customer createCustomer(String name, String pwd, Role role) {
        Customer customer = new Customer(name, pwd, role);
        userList.add(customer);
        return customer;
    }
    
    public void removeUser(IUserProfile u) {
        userList.remove(u);
    }
    
    public ArrayList<IUserProfile> getAllUsers() {
        return userList;
    }
}
