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
public class VehicleDirectory {
    
    private ArrayList<Vehicle> vehicleDirectory;
    
    public VehicleDirectory() {
        vehicleDirectory = new ArrayList<>();
    }
    
    public Vehicle addNewVehicle() {
        Vehicle v = new Vehicle();
        vehicleDirectory.add(v);
        return v;
    }
    
    public Vehicle addNewVehicleWithData(String id, String make, String model, int year, String registrationNum, Service serviceOpted) {
        Vehicle vehicle = new Vehicle(id, make, model, year, registrationNum, serviceOpted);
        vehicleDirectory.add(vehicle); 
        return vehicle;
    }

    public ArrayList<Vehicle> getVehicleDirectory() {
        return vehicleDirectory;
    }

    public void setVehicleDirectory(ArrayList<Vehicle> vehicleDirectory) {
        this.vehicleDirectory = vehicleDirectory;
    }
    
    
}
