package com.intermediate.inheritance.athlete;

public class FootballPlayer extends Athlete{

    private int goals;
    private int passingYards;


    public FootballPlayer(String name,String nickname,int yearOfBirth,String teamName,  int gamesPlayed, int goals, int passingYards) {
        super(name, nickname, yearOfBirth, teamName, gamesPlayed);
        this.goals = goals;
        this.passingYards = passingYards;
    }

    @Override
    public void getBio() {
        super.getBio();
        System.out.println("Total goals: "+goals);
        System.out.println("Passing Yard: "+passingYards);
    }
}
