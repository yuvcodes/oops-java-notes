package com.java.oops.Polymorphism.Runtime;

public class CreditCardPayment extends PaymentProcessor {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing a credit card payment of Rs " + amount);

    }
}
