package com.pluralsight;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DealershipFilesManager {
    public static Dealership getDealership(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            String[] dealershipInfo = null;
            List<Vehicle> vehicles = new ArrayList<>();


            if ((line = reader.readLine()) != null) {
                dealershipInfo = line.split("\\|");
            }
            while ((line = reader.readLine()) != null) {
                String[] vehicleData = line.split("\\|");
                Vehicle vehicle = new Vehicle(vehicleData[0], vehicleData[1], Double.parseDouble(vehicleData[2]));
                vehicles.add(vehicle);
            }
            if (dealershipInfo != null && dealershipInfo.length == 3) {
                return new Dealership(dealershipInfo[0], dealershipInfo[1], dealershipInfo[2]);
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void saveDealership(Dealership dealership, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(dealership.getName() + "|" + dealership.getAddress() + "|" + dealership.getPhone());
            writer.newLine();

            for (Vehicle vehicle : dealership.getAllVehicles()) {
                writer.write(vehicle.getMake() + "|" + vehicle.getModel() + "|" + vehicle.getPrice() + "|...");
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
