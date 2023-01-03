package com.intermediate.classesandobjects;

import java.util.Random;

public class DodgeChallenger {


        byte numberOfSeats =5;
        byte numberOfDoor =3;
        byte numberOfVehicleOwners =1;
        byte emissionSticker =4;

        short power =362;
        short horsePower =492;
        short co2Emission =333;
        short cubicCapacity =6417;

        int price =29999;
        int mileage =14999;

        float temperature =3.14F;
        float fuelConsumptionCombined = 15.5F;
        float fuelConsumptionUrban = 21.5F;
        float fuelConsumptionExtraUrban = 13.6F;

        double fuelConsumptionPreciseAverage =15.56355366353;

        boolean isDamaged = true;

        char energyEfficiencyCategory = 'G';
        long registrationNumber;

        String color;


    //Default constructor (dose not contain any parameters.)
    DodgeChallenger(){
        System.out.println("The object 'Dodge Challenger ' is created with default constructor.");

    }
    DodgeChallenger(String color,byte numberOfVehicleOwners,short power, short horsePower, short cubicCapacity, int price , int mileage, boolean isDamaged){
        this.color = color;
        this.numberOfVehicleOwners = numberOfVehicleOwners;
        this.power = power;
        this.horsePower = horsePower;
        this.cubicCapacity = cubicCapacity;
        this.price = price;
        this.isDamaged = isDamaged;
        this.mileage = mileage;
        Random randomNumber = new Random();
        this.registrationNumber = randomNumber.nextLong();


    }


    public void startEngine() {
        System.out.println("The engine is started.");
    }

    public void getDiscription() {
        System.out.println("Dodge challenger color is set to : "+color);
        System.out.println("2018 Dodge challenger SRT 392 ");
        System.out.println("Price: "+ price +" euro");
        System.out.println("Mileage: "+ mileage +" km");
        System.out.println("The car is Damaged: "+ isDamaged);
        System.out.println("Registration number: "+ registrationNumber);
        System.out.println("Cubic capacity: "+ cubicCapacity);
        System.out.println("Power: "+ power +" kw("+ horsePower+"hp)" );
        System.out.println("Power: "+ power +" kw("+ horsePower+"hp)" );
        System.out.println("CO2 Emission: "+ co2Emission +"g/km" );
        System.out.println("Emission sticker: "+ emissionSticker +"(Energy efficiency category:" + energyEfficiencyCategory+")");
        System.out.println("Combined fuel consumption: "+ fuelConsumptionCombined +"l/100km ");
        System.out.println("Urban fuel consumption: "+ fuelConsumptionUrban +"l/100km ");
        System.out.println("Extra Urban fuel consumption: "+ fuelConsumptionExtraUrban +"l/100km ");
        System.out.println("precise average fuel consumption: "+ fuelConsumptionPreciseAverage +"l/100km ");
        System.out.println("Number of previous owners : "+ numberOfVehicleOwners );
        System.out.println("Number of Doors : "+ numberOfDoor );
        System.out.println("Number of Seats : "+ numberOfSeats );


    }

}
