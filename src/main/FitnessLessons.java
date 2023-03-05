package main;
import java.math.BigDecimal;
import java.util.ArrayList;

class FitnessLesson {
    private String type;
    private final BigDecimal price;
    private int maxCapacity;
    private ArrayList<Booking> bookings;
    private ArrayList<Review> reviews;

    public FitnessLesson(String type, BigDecimal price, int maxCapacity) {
        this.type = type;
        this.price = price;
        this.maxCapacity = maxCapacity;
        this.bookings = new ArrayList<>();
        this.reviews = new ArrayList<Review>();
    }

    public boolean hasAvailability() {
        return bookings.size() < maxCapacity;
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

    public BigDecimal getPrice() {
        return price;
    }

    // other methods and getters/setters
}
