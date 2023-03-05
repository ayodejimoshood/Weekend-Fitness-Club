package main;
import java.util.ArrayList;

public class Customer {
    private final String name;
    private final String email;
    private final ArrayList<Booking> bookings = new ArrayList<>();

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void makeBooking(Booking booking) {
        if (booking.getFitnessLesson().hasAvailability()) {
            bookings.add(booking);
            booking.getFitnessLesson().addBooking(booking);
        } else {
            System.out.println("Sorry, the lesson is full.");
        }
    }

    public void cancelBooking(Booking booking) {
        bookings.remove(booking);
        booking.getFitnessLesson().removeBooking(booking);
    }

    public ArrayList<Booking> getBookings() {

        return bookings;
    }

    // other methods and getters/setters
}
