/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import static common.Role.ADMIN;
import static common.Role.BRANCH_MANAGER;
import static common.Role.CUSTOMER;

/**
 *
 * @author tisaac
 */
public enum RequestStatus {
    Pending, 
    Accepted, 
    Rejected;
    
    @Override
        public String toString() {
            switch(this) {
                case Pending: return "Pending";
                case Accepted: return "Accepted";
                case Rejected: return "Rejected";
                default: return "Unknown";
            }
        }
}
