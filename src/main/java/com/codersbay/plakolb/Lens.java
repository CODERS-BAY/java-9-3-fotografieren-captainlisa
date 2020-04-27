package com.codersbay.plakolb;

public class Lens {

    private int minFocalLength;
    private int maxFocalLength;
    private static int NUM_OF_LENSES;

    public Lens(int minFocalLength, int maxFocalLength) {
        this.minFocalLength = minFocalLength;
        this.maxFocalLength = maxFocalLength;

        if (minFocalLength > maxFocalLength) {
            System.out.println("minimal focal length must me less than maximal focal length.");
        }

        NUM_OF_LENSES++;

    }

    //Getters and Setters for variables:
    public int getMinFocalLength() { return minFocalLength; }

    public void setMinFocalLength(int minFocalLength) { this.minFocalLength = minFocalLength; }

    public int getMaxFocalLength() { return maxFocalLength; }

    public void setMaxFocalLength(int maxFocalLength) { this.maxFocalLength = maxFocalLength; }

    public static int getNumOfLenses() { return NUM_OF_LENSES; }

    //other methods


    @Override
    public String toString() {
        return "Lens{" +
                "minFocalLength=" + minFocalLength +
                ", maxFocalLength=" + maxFocalLength +
                '}';
    }
}
