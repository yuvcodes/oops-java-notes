package com.java.oops.ClassesObjects.Employee;

public class Employee {
    String name;
    int age;
    int salary;
    EmployeeLocation location;
    PerformanceRating rating;

    public Employee(String name, PerformanceRating rating, EmployeeLocation location, int age, int salary) {
        this.name = name;
        this.rating = rating;
        this.location = location;
        this.age = age;
        this.salary = salary;
    }

    public void raiseSalary() {

        if (this.rating == rating.BEST) {  // Use enum comparison directly
            int raiseAmount = 5000;
            this.salary += raiseAmount;  // Directly update salary

            System.out.println("Increasing salary by " + raiseAmount);
            System.out.println("Congratulations " + this.name +
                    ", you got a raise! Your new salary is " + this.salary);
        } else {
            System.out.println("Unfortunately, you did not get a raise this time, " + this.name + ".");
        }
    }
}
