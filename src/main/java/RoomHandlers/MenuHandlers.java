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
    
    public void showAllRooms() {
        checkRooms.checkAllRooms(rooms);
    };
    public void showBookedRooms() {
        checkRooms.checkBookedRooms(rooms);
    }
    public void showAvailabelRooms() {
        checkRooms.checkAvailableRooms(rooms);
    }
    public void showEksklusifRooms() {
        checkRooms.checkEksklusifRoom(rooms);
    }
    public boolean showAvailableEksklusifRooms() {
        return checkRooms.checkEksklusifAvailableRooms(rooms);
    }
    public void showNormalRooms() {
        checkRooms.checkNormalRoom(rooms);
    }
    public boolean showAvailableNormalRooms() {
        return checkRooms.checkNormalAvailableRooms(rooms);
    }
    public void addRoom() {
        String idRoom, type;
        double price;

        System.out.println("\n=================================");
        System.out.println("|\tHotel Transylvania\t|");
        System.out.println("=================================");
        System.out.println("|\tTambah Kamar\t\t|");
        System.out.print("\t(Enter)");
        scanner.nextLine();
        System.out.print("\n| ID Kamar: "); 
        idRoom = scanner.nextLine();
        System.out.print("| Tipe (Normal/Eksklusif): "); 
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
        
        System.out.print("\t(Enter)");
        scanner.nextLine();
        System.out.print("\n| Masukkan ID Kamar yang ingin dihapus: ");
        idRoom = scanner.nextLine();
        
        // Cek apakah id nya ada
        boolean isRoomExist = false;
        boolean isRoomBooked = false;
        for (Room room: rooms) {
            if(room.getRoomId().equals(idRoom)){
                isRoomExist = true;
                isRoomBooked = room.isBooked();
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
        public void reserveRoom(String customerName) {
        int menuChoises;
        
        do {
            System.out.println("\n=================================");
            System.out.println("|\tHotel Transylvania\t|");
            System.out.println("=================================");
            System.out.println("|\tPilih Jenis Kamar\t|");
            System.out.println("|1. Normal");
            System.out.println("|2. Eksklusif");
            System.out.print("| Pilihan (1/2): ");
            menuChoises = scanner.nextInt();

            switch (menuChoises) {
                case 1: {
                    String idKamar;
                    int inputPrice;
                    boolean isAvailable = showAvailableNormalRooms();
                    if(!isAvailable) {
                        return;
                    }
                    boolean isIdFound = false;
                    scanner.nextLine();
                    do{
                        System.out.print("| Masukkan ID Kamar\n| Yang ingin disewa: ");
                        idKamar = scanner.nextLine();
                        for(Room room: rooms) {
                           if(room.getRoomId().equals(idKamar) && room.isBooked() == false) {
                               System.out.println("| Harga sewa permalam: " + room.getPrice());
                               System.out.print("| Berapa malam ingin sewa kamar: ");
                               inputPrice = scanner.nextInt();
                               System.out.println("\nBerhasil!");
                               System.out.println("| Total : " + (inputPrice*room.getPrice()) + "\nPembayaran dilakukan saat checkout!");
                               room.setBooked(true);
                               room.setCustomerName(customerName);
                               isIdFound = true;
                               scanner.nextLine();
                               System.out.print("\t(Enter)");
                               scanner.nextLine();
                               return;
                           }
                        }
                        System.out.println("| ID Kamar tidak ditemukan!");                    
                    } while(!isIdFound);
                    break;
                }

                case 2: {
                    String idKamar;
                    int inputPrice;
                    boolean isAvailable = showAvailableEksklusifRooms();
                    if(!isAvailable) {
                        return;
                    }
                    boolean isIdFound = false;
                    scanner.nextLine();
                    do{
                        System.out.print("| Masukkan ID Kamar\n| Yang ingin disewa: ");
                        idKamar = scanner.nextLine();
                        for(Room room: rooms) {
                           if(room.getRoomId().equals(idKamar) && room.isBooked() == false) {
                               System.out.println("| Harga sewa permalam: " + room.getPrice());
                               System.out.print("| Berapa lama ingin sewa kamar: ");
                               inputPrice = scanner.nextInt();
                               System.out.println("\nBerhasil!");                               
                               System.out.println("| Total : " + (inputPrice*room.getPrice()) + "\nPembayaran dilakukan saat checkout!");
                               room.setBooked(true);
                               room.setCustomerName(customerName);
                               isIdFound = true;
                               scanner.nextLine();
                               System.out.print("\t(Enter)");
                               scanner.nextLine();
                               return;
                           }
                        }
                        System.out.println("| ID Kamar tidak ditemukan!");                    
                    } while(!isIdFound);
                    break;                
                }
                default:
                    break;

            }        
        } while (menuChoises > 0 && menuChoises < 3);        
    }
    
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
