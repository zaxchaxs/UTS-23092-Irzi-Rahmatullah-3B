/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Users;

/**
 *
 * @author Irzi Rhmtllh
 */

import Users.User;

public class Customer extends User {

    public Customer(String name, String role) {
        super(name, role);
    };
//    overloading
    public Customer(boolean isBooking) {
        super(isBooking);
    };
    public Customer(String name, String role, boolean isBooking) {
        super(name, role, isBooking);
    };

    @Override
    public void displayMenu() {
        super.displayMenu();
        if(super.isBooking) {
            System.out.println("| 1. Sewa Kamar");
            System.out.println("| 2. Ketersediaan Semua Kamar\t|");
            System.out.println("| 3. Ketersediaan Kamar Eksklusif|");
            System.out.println("| 4. Ketersediaan Kamar Normal \t|");
            System.out.println("| 0. Kembali \t\t\t|");
            System.out.println("=================================");
        } else {
            System.out.println("| 1. Ketersediaan Semua Kamar\t|");
            System.out.println("| 2. Ketersediaan Kamar Eksklusif|");
            System.out.println("| 3. Ketersediaan Kamar Normal\t|");
            System.out.println("| 4. Tentang Hotel Kami\t\t|");
            System.out.println("| 0. Kembali \t\t\t|");
            System.out.println("=================================");
            
        }
    }
    
    
    
}
