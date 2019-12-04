package org.fasttrackit;

public class JokerVehicle extends Vehicle{

    @Override
    public double accelerate(double speed, double durationInHours) {

        System.out.println(getName() + " is accelerating with "+ speed + " for " + durationInHours + " h ");

        double disstance = 2*speed*durationInHours;
        setTraveledDistance(getTraveledDistance()+disstance);

        System.out.println("Cheating! Joker...");
        return disstance;

    }
}
