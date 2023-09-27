package com.brutech.polymorphism.Cars;

public class Car {
    private boolean engine = true;
    private int cylinders;
    private String name;
    private int wheels = 4;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public boolean startEngine(){
        System.out.println(getClass().getSimpleName());

        System.out.println("the car's engine is starting");
        return false;
    }

    public void accelerate() {
        System.out.println(getClass().getSimpleName());
        System.out.println("the car is accelerating");
    }

    public void brake(){
        System.out.println(getClass().getSimpleName());
        System.out.println("the car is braking");
    }

    @Override
    public boolean equals(Object obj) {
        return ((Car)obj).getCylinders() == getCylinders() &&
                ((Car)obj).getName().equals(getName());
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }
}
