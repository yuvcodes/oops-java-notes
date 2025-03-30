package com.java.oops.Encapsulation;
public class Main {
public static void main(String[] args) {
    BankAccount john = new BankAccount("John", 10000);
    BankAccount nick = new BankAccount("Nick", 5000);

    System.out.println(nick.getBankBalance());

    System.out.println(john.getBankBalance()); // 10000

    // encapsulation
    john.withDraw(5000); // 10000 - 5000
    john.deposit(1000); // 5000 + 1000

    System.out.println(john.getOwner());
    System.out.println(john.getBankBalance()); // 6000
    }
}
