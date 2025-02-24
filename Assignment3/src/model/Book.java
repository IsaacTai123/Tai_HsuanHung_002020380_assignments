/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
import java.util.Random;

/**
 *
 * @author tisaac
 */
public class Book {
    private String author;
    private String serialNum;
    private String name;
    private Date registeredDate;
    private boolean isAvailable = true;
    private short numberOfPages;
    private String language;
    private Library library;
    
    public Book(String name, Date registeredDate, Library library) {
        this.serialNum = generateRandomSerialNumber(8); // Assign a unique serial number
        this.name = name;
        this.library = library;
        this.registeredDate = registeredDate;
    }
    
    public Book() {
        
    }
    
    // Random Serial Number Generator
    private String generateRandomSerialNumber(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder serial = new StringBuilder();
        Random rnd = new Random();

        for (int i = 0; i < length; i++) {
            int index = rnd.nextInt(chars.length());
            serial.append(chars.charAt(index));
        }

        return serial.toString();
    }
    
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSerialNum() {
        return serialNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(Date registeredDate) {
        this.registeredDate = registeredDate;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public short getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(short numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }
    
    @Override
    public String toString() {
        return serialNum;
    }
}