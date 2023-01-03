package com.intermediate.classesandobjects;

public class CarsApp {
    public static void main(String[] args) {
        DodgeChallenger dodgeChallenger = new  DodgeChallenger();
        //dodgeChallenger.getDiscription();
        dodgeChallenger.startEngine();


        System.out.println("----------------------------------------------------------------");

        DodgeChallenger redDodgeChallenger = new  DodgeChallenger(" Red", (byte) 2,(byte)720,(byte)740,(short)453,30000,20,false);
        redDodgeChallenger.getDiscription();
        redDodgeChallenger.startEngine();

    }

}
