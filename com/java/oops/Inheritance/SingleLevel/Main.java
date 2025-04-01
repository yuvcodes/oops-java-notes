package com.java.oops.Inheritance.SingleLevel;

public class Main {
    public static void main(String[] args) {

        // Inheritance
        ModArrayList<Integer> list = new ModArrayList();
        list.add(1);
        list.add(2);

        System.out.println(list.getUsingMod(3)); // 3 % 2(size) = 1 (element at index 1)
        System.out.println(list.getUsingMod(4)); // 4 % 2 = 0 (element at index 0)
        System.out.println(list.getUsingMod(1)); // 1 % 2 = 1  (element at index 1)


    }
}
