package com.intermediate.inheritance.athlete;

public class Athlete {
    private String name;
    private String nickname;
    private int yearOfBirth;
    private String teamName;
    private int gamesPlayed;

    public Athlete(String name , String nickname , int yearOfBirth , String teamName , int gamesPlayed) {
        this.name = name;
        this.nickname = nickname;
        this.yearOfBirth = yearOfBirth;
        this.teamName = teamName;
        this.gamesPlayed = gamesPlayed;
    }

    public String getName() {
        return name;
    }
    public void getBio() {
        System.out.println("name : "+name + "("+nickname+")");
        System.out.println("Born in : " + yearOfBirth);
        System.out.println("Last team is : " + teamName+ " and played "+gamesPlayed+" games");

    }
}

