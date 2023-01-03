package com.intermediate.encapsulation.athlete;

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

    public void playGames(){
        System.out.println(name + " started a game.");
        gamesPlayed++;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }


    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

}

