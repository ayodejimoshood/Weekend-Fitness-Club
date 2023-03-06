package main;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        // Create some sample lessons
        FitnessLesson spin1 = new FitnessLesson("Spin", 7.99, "Saturday");
        FitnessLesson spin2 = new FitnessLesson("Spin", 7.99, "Sunday");
        FitnessLesson yoga1 = new FitnessLesson("Yoga", 8.50, "Saturday");
        FitnessLesson yoga2 = new FitnessLesson("Yoga", 8.50, "Sunday");

        // Create some sample customers
        Customer customer1 = new Customer("Ayodeji Moshood", "ofreeman@gmail.com");
        Customer customer2 = new Customer("Tahira Moshood", "tahira@gmail.com");
        Customer customer3 = new Customer("Omotara Landt", "omotara@gmail.com");
        Customer customer4 = new Customer("Oreoluwa Freeman", "omotara@gmail.com");
        Customer customer5 = new Customer("Emilia Egba", "emilia@gmail.com");
        Customer customer6 = new Customer("Shayomi Dokun", "shayomi@gmail.com");
        Customer customer7 = new Customer("Emeruwa Dennis", "omotara@gmail.com");
        Customer customer8 = new Customer("Bisola Kawthar", "omotara@gmail.com");


        // Add lessons to a list
//        List<Lesson> lessons = new ArrayList<>();
//        lessons.add(spin1);
//        lessons.add(spin2);
//        lessons.add(yoga1);
//        lessons.add(yoga2);
//        lessons.add(boxFit1);
//        lessons.add(boxFit2);
//        lessons.add(bodysculpt1);
//        lessons.add(bodysculpt2);
//
//        // Create some sample customers
//        Customer customer1 = new Customer("John Smith", "john.smith@example.com");
//        Customer customer2 = new Customer("Jane Doe", "jane.doe@example.com");
//
//        // Make some bookings
//        Booking booking1 = new Booking(customer1, spin1);
//        customer1.makeBooking(booking1);
//        Booking booking2 = new Booking(customer1, yoga1);
//        customer1.makeBooking(booking2);
//        Booking booking3 = new Booking(customer2, spin2);
//        customer2.makeBooking(booking3);
//        Booking booking4 = new Booking(customer2, yoga2);
//        customer2.makeBooking(booking4);
//
//        // Cancel a booking
//        customer1.cancelBooking(booking2);
//
//        // Print the customer's bookings
//        System.out.println(customer1.getName() + "'s bookings:");
//        for (Booking booking : customer1.getBookings()) {
//            System.out.println(booking.getLesson().getType() + " on " + booking.getLesson().getDay() + " at " + booking.getLesson().getTime());
//        }

        // Generate a report of customer numbers and average ratings per lesson
//        ReportGenerator reportGenerator = new ReportGenerator(lessons);
//        Map<String, List<Integer>> customerCounts = reportGenerator.getCustomerCounts();
//        Map<String, Double> averageRatings = reportGenerator.getAverageRatings();
//        System.out.println("Customer numbers per lesson:");
//        for (String lesson : customerCounts.keySet()) {
//            System.out.println(lesson + ": " + customerCounts.get(lesson));
//        }
//        System.out.println("Average ratings per lesson:");
//        for (String lesson : averageRatings.keySet()) {
//            System.out.println(lesson + ": " + averageRatings.get(lesson));
//        }

        // Generate a report of lesson types and total income
//        Map<String, Double> lessonIncome = reportGenerator.getLessonIncome();
//        System.out.println("Total income per lesson type:");
//        for (String lessonType : lessonIncome
//        Map<String, List<Lesson>> timetable = new HashMap<>();
//        timetable.put("Saturday", new ArrayList<>());
//        timetable.put("Sunday", new ArrayList<>());

        // Add lessons to the timetable
//        for (Lesson lesson : lessons) {
//            timetable.get(lesson.getDay()).add(lesson);
//        }

        // Print the timetable
//        System.out.println("Timetable:");
//        for (String day : timetable.keySet()) {
//            List<Lesson> lessonsOfDay = timetable.get(day);
//            System.out.println(day + ":");
//            for (Lesson lesson : lessonsOfDay) {
//                System.out.println("\t" + lesson.getType() + " at " + lesson.getTime());
//            }
//        }
    }
}