package com.intermediate.inheritance.athlete;


import java.util.Random;

public class BasketBallPlayer extends Athlete {

    private double freeThrowPercentage;
    private double pointsPerGame;

    public BasketBallPlayer(String name,String nickname,int yearOfBirth,String teamName,double pointsPerGame ,double freeThrowPercentage ,  int gamesPlayed) {
        super(name,nickname,yearOfBirth,teamName,gamesPlayed);
        this.freeThrowPercentage = freeThrowPercentage;
        this.pointsPerGame = pointsPerGame;
    }

    public void freeThrow(){
        Random randomNumberGenerator = new Random();
        if((randomNumberGenerator.nextDouble() * 100 )> freeThrowPercentage){
            /* As the name variable is in 'Athlete class' so we can't access it directly.
            The way to access it we used a method named getName() which returns name, so
            to call the method we have to use 'super' keyword "super.methodName()".
             */
            System.out.println(super.getName()+" Failed to score free Throw.");
        }else{
            System.out.println(super.getName()+" Scored free Throw.");
        }
    }

    @Override
    public void getBio() {
        super.getBio();
        System.out.println("Free throw percentage :" + freeThrowPercentage);
        System.out.println("Points per game:"+ pointsPerGame);
    }
}
