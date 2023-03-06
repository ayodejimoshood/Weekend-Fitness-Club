package main;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Booking {
    private final Customer customer;
    private final FitnessLesson fitnessLesson;
//    private final LocalDateTime dateTime;
    private ArrayList<Booking> bookings;

    public Booking(Customer customer, FitnessLesson fitnessLesson) {
        this.customer = customer;
        this.fitnessLesson = fitnessLesson;
        this.bookings = new ArrayList<>();
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public FitnessLesson getFitnessLesson() {
        return fitnessLesson;
    }

    public void add(Booking booking) {
        bookings.add(booking);
    }

    public void remove(Booking booking) {
        bookings.remove(booking);
    }

    // other methods and getters/setters
}


