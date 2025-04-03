package com.java.oops.Abstraction.Interfaces;

// implements keyword
public class SmartAC implements SmartDevice{

    @Override
    public void turnOn() {
        System.out.println("Smart AC is turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart AC is turned OFF");
    }
}
