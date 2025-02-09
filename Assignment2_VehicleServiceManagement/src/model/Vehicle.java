/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author tisaac
 */
public class Vehicle {
    
    private String id;
    private String make;
    private String model;
    private int year;
    private String registrationNum;
    private Service serviceOpted;
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getRegistrationNum() {
        return registrationNum;
    }

    public void setRegistrationNum(String registrationNum) {
        this.registrationNum = registrationNum;
    }

    public Service getServiceOpted() {
        return serviceOpted;
    }

    public void setServiceOpted(Service serviceOpted) {
        this.serviceOpted = serviceOpted;
    }
    
    @Override
    public String toString() {
        return id;
    }
}
