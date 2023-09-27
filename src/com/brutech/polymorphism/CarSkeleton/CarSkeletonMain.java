package com.brutech.polymorphism.CarSkeleton;

public class CarSkeletonMain {
    public static void main(String[] args) {

        CarSkeleton tesla = new ElectricCar("x", "favcar", 450, 40);
        CarSkeleton mercedes = new GasPoweredCar("Merso", "FnF", 50, 6);
        CarSkeleton ford = new HybridCar("fusion", "oldcar", 100, 20, 6);

        CarSkeleton car = new CarSkeleton("test", "test");

        car.startEngine();
        car.drive();

        tesla.startEngine();
        tesla.drive();

        mercedes.startEngine();
        mercedes.drive();

        ford.startEngine();
        ford.drive();


    }
}
