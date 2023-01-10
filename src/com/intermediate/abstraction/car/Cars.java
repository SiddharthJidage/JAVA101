package com.intermediate.abstraction.car;

import java.util.Random;

public abstract class Cars {

    //Making the variables (entities) private so that no other class can change them.
    private byte numberOfSeats = 5;
    private byte numberOfDoor = 3;
    private byte numberOfVehicleOwners = 1;
    private byte emissionSticker = 4;

    private short power = 362;
    private short horsePower = 492;
    private short co2Emission = 333;
    private short cubicCapacity = 6417;

    private int price = 29999;
    private int mileage = 14999;

    private float temperature = 3.14F;
    private float fuelConsumptionCombined = 15.5F;
    private float fuelConsumptionUrban = 21.5F;
    private float fuelConsumptionExtraUrban = 13.6F;

    private double fuelConsumptionPreciseAverage = 15.56355366353;

    private boolean isDamaged = true;

    private char energyEfficiencyCategory = 'G';
    private long registrationNumber;

    private String color;
    private String carName;


    //Default constructor (dose not contain any parameters.)
    Cars() {
        System.out.println("The object 'Dodge Challenger ' is created with default constructor.");

    }

    // constructor with parameters
    Cars(String carName,String color , byte numberOfVehicleOwners , short power , short horsePower , short cubicCapacity , int price , int mileage , boolean isDamaged) {
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
        this.carName = carName;



    }


    public abstract void startEngine();

    public void getDiscription() {
        System.out.println("For the "+carName+" color is set to : " + color);
        System.out.println("Price: $" + price );
        System.out.println("Mileage: " + mileage + " km");
        System.out.println("The car is Damaged: " + isDamaged);
        System.out.println("Registration number: " + registrationNumber);
        System.out.println("Cubic capacity: " + cubicCapacity);
        System.out.println("Power: " + power + " kw(" + horsePower + "hp)");
        System.out.println("CO2 Emission: " + co2Emission + "g/km");
        System.out.println("Emission sticker: " + emissionSticker + "(Energy efficiency category:" + energyEfficiencyCategory + ")");
        System.out.println("Combined fuel consumption: " + fuelConsumptionCombined + "l/100km ");
        System.out.println("Urban fuel consumption: " + fuelConsumptionUrban + "l/100km ");
        System.out.println("Extra Urban fuel consumption: " + fuelConsumptionExtraUrban + "l/100km ");
        System.out.println("precise average fuel consumption: " + fuelConsumptionPreciseAverage + "l/100km ");
        System.out.println("Number of previous owners : " + numberOfVehicleOwners);
        System.out.println("Number of Doors : " + numberOfDoor);
        System.out.println("Number of Seats : " + numberOfSeats);


    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = Math.abs(price);
    }

    public int getMileage() {
        return mileage;
    }

    public void drive(int mileage) {
        this.mileage += Math.abs(mileage);
    }

    public String getCarName() {
        return carName;
    }
}
