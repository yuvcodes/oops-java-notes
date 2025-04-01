package com.java.oops.Polymorphism.CompileTime;

// Also called Method Overloading
public class Contact {
    private String name;
    private long contact;
    private String email;

    // Constructor using "this" keyword
    // if you add different constructors that would be also compile time poly
    public Contact(String name, long contact, String email) {
        this.name = name;
        this.contact = contact;
        this.email = email;
    }

    // Getter methods (Encapsulation)
    public String getName() {
        return name;
    }

    public long getContact() {
        return contact;
    }

    public String getEmail() {
        return email;
    }

    // Overloaded methods Compiletime
    public String getContactDetails(String name) {
        return "Name: " + name;
    }

    // same method diff parameters compile time
    public String getContactDetails(long contact, String email) {
        return "Contact: " + contact + ", Email: " + email;
    }
}