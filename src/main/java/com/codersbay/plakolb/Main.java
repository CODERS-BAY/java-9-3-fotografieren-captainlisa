package com.codersbay.plakolb;

public class Main {

    public static void main(String[] args) {

        Lens lensOne = new Lens (24, 70);
        Lens lensTwo = new Lens (18, 250);
        Lens lensThree = new Lens (38, 50);
        Camera cameraOne = new Camera("Canon", 18.0, 7.6, true, lensOne);

        System.out.println(cameraOne.getLens());
        System.out.println(cameraOne.toString());
        cameraOne.changeLens(lensTwo);
        System.out.println(cameraOne.toString());

        System.out.println("The number of cameras created is " + cameraOne.getNumOfCameras());
        System.out.println("The number of lenses created is " + lensOne.getNumOfLenses());


    }
}
