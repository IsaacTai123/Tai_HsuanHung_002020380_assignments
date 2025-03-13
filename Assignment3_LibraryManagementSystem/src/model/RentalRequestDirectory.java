/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 *
 * @author tisaac
 */
public class RentalRequestDirectory {
    
    private static RentalRequestDirectory instance;
    private ArrayList<RentalRequest> requestList;

    private RentalRequestDirectory() {
        requestList = new ArrayList<>();
    }

    public static synchronized RentalRequestDirectory getInstance() {
        if (instance == null) {
            instance = new RentalRequestDirectory();
        }
        return instance;
    }

    public RentalRequest createRequest(Customer customer, Book book, Library lib, double price) {
        RentalRequest request = new RentalRequest(customer, book, lib, price);
        requestList.add(request);
        return request;
    }

    public void removeRequest(RentalRequest request) {
        requestList.remove(request);
    }

    public ArrayList<RentalRequest> getAllRequests() {
        return requestList;
    }

    public RentalRequest getRequestByID(String id) {
        for (RentalRequest request : requestList) {
            if (request.getRequestID().equals(id)) {
                return request;
            }
        }
        return null;
    }
    
    public ArrayList<RentalRequest> getRequestsByLibrary(Library library) {
        return requestList.stream()
                .filter(r -> r.getLibrary().equals(library))
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
