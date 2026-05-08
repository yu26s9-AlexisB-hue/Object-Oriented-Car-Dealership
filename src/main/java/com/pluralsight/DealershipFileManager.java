package com.pluralsight;

import java.io.*;
import java.util.List;

public class DealershipFileManager {
    private static void temporaryFile(List<Vehicle> inventory) {
        try {
            File tempFile = File.createTempFile("transaction", ".csv");
            FileWriter writer = new FileWriter(tempFile);

            for(int i = 0; i < inventory.size(); i++) {
               Vehicle vehicle = inventory.get(i);
                writer.write(vehicle.getVin() + "|" +
                        vehicle.getYear() + "|" +
                        vehicle.getMake() + "|" +
                        vehicle.getModel() + "|" +
                        vehicle.getVehicleType() + "|" +
                        vehicle.getColor() + "|" +
                        vehicle.getOdometer() + "|" +
                        vehicle.getPrice()
                );
                writer.write("\n");
            }
            writer.close();

            //Prints the full location(path) of the temporary file you just created.
            System.out.println("Temp file created at: " + tempFile.getAbsolutePath());

        } catch (IOException e) {

            System.out.println(e.getMessage());
        }
    }

    public static void getDealership(){

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
            }

            reader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void saveDealership(){

    }
}
