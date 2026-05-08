package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class Dealership {
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    Scanner scanner = new Scanner(System.in);

    public ArrayList<Vehicle> getInventory() {
        ArrayList<Vehicle>inventory = new ArrayList<>();



        addVehicles(inventory,scanner);
        removeVehicles(inventory,scanner);

        return inventory;
    }
    public static void getVehiclesByPrice(){
        //min and max, pass array list through it
    }
    public static void getVehiclesByMakeModel(){
        //make, model  and array list
    }
    public static void getVehiclesByYear(){
        //min and max year, pass array list through it
    }
    public static void getVehiclesByColor(){
        //color, pass array list through it
    }
    public static void getVehiclesByMilage(){
        //min and max, pass array list through it
    }
    public static void getVehiclesByType(){
        //Type, pass array list through it
    }
    public static void getAllVehicles(){
        //Show all, pass array list through it
    }
    public static void addVehicles(ArrayList<Vehicle>inventory, Scanner scanner){

        //add vehicles to array list

        //prompting the user
        System.out.println("Vin: ");
        int vin = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Year: ");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Make: ");
        String make = scanner.nextLine();
        System.out.println("Model: ");
        String model = scanner.nextLine();
        System.out.println("Vehicle Type: ");
        String vehicleType = scanner.nextLine();
        System.out.println("Color: ");
        String color = scanner.nextLine();
        System.out.println("Odometer: ");
        int odometer = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Price: ");
        double price = scanner.nextDouble();

        //creating a vehicle class
        Vehicle v = new Vehicle(vin,year,make,model,vehicleType,color,odometer,price);

        //Adding the vehicle to the ArrayList.
        inventory.add(v);



    }
    public static void removeVehicles(ArrayList<Vehicle>inventory, Scanner scanner){
        //remove vehicles from the array list.

        System.out.println("What line would you like to delete? ");
        int lineNumeber = scanner.nextInt();

        for(int i = 0; i < inventory.size(); i++){
            inventory.remove(lineNumeber);
        }
    }
}

