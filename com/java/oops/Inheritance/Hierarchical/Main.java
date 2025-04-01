package com.java.oops.Inheritance.Hierarchical;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // This stack is inherited from Vector class
        // You can check implementation (cmd + click on Stack and see)
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.pop();

        System.out.println(s);

        // eng1 and eng2 extends Person
        DistinguishedEngineer eng1 = new DistinguishedEngineer();
        eng1.setName("Gaurav");
        eng1.setAddress("Wakad");
        eng1.setAge(45);
        eng1.setEligibleForForeignTrips(true);

        SDE1 eng2 = new SDE1("yuvraj", "baner", 25);

        System.out.println(eng2.getAge());
        System.out.println(eng1.getAge());

        System.out.println(eng2.getAddress());
        System.out.println(eng1.getName());
    }
}

