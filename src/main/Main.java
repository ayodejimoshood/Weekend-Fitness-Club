package main;

import java.util.Scanner;


public class Main {
    // this allows users to enter an input
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter your name");

        String name  = scanner.nextLine();

        System.out.println("Enter your Email");

        String email  = scanner.nextLine();

        // Customer firstCustomer =  new Customer(name, email);

        // System.out.println(name);

    }
}