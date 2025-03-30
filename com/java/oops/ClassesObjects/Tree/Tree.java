package com.java.oops.ClassesObjects.Tree;

public class Tree {

    double heightFt;
    double trunkDiameterInches;
    TreeType treeType;

    public Tree(double heightFt, double trunkDiameterInches, TreeType treeType) {
        this.heightFt = heightFt;
        this.trunkDiameterInches = trunkDiameterInches;
        this.treeType = treeType;
    }

    void grow() {
        this.heightFt = this.heightFt + 10;
        this.trunkDiameterInches = this.trunkDiameterInches + 1;
    }

    // IF height is greater than 100ft.
    public void announceTallTree() {
        this.heightFt = heightFt;
        if(this.heightFt > 100) {
            System.out.println("The tree " + this.treeType + " is tallest.");
        }
    }
}
