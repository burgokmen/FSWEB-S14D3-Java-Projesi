package com.brutech.polymorphism;

public class Holden extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public boolean startEngine() {
        System.out.println(getClass().getSimpleName());
        System.out.println(getName() + "'s engine is starting");
        return false;
    }

    @Override
    public void accelerate() {
        System.out.println(getClass().getSimpleName());
        System.out.println(getName() + " is accelerating");
    }

    @Override
    public void brake() {
        System.out.println(getClass().getSimpleName());
        System.out.println(getName() + " is braking");
    }
}
