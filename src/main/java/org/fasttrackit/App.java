package org.fasttrackit;


public class App 
{

    public static void main( String[] args )
    {
        System.out.println( "WELCOME TO THE RACING GAME!" );

        Engine carEngine = new Engine();
        carEngine.manufacturer = "Renault";
        carEngine.capacity = 1.5;

       Car carReference = new Car(carEngine);
       carReference.name = "Dacia";
       carReference.color = "red";
       carReference.mileage = 9.8;
       carReference.fuelLevel = 60;
       carReference.maxSpeed = 200;
       carReference.running = false;
       carReference.doorCount = 2;


        System.out.println("Engine details...");
        System.out.println(carReference.engine.manufacturer);
        System.out.println(carReference.engine.capacity);

        double accelerationDistance = carReference.accelerate(60, 1);
        System.out.println("Acceleration distance " + accelerationDistance);

        Mechanic mechanic = new Mechanic();
        mechanic.repairVehicle(carReference);

        System.out.println("Total traveled distance after repair: " + carReference.traveledDistance);

Engine car2enigine = new Engine();
car2enigine.manufacturer = "Bavaria Motors";
car2enigine.capacity = 2;


       Car car2 = new Car(car2enigine);
        car2.name = "BMW";
        car2.mileage = 14;
        car2.color = null;


//        concatenation - lipirea a doua stringuri
        System.out.println("First car name: " + carReference.name);
        System.out.println("First car color: " + carReference.color);
        System.out.println("First car mileage: " + carReference.mileage);
        System.out.println("First car fuel Level: " + carReference.fuelLevel);
        System.out.println("First car max Speed: " + carReference.maxSpeed);
        System.out.println("First car running: " + carReference.running);
        System.out.println("First car door number: " + carReference.doorCount);

        System.out.println("Second car name: " + car2.name);
        System.out.println("Second car mileage: " + car2.mileage);
        System.out.println(car2.color);
        System.out.println(car2.fuelLevel);
        System.out.println(car2.maxSpeed);
        System.out.println(car2.running);
        System.out.println(car2.doorCount);

        Car car3 = new Car(carEngine);
        car3.name = "Audi";

        System.out.println("numele masinii 2 " + car2.name);
        System.out.println("numele masinii 3 " + car3.name);


        System.out.println("Studying class variables (static variables)...");

        Vehicle vehicle1 = new Vehicle();
        vehicle1.totalCount = 10;

        Vehicle vehicle2 = new Vehicle();
        vehicle2.totalCount = 20;

        Vehicle.totalCount = 30;

        System.out.println("Total vehicle count from vehicle1: "+ vehicle1.totalCount);
        System.out.println("Total vehicle count from vehicle2: "+ vehicle2.totalCount);
        System.out.println("Total vehicle count from Vehicle class: "+ Vehicle.totalCount);



    }
}
