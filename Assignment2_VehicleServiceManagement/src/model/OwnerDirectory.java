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
public class OwnerDirectory {
    
    private ArrayList<Owner> ownerDirectory;
    
    public OwnerDirectory() {
        ownerDirectory = new ArrayList<>();
    }
    
    public Owner addNewOwner() {
        Owner o = new Owner();
        ownerDirectory.add(o);
        return o;
    }

    public ArrayList<Owner> getOwnerDirectory() {
        return ownerDirectory;
    }

    public void setOwnerDirectory(ArrayList<Owner> ownerDirectory) {
        this.ownerDirectory = ownerDirectory;
    }
    
    
    
    
}
