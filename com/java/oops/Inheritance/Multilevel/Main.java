package com.java.oops.Inheritance.Multilevel;

// Main class
public class Main {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar("Tesla", 4, 100);

        // Access methods from all levels of inheritance
        tesla.showBrand();            // From Vehicle
        tesla.showCarInfo();          // From Car
        tesla.showElectricCarInfo();  // From ElectricCar
    }
}
