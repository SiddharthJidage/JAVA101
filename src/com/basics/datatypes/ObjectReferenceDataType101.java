package com.basics.datatypes;

public class ObjectReferenceDataType101 {
/*
*     OBJECT REFERENCE:
*       Object - is an instance of the class stored in the memory.
*       Reference - point's to the memory location where object is stored.
*
*     SYNTAX:
*       ClassName objectName = value OR new ClassName();
*
* */

    public static void main(String[] args) {
        Byte numberOfSeats= 5;
        Short horsePower= 392;
        Integer price=299999;
        Long registrationNumber=2132526672718L;

        Float fuelConsumptionCombined =15.5F;
        Double fuelConsumptionPrecise=15.253423462534624355623;

        Boolean isDamaged= true;
        Character energyEfficiencyCategory = 'G';

        String carModel="DodgeChallenger SRT 392";
        String carModelNew = new String("DodgeChallenger SRT 392"); // both statements work's.

        System.out.println("Number Of Seats:" + numberOfSeats);
        System.out.println("Horse Power:" + horsePower);
        System.out.println("Price:" + price.floatValue());//here I used function to change the dataType of the output.
        System.out.println("Registration Number :" + registrationNumber);
        System.out.println("Fuel Consumption Combined:" + fuelConsumptionCombined);
        System.out.println("Fuel Consumption Precise:" + fuelConsumptionPrecise);
        System.out.println("Is Damaged:" + isDamaged);
        System.out.println("Energy Efficiency Category:" + energyEfficiencyCategory);

        System.out.println("Car Model:" + carModel);
        System.out.println("Car Model Upper Case:" + carModel.toUpperCase());
        System.out.println("Car Model Lower Case:" + carModel.toLowerCase());
        System.out.println("Car Model and Car Model New are equal:" + carModel.equals(carModelNew));
        System.out.println("Car Model New:" + carModelNew);



    }



}
