package com.intermediate.inheritance.car;

public class CarsApp {
    public static void main(String[] args) {

        System.out.println("----------------------------------------------------------------");

        AudiSpider redAudiSpider = new AudiSpider(" Red", (byte) 2,(byte)720,(byte)740,(short)453,30000,20,false);
        redAudiSpider.getDiscription();
        redAudiSpider.startEngine();


        System.out.println("----------------------------------------------------------------");

        DodgeChallenger redDodgeChallenger = new DodgeChallenger(" Red", (byte) 2,(byte)720,(byte)740,(short)453,30000,20,false);
        redDodgeChallenger.getDiscription();
        redDodgeChallenger.startEngine();

        System.out.println("----------------------------------------------------------------");

    }

}
