/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

/**
 *
 * @author Irzi Rhmtllh
 */
import RoomHandlers.Room;
import java.util.List;
import java.util.Scanner;

public class RoomChecks {
    Scanner scanner = new Scanner(System.in);
    
    public void checkAllRooms(List<Room> rooms) {
        System.out.println("\n=================================");
        System.out.println("|\tHotel Transylvania\t|");
        System.out.println("=================================");
        
        if(rooms.isEmpty()) {
            System.out.println("| Tidak ada kamar yang terdaftar!");
            System.out.println("| Tekan enter untuk melanjutkan");
            scanner.nextLine();
            return;
        }
        
        System.out.println("|\tList Kamar\t\t|");
        System.out.println("=================================");
        
        for(Room room: rooms) {
            room.displayRoomDetails();
            System.out.println("");
        }
        System.out.print("Tekan enter untuk lanjut");
        scanner.nextLine();
    };
    
    public void checkNormalRoom(List<Room> rooms) {
        System.out.println("\n=================================");
        System.out.println("|\tHotel Transylvania\t|");
        System.out.println("=================================");
        System.out.println("|\tKamar Normal\t\t|");
        System.out.println("=================================");
        for(Room room: rooms) {
            if("Normal".equals(room.getRoomType())) {
                room.displayRoomDetails();
                System.out.println("");
            }
        }
        
        System.out.print("Tekan enter untuk lanjut");
        scanner.nextLine();
    }
    
    public void checkEksklusifRoom(List<Room> rooms) {
        System.out.println("\n=================================");
        System.out.println("|\tHotel Transylvania\t|");
        System.out.println("=================================");
        System.out.println("|\tKamar Eksklusif\t\t|");
        System.out.println("=================================");
        for(Room room: rooms) {
            if("Eksklusif".equals(room.getRoomType())) {
                room.displayRoomDetails();
                System.out.println("");
            }
        }
        
        System.out.print("Tekan enter untuk lanjut");
        scanner.nextLine();
    }
    
    public void checkBookedRooms(List<Room> rooms) {
        System.out.println("\n=================================");
        System.out.println("|\tHotel Transylvania\t|");
        System.out.println("=================================");
        System.out.println("|\tKamar Tersewa\t\t|");
        for(Room room: rooms) {
            if(room.isBooked()) {
                room.displayRoomDetails();
                System.out.println("");
            }
        }
        System.out.print("Tekan enter untuk lanjut");
        scanner.nextLine();        
    }
    
    public void checkAvailableRooms(List<Room>rooms) {
        System.out.println("\n=================================");
        System.out.println("|\tHotel Transylvania\t|");
        System.out.println("=================================");
        System.out.println("|\tKamar Tersedia\t\t|");
        int totalAvailable = 0;
        for(Room room: rooms) {
            if(!room.isBooked()) {
                totalAvailable++;
                room.displayRoomDetails();
                System.out.println("");
            }
        }
        
        if(totalAvailable == 0) System.out.println("   Tidak ada yang tersedia");

        System.out.print("Tekan enter untuk lanjut");
        scanner.nextLine();        
    }
    
        public boolean checkEksklusifAvailableRooms(List<Room> rooms) {
            System.out.println("\n=================================");
            System.out.println("|\tHotel Transylvania\t|");
            System.out.println("=================================");
            System.out.println("|\tKamar Eksklusif Tersedia|");
            int totalAvailable = 0;
            for(Room room: rooms) {
                if(!room.isBooked() && "Eksklusif".equals(room.getRoomType())) {
                    totalAvailable++;
                    room.displayRoomDetails();
                    System.out.println("");
                }
            }
            if(totalAvailable == 0) {
                System.out.println("\tTidak ada yang tersedia");
                System.out.print("Tekan enter untuk lanjut");
                scanner.nextLine();            
                return false;
            } else {
                System.out.print("Tekan enter untuk lanjut");
                scanner.nextLine();            
                return true;
            }
        };
    
        public boolean checkNormalAvailableRooms(List<Room> rooms) {
            System.out.println("\n=================================");
            System.out.println("|\tHotel Transylvania\t|");
            System.out.println("=================================");
            System.out.println("|\tKamar Normal Tersedia\t|");
            int totalAvailable = 0;
            for(Room room: rooms) {
                if(!room.isBooked() && "Normal".equals(room.getRoomType())) {
                    totalAvailable++;
                    room.displayRoomDetails();
                    System.out.println("");
                }
            }
            if(totalAvailable == 0) {
                System.out.println("\tTidak ada yang tersedia");
                System.out.print("Tekan enter untuk lanjut");
                scanner.nextLine();            
                return false;
            } else {
                System.out.print("Tekan enter untuk lanjut");
                scanner.nextLine();            
                return true;
            }
        };
}
