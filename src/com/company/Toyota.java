package com.company;

public class Toyota extends Car {
    private String model;
    private int maxSpeed;
    private double volume;

    public Toyota(String name, String model, int maxSpeed, double volume) {
        super(name);
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.volume = volume;
    }

    @Override
    public void print() {
        System.out.println("Model: " + model +
                "\nMax Speed: " + maxSpeed +
                "\nVolume: " + volume);
    }
}
