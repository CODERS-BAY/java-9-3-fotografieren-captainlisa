package com.codersbay.plakolb;

public class Camera {

    private String brand;
    private Double megaPixels;
    private Double displaySize;
    private Boolean colored;
    private static int NUM_OF_CAMERAS;
    private Lens lens;

    public Camera(String brand, Double megaPixels, Double displaySize, Boolean colored, Lens lens) {

        this.brand = brand;
        this.megaPixels = megaPixels;
        this.displaySize = displaySize;
        this.colored = colored;
        this.lens = lens;
        NUM_OF_CAMERAS++;

    }

    //Getters and Setters for variables:
    public String getBrand() { return brand; }

    public void setBrand(String brand) { this.brand = brand; }

    public double getMegaPixels() { return megaPixels; }

    public void setMegaPixels(double megaPixels) { this.megaPixels = megaPixels; }

    public double getDisplaySize() { return displaySize; }

    public void setDisplaySize(double displaySize) { this.displaySize = displaySize; }

    public boolean getColored() { return colored; }

    public void setColored(boolean colored) { this.colored = colored; }

    public Lens getLens() { return lens; }

    public void setLens(Lens lens) { this.lens = lens; }

    public static int getNumOfCameras() { return NUM_OF_CAMERAS; }

    //other methods:
    public void changeLens(Lens newLens) {
        this.lens = newLens;
        System.out.println("The new camera lens is " + newLens);
    }

    @Override
    public String toString() {
        return "Camera{" +
                "brand='" + brand + '\'' +
                ", megaPixels=" + megaPixels +
                ", displaySize=" + displaySize +
                ", colored=" + colored +
                ", lens=" + lens +
                '}';
    }
}
