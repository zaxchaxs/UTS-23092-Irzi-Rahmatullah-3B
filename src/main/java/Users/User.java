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
    protected boolean isBooking = false;
    
//    overloading
    public User(String name, String role) {
        this.name = name;
        this.role = role;
    };
    
    public User(String name, String role, boolean isBooking) {
        this.name = name;
        this.role = role;
        this.isBooking = isBooking;
    };
    
    public User(boolean isBooking) {
        this.isBooking = isBooking;
    };
    
    @Override
    public void displayMenu() {
        System.out.println("\n=================================");
        System.out.println("|\tHotel Transylvania\t|");
        System.out.println("=================================");
    };
    
    
    
    
}
