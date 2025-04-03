package com.java.oops.Polymorphism.Runtime;

public class UpiPayment extends PaymentProcessor {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing a UPI payment of Rs " + amount);

    }
}
