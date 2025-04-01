package com.java.oops.Inheritance.SingleLevel;

import java.util.ArrayList;

// any type of data (eg. D)
public class ModArrayList<D> extends ArrayList<D> {

    public D getUsingMod(int index) {
        int validIndex = Math.abs(index) % this.size();
        return this.get(validIndex);
    }


}
