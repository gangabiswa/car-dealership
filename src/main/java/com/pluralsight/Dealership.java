package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name;
    private String address;
    private String phone;

    ArrayList<Vehicle>inventory;

    public Dealership(String name, String address, String phone, List<Vehicle> vehicles) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public ArrayList<Vehicle> getVehiclesByPrice(double min, double max) {
        return inventory;
    }

    public ArrayList<Vehicle> getVehiclesByMakeModel(String make, String model) {
        return inventory;
    }
    public ArrayList<Vehicle> getVehiclesByYear(int min, int max){
        return  inventory;
    }

    public ArrayList<Vehicle> getVehiclesByColor(String color) {
        return inventory;
    }

    public ArrayList<Vehicle> getVehiclesByMileage(double min, double max) {
        return inventory;
    }

    public ArrayList<Vehicle> getVehiclesByType(String type) {
        return inventory;
    }

    public ArrayList<Vehicle> getAllVehicles() {
        return inventory;
    }
    public void addVehicles(Vehicle vehicle){
        inventory.add(vehicle);
    }
    public void removeVehicles(Vehicle vehicle){
        inventory.remove(vehicle);
    }

}
