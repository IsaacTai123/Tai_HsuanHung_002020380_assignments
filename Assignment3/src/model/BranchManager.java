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
public class BranchManager extends UserProfile {
    
    public BranchManager() {
        super(); // Optional (Better to omit in this case)
        this.role = Role.BRANCH_MANAGER;
    }
    
    public BranchManager(String name, String pwd, Role role) {
        super(name, pwd, role);
    }
    
    @Override
    void displayRole() {
        System.out.println("Branch Manager has been created");
    }
    
}
