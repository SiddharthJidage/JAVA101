package com.intermediate.abstraction.car;

public class AudiSpider extends Cars implements ElectricEngine {

    public AudiSpider(String color,byte numberOfVehicleOwners,short power, short horsePower, short cubicCapacity, int price ,
                      int mileage, boolean isDamaged){
        // To avoid code duplication the car name is defined here as all 'Audi' cars will have the same name .
        super("Audi Spider",color,numberOfVehicleOwners,power,horsePower,cubicCapacity ,price,mileage,isDamaged);

    }


    //below method is extended from the cars class.
    @Override
    public void startEngine() {
        System.out.println("An Audi Spider is started.");
    }

    //below method is implemented from the ElectricCar interface.
    @Override
    public void startElectricEngine() {
        System.out.println("The Audi Spider has started its Electric Engine.");
    }
}
