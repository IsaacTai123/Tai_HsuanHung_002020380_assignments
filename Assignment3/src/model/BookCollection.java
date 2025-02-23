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
public class BookCollection {
    private ArrayList<Book> bookCollection;
    
    public BookCollection() {
        bookCollection = new ArrayList<>();
    }
    
    public Book addNewBook() {
        Book b = new Book();
        bookCollection.add(b);
        return b;
    }
    
    public void removeBook(Book b) {
        bookCollection.remove(b);
    }
    
    
}
