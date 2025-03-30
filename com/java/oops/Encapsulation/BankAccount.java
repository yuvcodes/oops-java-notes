package com.java.oops.Encapsulation;
public class BankAccount {
    private final String owner; // Owner cannot be changed after creation
    private double bankBalance;

    public BankAccount(String owner, double bankBalance) {
        this.owner = owner;
        this.bankBalance = bankBalance;
    }

    public String getOwner() {
        return owner;
    }

    public double getBankBalance() {
        return bankBalance;
    }

    public void withDraw(double amount) {
        if (amount > bankBalance || amount <= 0) {
            System.out.println("Insufficient balance or invalid amount!");
            return;
        }
        this.bankBalance -= amount;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount!");
            return;
        }
        this.bankBalance += amount;
    }
}