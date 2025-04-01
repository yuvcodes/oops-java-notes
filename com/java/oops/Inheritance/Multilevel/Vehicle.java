package com.java.oops.Inheritance.Multilevel;

// Base class (Grandparent)
public class Vehicle {
    String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void showBrand() {
        System.out.println("Brand: " + brand);
    }
}
