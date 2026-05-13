package com.pluralsight;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DealershipFileManager {

    public static Dealership getDealership(){

        Dealership dealership = null;

        try {
            BufferedReader reader = new BufferedReader(new FileReader("inventory.csv"));

            String line = reader.readLine();

            // First line = dealership info
            if (line != null){
                String[] dealershipData = line.split("\\|");

                dealership = new Dealership(
                        dealershipData[0],
                        dealershipData[1],
                        dealershipData[2]
                );

                // Remaining lines = vehicles
                while ((line = reader.readLine()) != null){
                    String[] vehicleData = line.split("\\|");

                    Vehicle vehicle = new Vehicle(
                            Integer.parseInt(vehicleData[0]),
                            Integer.parseInt(vehicleData[1]),
                            vehicleData[2],
                            vehicleData[3],
                            vehicleData[4],
                            vehicleData[5],
                            Integer.parseInt(vehicleData[6]),
                            Double.parseDouble(vehicleData[7])
                    );
                    dealership.addVehicle(vehicle);
                }
            }
            reader.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return dealership;
    }
    public static void saveDealership(){

    }
}
