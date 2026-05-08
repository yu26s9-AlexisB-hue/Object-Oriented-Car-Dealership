package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name;
    private String address;
    private String phone;
    private List<Vehicle> inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        inventory = new ArrayList<>();
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
    public void getVehiclesByType(){
        //Type, pass array list through it
    }

    public List<Vehicle> getAllVehicles(){
       return this.inventory;
    }

    public void addVehicle(Vehicle vehicle){
        inventory.add(vehicle);
//        //add vehicles to array list
//
//        //prompting the user
//        System.out.println("Vin: ");
//        int vin = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("Year: ");
//        int year = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("Make: ");
//        String make = scanner.nextLine();
//        System.out.println("Model: ");
//        String model = scanner.nextLine();
//        System.out.println("Vehicle Type: ");
//        String vehicleType = scanner.nextLine();
//        System.out.println("Color: ");
//        String color = scanner.nextLine();
//        System.out.println("Odometer: ");
//        int odometer = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("Price: ");
//        double price = scanner.nextDouble();

        //creating a vehicle class
      //  Vehicle v = new Vehicle(vin,year,make,model,vehicleType,color,odometer,price);

        //Adding the vehicle to the ArrayList.




    }
    public void removeVehicle(int vehicleVin){

        //find the vehicle with that vin from the inventory, and remove it from the inventory...


        //remove vehicles from the array list.
//        System.out.println("What line would you like to delete? ");
//        int lineNumeber = scanner.nextInt();
//
//        for(Vehicle v : inventory){
//            inventory.remove(inventory.get(lineNumeber));
//            break;
//        }
    }
}

