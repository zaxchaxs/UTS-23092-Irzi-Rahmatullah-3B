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

public class Admin extends User{

    public Admin(String name, String role) {
        super(name, role);
    };

    @Override
    public void displayMenu() {
        super.displayMenu();
        System.out.println("| 1. Cek Semua Kamar \t\t|");
        System.out.println("| 2. Cek Kamar Tersewa \t\t|");
        System.out.println("| 3. Cek Kamar Normal \t\t|");
        System.out.println("| 4. Cek Kamar Eksklusif \t|");
        System.out.println("| 5. Tambah Kamar \t\t|");
        System.out.println("| 6. Hapus Kamar \t\t|");
        System.out.println("| 0. Kembali \t\t\t|");
        System.out.println("=================================");

    }
    
    
    
}
