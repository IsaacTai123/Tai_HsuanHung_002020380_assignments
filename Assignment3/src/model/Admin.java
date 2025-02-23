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
public class Admin extends UserProfile {
    
    public Admin() {
        super();
        this.role = Role.ADMIN;
    }

    public Admin(String name, String pwd, Role role) {
        super(name, pwd, role);
    }

    @Override
    void displayRole() {
        System.out.println("Admin has been created");
    }
    
}
