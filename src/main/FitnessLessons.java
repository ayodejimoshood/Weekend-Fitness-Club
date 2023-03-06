package main;
import java.math.BigDecimal;
import java.util.ArrayList;

class FitnessLesson {
    private String type;
    private final double price;
    private final String day;
    private ArrayList<Booking> bookings;
    private ArrayList<Review> reviews;

    public FitnessLesson(String type, double price, String day) {
        this.type = type;
        this.price = price;
        this.day = day;
        this.bookings = new ArrayList<>(5);
        this.reviews = new ArrayList<Review>();
    }

    public boolean hasAvailability() {
        return bookings.size() < 5;
    }

    public void addBooking(Booking bookings) {
        bookings.add(bookings);
    }

    public void removeBooking(Booking bookings) {
        bookings.remove(bookings);
    }

    public void addReview(Review reviews) {
        reviews.add(reviews);
    }

    public double getPrice() {
        return price;
    }

    public String getDay() {
        return day;
    }

    public void printCustomers() {
        // Print the customer's bookings
        for(Booking booking : bookings){
            System.out.println(booking.getCustomer().getBookings());
        }
    }


    // other methods and getters/setters
}