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
    
    private static char currentLetter = 'A';
    private static int currentNumber = 0;
    private String employeeID;
    private String experience;
    
    
    public BranchManager(String name, String pwd, Role role) {
        super(name, pwd, role);
        this.employeeID = generateEmployeeID();
    }
    
    public BranchManager() {
        this("", "", null);
    }
    
    private static String generateEmployeeID() {
        if (currentNumber > 999) {
            currentNumber = 0;
            currentLetter++;
        }
        String id = String.format("%c%03d", currentLetter, currentNumber++);
        return id;
    }
    
    public String getEmployeeID() {
        return employeeID;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }
    
    @Override
    void displayRole() {
        System.out.println("Branch Manager has been created");
    }
}
