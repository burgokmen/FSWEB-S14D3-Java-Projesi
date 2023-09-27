package com.brutech.polymorphism.CarSkeleton;

import com.brutech.polymorphism.Cars.Car;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void startEngine(){
        System.out.println("START ENGINE");
    }

    public void drive(){
        runEngine();
        System.out.println("DRIVE THE CAR");
    }

    private void runEngine(){
        System.out.println("ENGINE RUN");
    }

    @Override
    public boolean equals(Object obj) {
        return ((CarSkeleton)obj).getDescription().equals(getDescription()) &&
                ((CarSkeleton)obj).getName().equals(getName());
    }

    @Override
    public String toString() {
        return "CarSkeleton{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
