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
    private ArrayList<Library> libList;

    private LibraryDirectory() {
        libList = new ArrayList<>();
    }
    
    public static synchronized LibraryDirectory getInstance() {
        if (instance == null) {
            instance = new LibraryDirectory();
        }
        return instance;
    }

    public Library addLibrary(String name, int buildingNo, BranchManager manager) {
        Library l = new Library(name, buildingNo, manager);
        libList.add(l);
        return l;
    }

    public void removeLibrary(Library library) {
        libList.remove(library);
    }

    public ArrayList<Library> getAllLibraries() {
        return libList;
    }

    public Library getLibraryByName(String name) {
        for (Library lib : libList) {
            if (lib.getName().equalsIgnoreCase(name)) {
                return lib;
            }
        }
        return null;
    }
}
