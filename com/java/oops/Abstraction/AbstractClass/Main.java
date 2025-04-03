package com.java.oops.Abstraction.AbstractClass;

public class Main {

    public static void main(String[] args) {
        Meal vegmeal = new VegMeal("Paneer thali", 150);
        Meal junkfood = new JunkFood("Mc-alooTiki", 250);

        // abstracted methods with their seperate implementations
        vegmeal.prepareMeal();
        junkfood.prepareMeal();
    }
}
