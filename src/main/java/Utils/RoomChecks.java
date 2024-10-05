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
import java.util.ArrayList;
import java.util.List;

public class RoomChecks {
    private List<Room> rooms;
    
    public RoomChecks() {
        rooms = new ArrayList<>();
    };
    
    public void checkAllRooms() {
        System.out.println("\n=================================");
        System.out.println("|\tHotel Transylvania\t|");
        System.out.println("=================================");
        
        System.out.println("|\tKamar Eksklusif\t\t|");
        System.out.println("=================================");
        for(Room room: rooms) {
            if(room.getRoomType() == "Eksklusif") {
                room.displayRoomDetails();
                System.out.println("");
            }
        }
        
        System.out.println("=================================");
        System.out.println("|\tKamar Normal\t\t|");
        System.out.println("=================================");
        for(Room room: rooms) {
            if(room.getRoomType() == "Normal") {
                room.displayRoomDetails();
                System.out.println("");
            }
        }    
    };
    
    public void checkEksklusifRoom() {
        System.out.println("\n=================================");
        System.out.println("|\tHotel Transylvania\t|");
        System.out.println("=================================");
        System.out.println("|\tKamar Eksklusif\t\t|");
        System.out.println("=================================");
        for(Room room: rooms) {
            if(room.getRoomType() == "Eksklusif") {
                room.displayRoomDetails();
                System.out.println("");
            }
        }
    }
    
    public void checkNormalRoom() {
        System.out.println("\n=================================");
        System.out.println("|\tHotel Transylvania\t|");
        System.out.println("=================================");
        System.out.println("|\tKamar Normal\t\t|");
        System.out.println("=================================");
        for(Room room: rooms) {
            if(room.getRoomType() == "Normal") {
                room.displayRoomDetails();
                System.out.println("");
            }
        }    
    }
    
    public void checkBookedRooms() {
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
        
    }
}
