package com.pluralsight;

import java.util.Scanner;

public class UserInterface {
    private  Dealership dealership;
    private Scanner scanner;

    public UserInterface(Dealership dealership, Scanner scanner) {
        this.dealership = dealership;
        this.scanner = new Scanner(System.in);
    }
    
}
