package Hotel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Irzi Rhmtllh
 */
import RoomHandlers.*;
import Users.Admin;
import Users.Customer;
import Utils.DefaultRooms;
import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MenuHandlers menuHandler = new MenuHandlers();
        
        Room room1 = new Room("K001", "Normal", 100000, false);
        Room room2 = new Room("K002", "Eksklusif", 200000, false);
        menuHandler.addDefaultRooms(room1);
        menuHandler.addDefaultRooms(room2);
        
//        // add default rooms
//        DefaultRooms defRoom = new DefaultRooms();
//        defRoom.addDefaultRoom();
        int loginOptions;
        do{
            loginOptions = displayLoginOutput();
            
            switch(loginOptions) {
                case 1: {
                    adminHandler(input, menuHandler);
                    break;
                }
                case 2:
                    userHandler(input, menuHandler);
                    break;
                case 0:
                    System.out.println("Keluar");
                    
                    return;
                default:
                    break;
            }
            
        } while(loginOptions >0 || loginOptions < 2);
    }
    
    private static void adminHandler(Scanner input, MenuHandlers menuHandler) {
        // Contoh username dan password
        String usernameAdmin = "admin123";
        String passwordAdmin = "rahasia123";
        String username, password;
        System.out.println("\n\tAnda login sebagai Admin");
        System.out.print("\t\t(Enter)");
        input.nextLine();
        do{
            System.out.print("\nUsername (admin123): ");
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

        int menuOptions;
        do{
            admin.displayMenu();
            System.out.print("Pilihan: ");
            menuOptions = input.nextInt();
            input.nextLine();
            switch (menuOptions) {
            case 1:
                menuHandler.showAllRooms();
                break;
            case 2:
                menuHandler.showBookedRooms();
                break;
            case 3: 
                menuHandler.showNormalRooms();
                break;
            case 4:
                menuHandler.showEksklusifRooms();
                break;
            case 5:
                menuHandler.addRoom();
                break;
            case 6:
                menuHandler.deleteRoom();
                break;
                
            case 0: break;
            
            default:
                break;
        }
        
        } while (menuOptions > 0);
    }
    
    private static void userHandler (Scanner input, MenuHandlers menuHandler) {
        String name;
        System.out.print("Masukkan nama anda: ");
        name = input.nextLine();

        Customer customer = new Customer(name, "customer", true);

        int menuOptions;
        do {
            customer.displayMenu();
            System.out.print("Pilihan: ");
            menuOptions = input.nextInt();

            switch(menuOptions) {
                case 1:
                    menuHandler.reserveRoom(name);
                    break;
                case 2:
                    menuHandler.showAvailabelRooms();
                    break;
                case 3:
                    menuHandler.showAvailableEksklusifRooms();
                    break;
                case 4:
                    menuHandler.showAvailableNormalRooms();
                    break;
                case 0:
                    return;
                default:
                    break;
            }

        } while(menuOptions > 0 && menuOptions < 5);

    }
    private static int displayLoginOutput() {
        Scanner input = new Scanner(System.in);
        int pilihan;
        
        do{
            System.out.println("\tHotel Transylvania\n");
            System.out.println("Masuk sebagai: \n1. Admin \n2. Pelanggan\n0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();
        } while(pilihan < 0 || pilihan > 2);
        
        return pilihan;
    };
    
    
}
