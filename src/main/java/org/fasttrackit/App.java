package org.fasttrackit;


public class App
{

    public static void main( String[] args )
    {
        System.out.println( "WELCOME TO THE RACING GAME!" );

        Game game = new Game();
        game.start();


////       Method implementation taken from object's class
//        Vehicle jokerVehicle = new JokerVehicle();
//        jokerVehicle.setName("Joker");
//        jokerVehicle.setFuelLevel(80);
//        jokerVehicle.accelerate(60, 1);
//
////        variable's class determines what methods can be called
////        type casting
//        ((JokerVehicle) jokerVehicle).fly();
//
//        System.out.println("Joker's total distance: "+ jokerVehicle.getTraveledDistance());
//
//        Car carWithDefaultEngine = new Car();
//
//        Engine carEngine = new Engine();
//        carEngine.manufacturer = "Renault";
//        carEngine.capacity = 1.5;
//
//       Car carReference = new Car(carEngine);
//       carReference.setName("Dacia");
//       carReference.setColor("Red");
//       carReference.setMileage(9.8);
//       carReference.setFuelLevel(60);
//       carReference.setMaxSpeed(200);
//       carReference.setRunning(false);
//       carReference.doorCount = 2;
//
//
//        System.out.println("Engine details...");
//        System.out.println(carReference.engine.manufacturer);
//        System.out.println(carReference.engine.capacity);
//
//        double accelerationDistance = carReference.accelerate(200, 1);
//        double accelerationDistance1 = carReference.accelerate(200, 1);
//        System.out.println("Acceleration distance " + accelerationDistance);
//
//        Mechanic mechanic = new Mechanic();
//        mechanic.repairVehicle(carReference);
//
//        System.out.println("Total traveled distance after repair: " + carReference.getTraveledDistance());
//
//Engine car2enigine = new Engine();
//car2enigine.manufacturer = "Bavaria Motors";
//car2enigine.capacity = 2;
//
//
//       Car car2 = new Car(car2enigine);
//        car2.setName("BMW");
//        car2.setMileage(14);
//        car2.setColor(null);
//
//
////        concatenation - lipirea a doua stringuri
//        System.out.println("First car name: " + carReference.getName());
//        System.out.println("First car color: " + carReference.getColor());
//        System.out.println("First car mileage: " + carReference.getMileage());
//        System.out.println("First car fuel Level: " + carReference.getFuelLevel());
//        System.out.println("First car max Speed: " + carReference.getMaxSpeed());
//        System.out.println("First car door number: " + carReference.doorCount);
//
//        System.out.println("Second car name: " + car2.getName());
//        System.out.println("Second car mileage: " + car2.getMileage());
//
//
//        Car car3 = new Car(carEngine);
//        car3.setName("Audi");
//
//        System.out.println("numele masinii 2 " + car2.getName());
//        System.out.println("numele masinii 3 " + car3.getName());
//
//
//        System.out.println("Studying class variables (static variables)...");
//
//        Vehicle vehicle1 = new Vehicle();
//        Vehicle.totalCount = 10;
//
//        Vehicle vehicle2 = new Vehicle();
//        Vehicle.totalCount = 20;
//
//        Vehicle.totalCount = 30;
//
//        System.out.println("Total vehicle count from vehicle1: "+ Vehicle.totalCount);
//        System.out.println("Total vehicle count from vehicle2: "+ Vehicle.totalCount);
//        System.out.println("Total vehicle count from Vehicle class: "+ Vehicle.totalCount);
//
//Car car4 = new Car(carEngine);

    }
}
