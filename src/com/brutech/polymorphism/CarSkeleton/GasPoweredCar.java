package com.brutech.polymorphism.CarSkeleton;

public class GasPoweredCar extends CarSkeleton {

    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String name, String description, double avgKmPerLitre, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println(getName() + "GAS POWERED ENGINE HAS STARTED");
    }

    @Override
    public void drive() {
        System.out.println("DRIVE THE GAS POWERED CAR");
    }


}
