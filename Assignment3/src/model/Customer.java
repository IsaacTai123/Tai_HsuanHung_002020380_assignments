/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import common.Role;

/**
 *
 * @author tisaac
 */
public class Customer extends UserProfile {
    
    public Customer() {
        super();
        this.role = Role.CUSTOMER;
    }
    
    public Customer(String name, String pwd, Role role) {
        super(name, pwd, role);
    }
    
    @Override
    void displayRole() {
        System.out.println("Customer has been created");
    }
}
