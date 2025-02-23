/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

/**
 *
 * @author tisaac
 */

public enum Role {
        ADMIN,
        BRANCH_MANAGER,
        CUSTOMER;
        
        @Override
        public String toString() {
            switch(this) {
                case ADMIN: return "ADMIN";
                case CUSTOMER: return "CUSTOMER";
                case BRANCH_MANAGER: return "BRANCH_MANAGER";
                default: return "Unknown";
            }
        }
}