/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Users;

/**
 *
 * @author Irzi Rhmtllh
 */

import Interfaces.UserInterface;

// Class buat di extends user lain
public class User implements UserInterface {
    protected String name, role;
    
    public User(String name, String role) {
        this.name = name;
        this.role = role;
    };
    
    public void displayMenu() {
        System.out.println("\n=================================");
        System.out.println("|\tHotel Transylvania\t|");
        System.out.println("=================================");
    };
    
    
    
    
}
