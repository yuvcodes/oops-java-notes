package com.java.oops.Polymorphism.CompileTime;

public class Main {
    public static void main(String[] args) {
        Contact contactInfo = new Contact("Yuvraj", 829191822, "abc@gmail.com");

        // Use getters instead of directly accessing fields
        // Compile time polymorphism with Encapsulation in action
        System.out.println(contactInfo.getContactDetails(contactInfo.getName()));
        System.out.println(contactInfo.getContactDetails(contactInfo.getContact(), contactInfo.getEmail()));
    }
}