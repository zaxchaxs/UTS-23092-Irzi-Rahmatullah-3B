/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RoomHandlers;

/**
 *
 * @author Irzi Rhmtllh
 */

import Interfaces.MenuInterface;
import Utils.RoomChecks;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuHandlers implements MenuInterface{
    
    private List<Room> rooms;
    private List<Booking> bookings;
    Scanner scanner = new Scanner(System.in);
    
    RoomChecks checkRooms = new RoomChecks();
    
    public MenuHandlers() {
        rooms = new ArrayList<>();
        bookings = new ArrayList<>();
    };
    
    
    //  Method Admin
    
    public void showAllRooms() {
        checkRooms.checkAllRooms(rooms);
    };
    
    public void showBookedRooms() {
        checkRooms.checkBookedRooms(rooms);
    }
    
    public void showEksklusifRooms() {
        checkRooms.checkSingleRoom(rooms);
    }
    
    public void showNormalRooms() {
        checkRooms.checkDoubleRoom(rooms);
    }
        
    public void addRoom() {
        String idRoom, type;
        double price;

        System.out.println("\n=================================");
        System.out.println("|\tHotel Transylvania\t|");
        System.out.println("=================================");
        System.out.println("|\tTambah Kamar\t\t|");
        System.out.print("| ID Kamar: "); 
        idRoom = scanner.nextLine();
        System.out.print("| Tipe (Single/Double): "); 
        type = scanner.nextLine();
        System.out.print("| Harga: "); 
        price = scanner.nextInt();
        
        Room newRoom = new Room(idRoom, type, price, false);
        rooms.add(newRoom);
    };
    
    public void deleteRoom() {
    
    }
    
    public List<Room> getAvailableRooms() {
        List<Room> availableRooms = new ArrayList<>();
        for(Room room : rooms) {
            if(!room.isBooked()) {
                availableRooms.add(room);
                room.displayRoomDetails();
            }
                room.displayRoomDetails();
        };
        
        return availableRooms;
    };
    
    public void addDefaultRooms(Room room) {
        rooms.add(room);
    };
    
    
//    public Booking createBooking(String customerName, int roomNumber, int nights) {
//        for (Room room : rooms) {
//            if (room.getRoomNumber() == roomNumber && room.isAvailable()) {
//                Booking booking = new Booking(customerName, room, nights);
//                bookings.add(booking);
//                return booking;
//            }
//        }
//        return null;
//    }
    
    
}
