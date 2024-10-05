package Hotel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Irzi Rhmtllh
 */
import Users.Admin;
import java.util.Scanner;

public class index {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int loginOptions = displayLoginOutput();
        
        switch(loginOptions) {
            case 1: {
                adminHandler(input);
                break;
            }
                
            case 2:
                System.out.println("Pelanggan");
                break;
                
            default:
                System.out.println("Close");
                break;
        }
    }
    
    private static void adminHandler(Scanner input) {
        // Contoh username dan password
        String usernameAdmin = "admin123";
        String passwordAdmin = "rahasia123";
        String username, password;
        
        do{
            System.out.println("\n\tAnda login sebagai Admin");
            System.out.print("Username (admin123): ");
            username = input.nextLine();
            System.out.print("Password (rahasia123): ");
            password = input.nextLine();

            if(!usernameAdmin.equals(username) || !passwordAdmin.equals(password)) {
                System.out.println("Username atau password salah!");
                System.out.println("\tUlangi lagi (enter)");
                input.nextLine();
            }
        } while (!usernameAdmin.equals(username) || !passwordAdmin.equals(password));
        
        Admin admin = new Admin("Irzi", "Admin");
        admin.displayMenu();
        
        int menuOptions;
        System.out.print("Pilihan: ");
        menuOptions = input.nextInt();
        
        switch (menuOptions) {
            case 1:
                
                break;
            default:
                throw new AssertionError();
        }
    }
    
    private static int displayLoginOutput() {
        Scanner input = new Scanner(System.in);
        int pilihan;
        
        do{
            System.out.println("\tHotel Transylvania\n");
            System.out.println("Masuk sebagai: \n1. Admin \n2. Pelanggan");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();
        } while(pilihan < 0 || pilihan > 2);
        
        return pilihan;
    };
    
    
}
