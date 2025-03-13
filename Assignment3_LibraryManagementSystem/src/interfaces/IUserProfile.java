/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import common.Role;

/**
 *
 * @author tisaac
 */
public interface IUserProfile {
    int getId();
    String getName();
    String getPwd();
    Role getRole();
    
    @Override
    String toString();
}
