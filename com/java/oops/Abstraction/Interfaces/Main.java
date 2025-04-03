package com.java.oops.Abstraction.Interfaces;

public class Main {
    public static void main(String[] args) {
        SmartDevice fan = new SmartFan();
        fan.turnOn();

        SmartDevice ac = new SmartAC();
        ac.turnOff();
    }
}
