/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.awt.CardLayout;
import java.util.Stack;
import javax.swing.JPanel;

/**
 *
 * @author tisaac
 */
public class NavigationUtils {
    private JPanel workArea;
    private Stack<String> history; // Stores visited panels
    
     public NavigationUtils(JPanel workArea) {
        this.workArea = workArea;
        this.history = new Stack<>();
    }
     
    public void showCard(JPanel panel, String name) {
        // Add to history only if the last visited panel is different
        if (!history.isEmpty() && !history.peek().equals(name)) {
            history.push(name);
        }
        
        // Check if the panel already exists
        if (!panelExists(name)) {
            workArea.add(name, panel);
        }
        
        // Force CardLayout to refresh
        workArea.revalidate();  // Ensures new components are recognized
        workArea.repaint();     // Forces UI to redraw

        
        // Show the requested panel
        CardLayout ly = (CardLayout) workArea.getLayout();
        ly.show(workArea, name);
    }
    
    private boolean panelExists(String name) {
        for (java.awt.Component comp : workArea.getComponents()) {
            if (name.equals(comp.getName())) {
                return true;
            }
        }
        return false;
    }
}
