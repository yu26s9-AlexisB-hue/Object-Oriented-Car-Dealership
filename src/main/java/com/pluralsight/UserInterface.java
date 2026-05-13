package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;


    public void display(){
        init();
        boolean running = true;

        while(running){
            //Creating a variable to hold the prompts to ask the user.
            String prompt = """
                    1 - View Vehicles
                    0 - Exit
                    """;

            //Takes and returns the users input into the command.
            int command = Console.promptForInt(prompt);

            switch(command){
                case 1:
                    processAllVehiclesRequest();
                    break;

                case 0:
//                    System.exit(0);
                    running = false;
                    break;
            }
        }
    }
    private void init(){
        DealershipFileManager dfm = new DealershipFileManager();

        this.dealership = dfm.getDealership();
    }
    private void displayVehicles(List<Vehicle> vehicles){
        for(Vehicle vehicle : vehicles){
            System.out.println(vehicle);
        }
    }
    public void processAllVehiclesRequest(){
        displayVehicles(dealership.getAllVehicles());
    }
}
