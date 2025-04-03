package com.java.oops.Abstraction.AbstractClass;

public class VegMeal extends Meal {

    public VegMeal(String name, double price){
        super(name, price);
    }

    @Override
    void prepareMeal() {
        System.out.println("Preparing a healthy veg meal.");
    }
}

