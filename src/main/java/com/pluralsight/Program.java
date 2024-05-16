package com.pluralsight;


public class Program {
    public static void main(String[] args) {
        String filePath = " dealership_data.txt";
        Dealership dealership= DealershipFilesManager.getDealership(filePath);

        UserInterface userInterface = new UserInterface(dealership);

        userInterface.display();

    }

}
