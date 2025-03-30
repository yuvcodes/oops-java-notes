package com.java.oops.ClassesObjects;

import com.java.oops.ClassesObjects.Employee.Employee;
import com.java.oops.ClassesObjects.Employee.EmployeeLocation;
import com.java.oops.ClassesObjects.Employee.PerformanceRating;
import com.java.oops.ClassesObjects.Tree.Tree;
import com.java.oops.ClassesObjects.Tree.TreeType;

public class Main {

    public static void main(String[] args) {

        Tree mangoTree = new Tree(10,2.5, TreeType.MANGO);
        mangoTree.announceTallTree();

        Tree orangeTree = new Tree(101,2.5, TreeType.ORANGE);
        orangeTree.announceTallTree();

        // Practise question
        Employee ram = new Employee("Ram", PerformanceRating.BEST, EmployeeLocation.PUNE, 25, 25000);
        ram.raiseSalary();

        Employee sham = new Employee("Sham", PerformanceRating.GOOD, EmployeeLocation.PUNE, 25, 25000);
        sham.raiseSalary();

    }
}

