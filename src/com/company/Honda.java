package com.company;

public class Honda extends Car implements Printable{
    public String model = "Ridgeline";
    public int maxSpeed = 180;
    public double volume = 3.5;

    @Override
    public void print() {
        System.out.println("Name: " +  model +
                "\nMax Speed: " + maxSpeed +
                "\nVolume: " + volume);
    }
}
