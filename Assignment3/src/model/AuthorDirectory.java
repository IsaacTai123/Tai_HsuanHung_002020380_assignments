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
public class AuthorDirectory {
    
    private static AuthorDirectory instance;
    private ArrayList<Author> authorList;

    private AuthorDirectory() {
        authorList = new ArrayList<>();
    }
    
    public static synchronized AuthorDirectory getInstance() {
        if (instance == null) {
            instance = new AuthorDirectory();
        }
        return instance;
    }

    public Author addAuthor(String name, String nationality) {
        Author author = new Author(name, nationality);
        authorList.add(author);
        return author;
    }

    public void removeAuthor(Author author) {
        authorList.remove(author);
    }

    public ArrayList<Author> getAllAuthors() {
        return authorList;
    }

    public Author findAuthorByName(String name) {
        for (Author author : authorList) {
            if (author.getName().equalsIgnoreCase(name)) {
                return author;
            }
        }
        return null;
    }
}
