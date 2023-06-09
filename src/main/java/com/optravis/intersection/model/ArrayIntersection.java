package com.optravis.intersection.model;

public class ArrayIntersection {
    private int arrayOneSize;
    private int arrayTwoSize;
    private int intersectionCount;
    private double timeTaken;

    private boolean arrayOneToSet;
    private boolean iterateOverSet;

    public int getArrayOneSize() {
        return arrayOneSize;
    }

    public void setArrayOneSize(int arrayOneSize) {
        this.arrayOneSize = arrayOneSize;
    }

    public int getArrayTwoSize() {
        return arrayTwoSize;
    }

    public void setArrayTwoSize(int arrayTwoSize) {
        this.arrayTwoSize = arrayTwoSize;
    }

    public int getIntersectionCount() {
        return intersectionCount;
    }

    public void setIntersectionCount(int intersectionCount) {
        this.intersectionCount = intersectionCount;
    }

    public double getTimeTaken() {
        return timeTaken;
    }

    public void setTimeTaken(double timeTaken) {
        this.timeTaken = timeTaken;
    }

    public boolean isArrayOneToSet() {
        return arrayOneToSet;
    }

    public void setArrayOneToSet(boolean arrayOneToSet) {
        this.arrayOneToSet = arrayOneToSet;
    }

    public boolean isIterateOverSet() {
        return iterateOverSet;
    }

    public void setIterateOverSet(boolean iterateOverSet) {
        this.iterateOverSet = iterateOverSet;
    }
}
