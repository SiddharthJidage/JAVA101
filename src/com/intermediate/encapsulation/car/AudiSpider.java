package com.intermediate.encapsulation.car;

public class AudiSpider extends Cars {

    public AudiSpider(String color,byte numberOfVehicleOwners,short power, short horsePower, short cubicCapacity, int price ,
                      int mileage, boolean isDamaged){
        // To avoid code duplication the car name is defined here as all 'Audi' cars will have the same name .
        super("Audi Spider",color,numberOfVehicleOwners,power,horsePower,cubicCapacity ,price,mileage,isDamaged);

    }

    @Override
    public void startEngine() {
        System.out.println("An Audi Spider is started.");
    }
}
