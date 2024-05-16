package com.pluralsight;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private  Dealership dealership;
    private Scanner scanner;

    public UserInterface(Dealership dealership) {
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
    public void processGetByPriceRequest() {
        System.out.print("Enter minimum price: ");
        double minPrice = scanner.nextDouble();
        System.out.print("Enter maximum price: ");
        double maxPrice = scanner.nextDouble();
    }
    public void processGetByMakeModelRequest() {
        System.out.print("Enter make: ");
        String make = scanner.next();
        System.out.print("Enter model: ");
        String model = scanner.next();
    }
    public void processGetByYearRequest() {
        System.out.print("Enter minimum year: ");
        int minYear = scanner.nextInt();
        System.out.print("Enter maximum year: ");
        int maxYear = scanner.nextInt();
    }
    public void processGetByColorRequest() {
        System.out.print("Enter color: ");
        String color = scanner.next();
    }
    public void processGetByMileageRequest() {
        System.out.print("Enter minimum mileage: ");
        double minMileage = scanner.nextDouble();
        System.out.print("Enter maximum mileage: ");
        double maxMileage = scanner.nextDouble();
    }
    public void processGetByVehicleTypeRequest() {
        System.out.print("Enter vehicle type: ");
        String type = scanner.next();
    }
    public void processAddVehicleRequest() {
        System.out.println("Adding a new vehicle:");
        System.out.print("Enter make: ");
        String make = scanner.next();
        System.out.print("Enter model: ");
        String model = scanner.next();
        System.out.print("Enter price: ");
        double price = scanner.nextDouble();

        Vehicle newVehicle = new Vehicle(make, model, price);

        dealership.addVehicles(newVehicle);
        System.out.println("Vehicle added successfully!");
    }
    public  void processRemoveVehiclesRequest(){
        System.out.println("remove a vehicle:");
        System.out.println("enter make:");
        String make = scanner.next();
        System.out.println("enter model:");
        String model = scanner.next();

        List<Vehicle> vehiclesToRemove = dealership.getVehiclesByMakeModel(make, model);

        if (vehiclesToRemove.isEmpty()){
            System.out.println("vehicle not found");
        } else if (vehiclesToRemove.size()>1) {
            System.out.println("many vehicles are found try again");
        }else {
            dealership.removeVehicles(vehiclesToRemove.get(0));
            System.out.println("vehicle was removed succefully..");
        }
    }

}
