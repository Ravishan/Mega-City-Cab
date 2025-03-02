/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ravishan
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Booking;

public class BookingDAO {
    private static List<Booking> bookings = new ArrayList<>();

    public static void addBooking(Booking booking) {
        bookings.add(booking);
    }

    public static List<Booking> getAllBookings() {
        return bookings;
    }
}

