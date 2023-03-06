package main;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.ArrayList;

class FitnessLesson {
    private final String type;
    private final double price;
    private final String day;
    private ArrayList<Booking> bookings;
    private ArrayList<Review> reviews;
    private boolean Type;

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

    public boolean getType() {
        return Type;
    }

//    public void printCustomers() {
//        // Print the customer's bookings
////        for(Booking booking : bookings){
////            System.out.println(booking.getCustomer().getName());
////        }
//        System.out.println(customer1.getCustomer() + "'s bookings:");
//        for (Booking booking : customer1.getBookings()) {
//            System.out.println(booking.getFitnessLesson().getType() + " on " + booking.getFitnessLesson().getDay());
//        }
//    }
    // Print the customer's bookings



    // other methods and getters/setters
}