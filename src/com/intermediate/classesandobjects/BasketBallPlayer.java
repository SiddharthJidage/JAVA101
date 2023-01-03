package com.intermediate.classesandobjects;


import java.util.Random;

public class BasketBallPlayer {

    String name;
    String nickname;
    int yearOfBirth;
    String teamName;

    double freeThrowPercentage;
    double pointsPerGame;
    int gamesPlayed;


    public BasketBallPlayer(String name, String nickname, int yearOfBirth, String teamName, double freeThrowPercentage, double pointsPerGame, int gamesPlayed) {
        this.name = name;
        this.nickname = nickname;
        this.yearOfBirth = yearOfBirth;
        this.teamName = teamName;
        this.freeThrowPercentage = freeThrowPercentage;
        this.pointsPerGame = pointsPerGame;
        this.gamesPlayed = gamesPlayed;
    }

    public void freeThrow(){
        Random randomNumberGenerator = new Random();
        if((randomNumberGenerator.nextDouble() * 100 )> freeThrowPercentage){
            System.out.println(name +" Failed to score free Throw.");
        }else{
            System.out.println(name+" Scored free Throw.");
        }



    }
}
