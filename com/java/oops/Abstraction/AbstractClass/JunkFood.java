package com.java.oops.Abstraction.AbstractClass;

// extends keyword
public class JunkFood extends Meal {

    public JunkFood(String name, double price) {
        super(name, price);
    }
    @Override
    void prepareMeal() {
        System.out.println("Junk food is being prepared...");
    }
}
