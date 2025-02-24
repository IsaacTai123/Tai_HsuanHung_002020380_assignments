/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import common.RequestStatus;
import java.util.Date;
import java.util.UUID;

/**
 *
 * @author tisaac
 */
public class RentalRequest {
    
    private String requestID;
    private Customer customer;
    private Book book;
    private Date requestDate;
    private RequestStatus status;
    private double price;
    private Library library;

    public RentalRequest(Customer customer, Book book, Library lib, double price) {
        this.requestID = UUID.randomUUID().toString().substring(0, 8);
        this.customer = customer;
        this.book = book;
        this.requestDate = new Date();
        this.status = RequestStatus.Pending;
        this.price = price;
        this.library = lib;
    }

    public String getRequestID() {
        return requestID;
    }

    public void setRequestID(String requestID) {
        this.requestID = requestID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public RequestStatus getStatus() {
        return status;
    }

    public void setStatus(RequestStatus status) {
        this.status = status;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }
    
}
