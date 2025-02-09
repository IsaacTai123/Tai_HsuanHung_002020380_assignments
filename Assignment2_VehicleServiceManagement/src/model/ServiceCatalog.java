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
public class ServiceCatalog {
    
    private ArrayList<Service> serviceCatalog;
    
    public ServiceCatalog() {
        serviceCatalog = new ArrayList<>();
    }
    
    public Service addNewService() {
        Service s = new Service();
        serviceCatalog.add(s);
        return s;
    }
    
    public void removeService(Service s) {
        serviceCatalog.remove(s);
    }

    public ArrayList<Service> getServiceCatalog() {
        return serviceCatalog;
    }

    public void setServiceCatalog(ArrayList<Service> serviceCatalog) {
        this.serviceCatalog = serviceCatalog;
    }
    
    
}
