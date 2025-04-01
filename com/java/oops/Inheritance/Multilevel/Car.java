package com.java.oops.Inheritance.Multilevel;

//Derived class
public class Car extends Vehicle {
    int wheels;

    public Car(String brand, int wheels) {
        super(brand); // Call Vehicle constructor
        this.wheels = wheels;
    }

    public void showCarInfo() {
        System.out.println(brand + " car has " + wheels + " wheels.");
    }
}
