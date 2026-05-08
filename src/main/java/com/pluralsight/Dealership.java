package com.pluralsight;

import java.util.ArrayList;

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

    public ArrayList<Vehicle> getInventory() {
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
    public static void addVehicles(){
        //add vehicles to array list
    }
    public static void removeVehicles(){
        //remove vehicles from the array list.
    }
}

