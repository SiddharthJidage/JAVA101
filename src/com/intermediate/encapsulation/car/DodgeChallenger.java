package com.intermediate.encapsulation.car;

public class DodgeChallenger extends Cars {


    //Default constructor (dose not contain any parameters.)
    DodgeChallenger(){
        System.out.println("The object 'Dodge Challenger ' is created with default constructor.");

    }
    DodgeChallenger(String color,byte numberOfVehicleOwners,short power, short horsePower, short cubicCapacity, int price ,
                    int mileage, boolean isDamaged){
        // To avoid code duplication the car name is defined here as all 'Dodge Challenger' cars will have the same name .
        super("Dodge Challenger",color,numberOfVehicleOwners,power,horsePower,cubicCapacity ,price,mileage,isDamaged);

    }

    //Override the method of super class.
    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("A dodge challenger car is started.");
    }
}
