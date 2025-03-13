/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import interfaces.IUserProfile;
import common.Role;

/**
 *
 * @author tisaac
 */
abstract class UserProfile implements IUserProfile {
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
    
    @Override
    public int getId() {
        return id;
    }
    
    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return getRole().toString();
    }
}
