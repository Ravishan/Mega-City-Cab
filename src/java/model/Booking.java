/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ravishan
 */
package model;

/**
 * @author Ravishan
 */
public class Booking {
    private String bookingId;
    private String customerName;
    private String address;
    private String phone;
    private String destination;

    // Constructor
    public Booking(String bookingId, String customerName, String address, String phone, String destination) {
        this.bookingId = bookingId;
        this.customerName = customerName;
        this.address = address;
        this.phone = phone;
        this.destination = destination;
    }

    // Getters
    public String getBookingId() { return bookingId; }
    public String getCustomerName() { return customerName; }
    public String getAddress() { return address; }
    public String getPhone() { return phone; }
    public String getDestination() { return destination; }

    // Setters (if needed)
    public void setBookingId(String bookingId) { this.bookingId = bookingId; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }
    public void setAddress(String address) { this.address = address; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setDestination(String destination) { this.destination = destination; }
}
