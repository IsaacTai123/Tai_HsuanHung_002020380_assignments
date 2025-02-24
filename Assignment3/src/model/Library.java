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
public class Library {
    private String name;
    private int buildingNo;
    private BranchManager manager;
    private BookCollection bookCollection;
    
    public Library(String name, int buildingNo, BranchManager manager) {
        this.name = name;
        this.buildingNo = buildingNo;
        this.manager = manager;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBuildingNo() {
        return buildingNo;
    }

    public void setBuildingNo(int buildingNo) {
        this.buildingNo = buildingNo;
    }

    public BranchManager getManager() {
        return manager;
    }

    public void setManager(BranchManager manager) {
        this.manager = manager;
    }

    public BookCollection getBookCollection() {
        return bookCollection;
    }
    
    public void setBookCollection(BookCollection bookCollection) {
        this.bookCollection = bookCollection;
    }

    @Override
    public String toString() {
        return name;
    }
}
