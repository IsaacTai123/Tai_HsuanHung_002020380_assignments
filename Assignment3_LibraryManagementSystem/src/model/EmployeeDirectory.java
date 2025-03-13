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
public class EmployeeDirectory {
    
    private static EmployeeDirectory instance;
    private ArrayList<BranchManager> emList;

    private EmployeeDirectory() {
        emList = new ArrayList<>();
    }
    
    public static synchronized EmployeeDirectory getInstance() {
        if (instance == null) {
            instance = new EmployeeDirectory();
        }
        return instance;
    }

    public void addBranchManager(BranchManager bm) {
        emList.add(bm);
    }

    public ArrayList<BranchManager> getAllBranchManagers() {
        return emList;
    }

    public BranchManager getBranchManagerByEmployeeID(String id) {
        for (BranchManager bm : emList) {
            if (bm.getEmployeeID().equals(id)) {
                return bm;
            }
        }
        return null;
    }
}
