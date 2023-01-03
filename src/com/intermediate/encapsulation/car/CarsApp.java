package com.intermediate.encapsulation.car;

public class CarsApp {
    public static void main(String[] args) {

        System.out.println("----------------------------------------------------------------");

        AudiSpider redAudiSpider = new AudiSpider(" Red", (byte) 2,(byte)720,(byte)740,(short)453,30000,20,false);
        System.out.println(redAudiSpider.getCarName()+"'s price is $ "+redAudiSpider.getPrice());
        redAudiSpider.setPrice(35000);
        System.out.println(redAudiSpider.getCarName()+"'s price is $ "+redAudiSpider.getPrice());
        redAudiSpider.startEngine();
        System.out.println("The car has "+ redAudiSpider.getMileage()+" miles");
        redAudiSpider.drive(100);
        System.out.println("After driving the car, it has "+ redAudiSpider.getMileage()+" miles");


        System.out.println("----------------------------------------------------------------");

        DodgeChallenger redDodgeChallenger = new DodgeChallenger(" Red", (byte) 2,(byte)720,(byte)740,(short)453,30000,20,false);
        System.out.println(redDodgeChallenger.getCarName()+"'s price is $ "+redDodgeChallenger.getPrice());
        redDodgeChallenger.setPrice(35000);
        System.out.println(redDodgeChallenger.getCarName()+"'s price is $ "+redDodgeChallenger.getPrice());
        redDodgeChallenger.startEngine();
        System.out.println("The car has "+ redDodgeChallenger.getMileage()+" miles");
        redDodgeChallenger.drive(100);
        System.out.println("After driving the car, it has "+ redDodgeChallenger.getMileage()+" miles");


        System.out.println("----------------------------------------------------------------");

    }

}
