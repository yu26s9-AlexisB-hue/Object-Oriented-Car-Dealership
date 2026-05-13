package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;

    private Scanner scanner = new Scanner(System.in);


    public void display(){
        init();
        boolean running = true;

        while(running){
            System.out.println("1 - View Vehicles");
            System.out.println("0 - Exit");

            int command = scanner.nextInt();
            scanner.nextLine();

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
