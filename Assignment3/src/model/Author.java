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
public class Author {
    private String name;
    private String nationality;
    private ArrayList<Book> books;
    
    public Author(String name, String nationality, ArrayList<Book> books) {
        this.name = name;
        this.nationality = nationality;
        this.books = (books != null) ? books : new ArrayList<>();
    }
    
    public Author(String name, String nationality) {
        this(name, nationality, new ArrayList<>());
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
    
    public void addBooks(Book book) {
        books.add(book);
    }
    
    @Override
    public String toString() {
        return name;
    }
}
