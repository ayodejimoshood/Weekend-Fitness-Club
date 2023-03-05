package main;

import java.time.LocalDateTime;

public class Booking {
    private final Customer customer;
    private final FitnessLesson fitnessLesson;
    private final LocalDateTime dateTime;

    public Booking(Customer customer, FitnessLesson fitnessLesson, LocalDateTime dateTime) {
        this.customer = customer;
        this.fitnessLesson = fitnessLesson;
        this.dateTime = dateTime;
    }

    public Customer getCustomer() {
        return customer;
    }

    public FitnessLesson getFitnessLesson() {
        return fitnessLesson;
    }

    public void add(Booking bookings) {
    }

    public void remove(Booking bookings) {
    }

    // other methods and getters/setters
}


