package com.java.oops.Abstraction.Interfaces;

public class SmartFan implements SmartDevice{

    @Override
    public void turnOn() {
        System.out.println("Smart Fan is turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart Fan is turned OFF");
    }
}
