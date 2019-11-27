package org.fasttrackit;

import java.util.Scanner;

public class Game {

    public void start(){
        System.out.println("Starting game...");

        String vehicleName = getVehicleNameFromUser();

        System.out.println("Name from user: "+vehicleName);


        int numberUsers = gamers();
        System.out.println("Number of users is: "+numberUsers);
    }

    private String getVehicleNameFromUser (){
        System.out.println("Please enter vehicle name.");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();

    }
    private int gamers(){
        System.out.println("Please enter number of players.");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
