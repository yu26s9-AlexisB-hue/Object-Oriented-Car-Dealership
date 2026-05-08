package com.pluralsight;


import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Create dealership object
        Dealership dealership =
                new Dealership("CarMax", "123 Main St", "555-1234");
        //System.out.println(dealership.);
        Vehicle v = new Vehicle(123,2006,"Jeep", "Liberty", "SUV", "Red", 200000,5000);
        System.out.println(v);

        System.out.println(dealership.getAllVehicles());
        dealership.addVehicle(v);
        System.out.println(dealership.getAllVehicles());
        // Add a vehicle
     //   dealership.addVehicles();

        // Display all vehicles
     //   dealership.getAllVehicles();
    }
}
