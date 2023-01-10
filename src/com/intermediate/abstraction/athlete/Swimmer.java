package com.intermediate.abstraction.athlete;

public class Swimmer extends Athlete implements Swimming{

    private int finaPoints;
    public Swimmer(String name, String nickname, int yearOfBirth, String teamName, int gamesPlayed,int finaPoints) {
        super(name, nickname, yearOfBirth, teamName, gamesPlayed);

        this.finaPoints = finaPoints;
    }

    @Override
    public String getBodyType() {

       return "Lean Muscles and flexible ankles.";
    }

    @Override
    public void getBio(){
        super.getBio();
        System.out.println("Fina Points: " + finaPoints);
    }

    @Override
    public void freeStyle() {
        System.out.println("Swimming in freeStyle mode.");
    }
}
