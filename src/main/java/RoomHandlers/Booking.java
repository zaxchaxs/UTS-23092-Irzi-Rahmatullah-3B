/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RoomHandlers;

/**
 *
 * @author Irzi Rhmtllh
 */
import RoomHandlers.Room;

public class Booking {
    private String customerName;
    private Room room;
    private int nights;
    
    public Booking(String customerName, Room room, int nights) {
        this.customerName = customerName;
        this.room = room;
        this.nights = nights;
        room.setBooked(false);
    }
    
    public double calculateTotalCost() {
        return room.getPrice() * nights;
    }
    
    public void displayBookingDetails() {
        System.out.println("Customer Name: " + customerName);
        room.displayRoomDetails();
        System.out.println("Nights: " + nights);
        System.out.println("Total Cost: " + calculateTotalCost());
    }
    
}
