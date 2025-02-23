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
abstract class UserProfile {
    static int idCounter = 1;
    protected int id;
    protected String name;
    protected String pwd;
    protected Role role;
    
    public UserProfile() {
        this.id = idCounter++; // Assign unique ID and increment
    }
    
    public UserProfile(String name, String pwd, Role role) {
        this(); // Call the parameterless constructor above to assign a value to userID.
        this.name = name;
        this.pwd = pwd;
        this.role = role;
    }
    
    abstract void displayRole();
}
