/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author tisaac
 */
public class BookCollection {
    
    private static BookCollection instance;
    private ArrayList<Book> allBooks;
    
    private BookCollection() {
        allBooks = new ArrayList<>();
    }
    
    public static synchronized BookCollection getInstance() {
        if (instance == null) {
            instance = new BookCollection();
        }
        return instance;
    }
    
    public Book addNewBook(String name, Date registeredDate, Library library, Author author, double price, String language, short numOfPage) {
        Book b = new Book(name, registeredDate, library, author, price, language, numOfPage);
        allBooks.add(b);
        return b;
    }
    
    public void removeBook(Book b) {
        allBooks.remove(b);
    }
    

    public ArrayList<Book> getAllBooks() {
        return allBooks;
    }

    public ArrayList<Book> getBooksByLibrary(Library library) {
        ArrayList<Book> booksInLibrary = new ArrayList<>();
        for (Book book : allBooks) {
            if (book.getLibrary().equals(library)) {
                booksInLibrary.add(book);
            }
        }
        return booksInLibrary;
    }

    public Book searchBookBySerialNumber(String serialNumber) {
        for (Book book : allBooks) {
            if (book.getSerialNum().equals(serialNumber)) {
                return book;
            }
        }
        return null;
    }
    
    public ArrayList<Book> searchBookByAuthor(String name) {
        ArrayList<Book> books = new ArrayList<>();
        for (Book b : allBooks) {
            if (b.getName().equals(name)) {
                books.add(b);
            }
        }
        return books;
    }
}
