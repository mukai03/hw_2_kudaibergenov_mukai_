package com.company;

public class Toyota extends Car implements Printable{
    public String model = "LC 200";
    public int maxSpeed = 195;
    public double volume = 4.5;

    @Override
    public void print() {
        System.out.println("Model: " + model +
                "\nMax Speed: " + maxSpeed +
                "\nVolume: " + volume);
    }
}
