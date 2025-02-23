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
    private static int idCount = 1;
    private int id;
    private int buildingNo;
    private BranchManager manager;
    private BookCollection bookCollection;
    
    public Library(int num, BranchManager m, BookCollection bc) {
        this.id = idCount++;
        buildingNo = num;
        manager = m;
        bookCollection = bc;
    }
}
