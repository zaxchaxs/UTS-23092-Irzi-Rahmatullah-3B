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
        
        String idRoom;
        System.out.println("\n=================================");
        System.out.println("|\tHotel Transylvania\t|");
        System.out.println("=================================");
        
        if(rooms.isEmpty()) {
            System.out.println("| Tidak ada kamar yang terdaftar!");
            System.out.println("| Tekan enter untuk melanjutkan");
            scanner.nextLine();
            return;
        }
        
        System.out.print("| Masukkan ID Kamar yang ingin dihapus: ");
        idRoom = scanner.nextLine();
        
        // Cek apakah id nya ada
        boolean isRoomExist = false;
        boolean isRoomBooked = false;
        for (Room room: rooms) {
            if(room.getRoomId().equals(idRoom)){
                isRoomExist = true;
                isRoomBooked = room.isBooked();
                System.out.println("| Testing");
            };
        };
        
        if(!isRoomExist){
            System.out.println("| Kamar dengan ID " + idRoom + " tidak ditemukan!");
            System.out.println("| Tekan enter untuk melanjutkan");
            scanner.nextLine();
            return;
        } else  if (isRoomBooked) {
            System.out.println("| Kamar dengan ID " + idRoom + " sedang tersewa!]\n| Tidak dapat dihapus!");
            System.out.println("| Tekan enter untuk melanjutkan");
            scanner.nextLine();
            return;
        } else {
            rooms.removeIf(room -> room.getRoomId().equals(idRoom));
            System.out.println("| Kamar telah terhapus!");
            System.out.println("| Tekan enter untuk melanjutkan");
            scanner.nextLine();
        }
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
