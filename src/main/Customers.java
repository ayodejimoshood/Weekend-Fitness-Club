package main;
import java.util.ArrayList;
import java.util.List;

public class Customers {
    private String name;
    private String email;
    private List<Booking> bookings;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.bookings = new ArrayList<>();
    }

    public void createBooking(Booking booking) {
        if (booking.fitnessLessons().hasAvailability()) {
            bookings.add(booking);
            booking.fitnessLessons().addBooking(booking);
        } else {
            System.out.println("Fitness Lesson, is fully booked");
        }
    }

    public void cancelBooking (Booking booking) {
        bookings.remove(booking);
        booking.fitnessLesson().removeBooking(booking);
    }

    public List<Booking> geBookings() {
        return bookings
    }
}
