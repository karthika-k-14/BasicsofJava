package task4;

abstract class Vehicle {
    abstract void start();

    void displayVehicleType() {
        System.out.println("Vehicle");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike Started");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car Started");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Bike b = new Bike();
        Car c = new Car();

        b.displayVehicleType();
        b.start();

        c.displayVehicleType();
        c.start();
    }
}