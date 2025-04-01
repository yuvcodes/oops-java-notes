package com.java.oops.Inheritance.Hierarchical;

public class DistinguishedEngineer extends Person {
    boolean eligibleForForeignTrips;

    // Default constructor will not work
    // if you just have parametrised constructor in the code
    // u need to explicitly write
    public DistinguishedEngineer() {
        super("", "", 0); // Calling Person's constructor with default values
        this.eligibleForForeignTrips = false;
    }

    // parametrised constructor
    public DistinguishedEngineer(String name, String address, int age, boolean eligible) {
        super(name, address, age);
        this.eligibleForForeignTrips = eligible;
    }

    public boolean isEligibleForForeignTrips() {
        return eligibleForForeignTrips;
    }

    public void setEligibleForForeignTrips(boolean eligibleForForeignTrips) {
        this.eligibleForForeignTrips = eligibleForForeignTrips;
    }
}
