/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

/**
 *
 * @author Irzi Rhmtllh
 */

import RoomHandlers.*;

public class DefaultRooms {
    MenuHandlers reservasi = new MenuHandlers();
    
    public void addDefaultRoom() {
        System.out.println("|\tHotel Transylvania\t|");

        Room eksRoom1 = new Room("KE01", "Eksklusif", 500000, false);
        Room eksRoom2 = new Room("KE02", "Eksklusif", 500000, true);
        Room eksRoom3 = new Room("KE03", "Eksklusif", 500000, false);
        Room room1 = new Room("K001", "Eksklusif", 100.0, true);
        
        Room norRoom1 = new Room("KN01", "Normal", 200000, true);
        Room norRoom2 = new Room("KN02", "Normal", 200000, false);
        Room norRoom3 = new Room("KN03", "Normal", 200000, false);
        
        reservasi.addDefaultRooms(eksRoom1);
        reservasi.addDefaultRooms(eksRoom2);
        reservasi.addDefaultRooms(eksRoom3);
    }
}
