/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RoomHandlers;

/**
 *
 * @author Irzi Rhmtllh
 */

import RoomHandlers.*;
import Utils.RoomChecks;
import java.util.ArrayList;
import java.util.List;

public class Reservation {
    
    
    private List<Room> rooms;
    private List<Booking> bookings;
    
    RoomChecks checkRooms = new RoomChecks();
    public Reservation() {
        rooms = new ArrayList<>();
        bookings = new ArrayList<>();
    };

    
    //  Method Admin

    public void showAllRooms() {
        checkRooms.checkAllRooms();
    };
    
    public void showBookedRooms() {
        checkRooms.checkBookedRooms();
    }
    
    public void showEkslusifRoom() {
        checkRooms.checkEksklusifRoom();
    }
    
    public void showNormalRoom() {
        checkRooms.checkNormalRoom();
    }
    
    
    
        
    public void addRoom(Room room) {
        rooms.add(room);
    };
    
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
