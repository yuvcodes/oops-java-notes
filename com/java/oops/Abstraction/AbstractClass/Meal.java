package com.java.oops.Abstraction.AbstractClass;

// abstract keyword
// abstract class can't be instantiated
public abstract class Meal {
    String name;
    double price;

    public Meal(String name, double price){
        this.name = name;
        this.price = price;
    }

    // abstract class can only have abstract method
    abstract void prepareMeal();

    public void serveMeal() {
        System.out.println(name + " is served, enjoy your meal");
    }

}
