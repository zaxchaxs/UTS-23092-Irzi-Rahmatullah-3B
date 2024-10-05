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
        
        System.out.println("|\tList Kamar\t\t|");
        System.out.println("=================================");
        
        for(Room room: rooms) {
            room.displayRoomDetails();
            System.out.println("");
        }
        System.out.print("Tekan enter untuk lanjut");
        scanner.nextLine();
    };
    
    public void checkSingleRoom(List<Room> rooms) {
        System.out.println("\n=================================");
        System.out.println("|\tHotel Transylvania\t|");
        System.out.println("=================================");
        System.out.println("|\tKamar Single\t\t|");
        System.out.println("=================================");
        for(Room room: rooms) {
            if("Single".equals(room.getRoomType())) {
                room.displayRoomDetails();
                System.out.println("");
            }
        }
        
        System.out.print("Tekan enter untuk lanjut");
        scanner.nextLine();
    }
    
    public void checkDoubleRoom(List<Room> rooms) {
        System.out.println("\n=================================");
        System.out.println("|\tHotel Transylvania\t|");
        System.out.println("=================================");
        System.out.println("|\tKamar Double\t\t|");
        System.out.println("=================================");
        for(Room room: rooms) {
            if("Double".equals(room.getRoomType())) {
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
}
