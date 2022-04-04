package com.company;

public class Main {

    public static void main(String[] args) {
        Car[] cars = {
                createObject("Toyota"), createObject("Lexus"), createObject("Honda")};
        for (int i = 0; i < cars.length; i++) {
            cars[i].print();
        }
    }

    public static Car createObject(String className){
        Toyota toyota = new Toyota("TOYOTA", "LC 200", 195, 3.5);
        Lexus lexus = new Lexus("LEXUS", "LX 570", 220, 5.7);
        Honda honda = new Honda("HONDA", "RIDGELINE", 210, 4.4);
        switch (className){

            case "Honda":

                return honda;

            case "Toyota":

                return toyota;


            case "Lexus":

                return lexus;
        }
        Car[] cars = {
                lexus, toyota, honda
        };
        return null;
    }
}
