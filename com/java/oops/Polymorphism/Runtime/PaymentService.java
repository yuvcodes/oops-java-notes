package com.java.oops.Polymorphism.Runtime;

class PaymentService {
    private PaymentProcessor paymentProcessor;

    // Constructor-based Dependency Injection
    public PaymentService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void makePayment(double amount) {
        paymentProcessor.processPayment(amount);
    }
}
