package com.hmstudy.c_car;

public class MainProject {
    public static void main(String[] args) {
        Engine engine = new Engine("V8", 3.0f); // create an engine object with name "V8" and capacity 3.0 liters
        Tyre tyre = new Tyre("Michelin", 17); // create a tyre object with name "Michelin" and size 17 inches
        Car car = new Car(engine, tyre); // create a car object with engine and tyre objects
        
        car.show();

        System.out.println("-------------------------");

        Engine engine2 = new Engine("EA888", 2.0f); // create an engine object with name "V6" and capacity 2.0 liters
        car.setEngine(engine2); // set the engine object to the car object

        car.show();

        System.out.println("-------------------------");

        Tyre tyre2 = new Tyre("Continental", 16); // create a tyre object with name "Continental" and size 16 inches

        car.setTyre(tyre2); // set the tyre object to the car object

        car.show();

    }
}
