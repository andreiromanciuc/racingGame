package org.fasttrackit;

public class Vehicle {

    // class variable
    static int totalCount;

// instance variables
    String name;
    String color;
    double mileage;
    double mxSpeed;
    double fuelLevel;
    double traveledDistance;
    boolean running;

    public double accelerate (double speed, double durationInHours) {
        System.out.println(name + " is accelerating with "+ speed + " for " + durationInHours + " h ");

        // local variable (declared inside a method)
        double distance = speed * durationInHours;

        traveledDistance += distance;
        System.out.println("Total traveled distance: " + traveledDistance);

        double usedFuel = distance * mileage /100;
        System.out.println("Used fuel: "+ usedFuel);

        fuelLevel -= usedFuel;
        System.out.println("Remaining fuel level: " + fuelLevel);

        return distance;


    }

}
