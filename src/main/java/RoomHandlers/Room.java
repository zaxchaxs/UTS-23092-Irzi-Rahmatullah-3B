/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RoomHandlers;

/**
 *
 * @author Irzi Rhmtllh
 */
public class Room {
    private String IdRoom;
    private String type;
    private double priceRoom;
    private boolean isBooked;
    
    Room(String id, String type, double price, boolean isBooked) {
        IdRoom = id;
        this.type = type;
        priceRoom = price;
        this.isBooked = isBooked;
    };
    
    public void setBooked(boolean isBooked) {
        this.isBooked = isBooked;
    };
    
    public boolean isBooked() {
        return this.isBooked;
    }
    
    public double getPrice() {
        return priceRoom;
    }
    
    public void displayRoomDetails() {
        System.out.println("| ID Kamar: " + IdRoom);
        System.out.println("| Tipe Kamar: " + type);
        System.out.println("| Harga Kamar: " + priceRoom);
    }
    
}
