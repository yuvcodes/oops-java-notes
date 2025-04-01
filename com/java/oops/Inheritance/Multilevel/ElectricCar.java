package com.java.oops.Inheritance.Multilevel;

// Further Derived class (Child)
public class ElectricCar extends Car {
    int batteryCapacity;

    public ElectricCar(String brand, int wheels, int batteryCapacity) {
        super(brand, wheels); // Call Car constructor
        this.batteryCapacity = batteryCapacity;
    }

    public void showElectricCarInfo() {
        System.out.println(brand + " electric car has a battery capacity of " + batteryCapacity + " kWh.");
    }
}
