/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author tisaac
 */
public class Book extends LibraryItem {
    private static int bookCounter = 1;
    private int serialNum;
    private String author;
    private String name;
    private Date registeredDate;
    private boolean isAvailable;
    private short pageCount;
    private String language;
    
    public Book() {
        this.serialNum = bookCounter++; // Assign a unique serial number
    }
    
}
