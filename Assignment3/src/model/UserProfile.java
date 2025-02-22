/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author tisaac
 */
abstract class UserProfile {
    static int idCounter = 1;
    protected int id;
    protected String name;
    
    public UserProfile(String name) {
        this.id = idCounter++; // Assign unique ID and increment
        this.name = name;
    }
    
    abstract void displayRole();
}
