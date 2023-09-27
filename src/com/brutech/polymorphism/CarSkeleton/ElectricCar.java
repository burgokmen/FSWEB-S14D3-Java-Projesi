package com.brutech.polymorphism.CarSkeleton;

public class ElectricCar extends CarSkeleton{
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.println(getName() + "ELECTRIC TECH POWERED ENGINE HAS STARTED");
    }

    @Override
    public void drive() {
        System.out.println("DRIVE THE ELECTRIC TECH POWERED CAR");
    }
}
