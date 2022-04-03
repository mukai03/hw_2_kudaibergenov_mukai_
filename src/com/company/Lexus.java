package com.company;

public class Lexus extends Car implements Printable{
    public String model = "LX 570";
    public int maxSpeed = 220;
    public double volume = 5.7;

    @Override
    public void print() {
        System.out.println("Model: " + model +
                "\nMaxSpeed: " + maxSpeed +
                "\nVolume: " + volume);
    }
}
