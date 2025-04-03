package com.java.oops.Polymorphism.Runtime;

public class Main {
    public static void main(String[] args) {
        PaymentService upiPayment = new PaymentService(new UpiPayment());
        PaymentService creditCardPayment = new PaymentService(new CreditCardPayment());

        upiPayment.makePayment(100);
        creditCardPayment.makePayment(102.80);

    }
}
