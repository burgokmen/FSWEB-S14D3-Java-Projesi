package com.brutech.polymorphism.CarSkeleton;

public class HybridCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String name, String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }
    @Override
    public void startEngine() {
        System.out.println(getName() + "HYBRID ENGINE HAS STARTED");
    }

    @Override
    public void drive() {
        System.out.println("DRIVE THE HYBRID TECH POWERED CAR");
    }

}
