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
public class LibraryDirectory {
    
    private static LibraryDirectory instance;
    private ArrayList<Library> libraries;

    private LibraryDirectory() {
        libraries = new ArrayList<>();
    }
    
    public static synchronized LibraryDirectory getInstance() {
        if (instance == null) {
            instance = new LibraryDirectory();
        }
        return instance;
    }

    public Library addLibrary(String name, int buildingNo, BranchManager manager) {
        Library l = new Library(name, buildingNo, manager);
        libraries.add(l);
        return l;
    }

    public void removeLibrary(Library library) {
        libraries.remove(library);
    }

    public ArrayList<Library> getAllLibraries() {
        return libraries;
    }

    public Library getLibraryByName(String name) {
        for (Library lib : libraries) {
            if (lib.getName().equalsIgnoreCase(name)) {
                return lib;
            }
        }
        return null;
    }
}
