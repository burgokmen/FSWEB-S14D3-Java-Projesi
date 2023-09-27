package com.brutech.polymorphism;

public class Main {
    public static void main(String[] args) {
        Car carrrr = new Car(4, "baby");

        carrrr.accelerate();
        carrrr.startEngine();
        carrrr.brake();


        Car car1 = new Car(4, "baby");

        if (carrrr.equals(car1)){
            System.out.println("equals");
        }else {
            System.out.println("No equality");
        }

        System.out.println("XXXXXXXXXXXXXXXXX");

        Car car = new Car(8, "Base car");

        car.startEngine();

        car.accelerate();

      car.brake();

        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");

        mitsubishi.startEngine();

        mitsubishi.accelerate();

       mitsubishi.brake();

        Car ford = new Ford(6, "Ford Falcon");

       ford.startEngine();

        ford.accelerate();

        ford.brake();

        Car holden = new Holden(6, "Holden Commodore");

        holden.startEngine();

        holden.accelerate();

        holden.brake();

    }
}