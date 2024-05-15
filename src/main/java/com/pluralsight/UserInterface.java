package com.pluralsight;

import java.util.Scanner;

public class UserInterface {
    private  Dealership dealership;
    private Scanner scanner;

    public UserInterface(Dealership dealership, Scanner scanner) {
        this.dealership = dealership;
        this.scanner = new Scanner(System.in);
    }
    public void display(){
        System.out.println("WELCOME TO THE DEALERSHIP MANAGEMENT SYSTEM.");
        System.out.println("1. Get vehicles by price range");
        System.out.println("2. Get vehicles by make and model");
        System.out.println("3. Get vehicles by year range");
        System.out.println("4. Get vehicles by color");
        System.out.println("5. Get vehicles by mileage range");
        System.out.println("6. Get vehicles by type");
        System.out.println("7. Add a new vehicle");
        System.out.println("8. Remove a vehicle");
        System.out.println("9. exit");
        System.out.println("Enter your choice:");


    }
}
