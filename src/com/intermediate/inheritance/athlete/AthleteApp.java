package com.intermediate.inheritance.athlete;

public class AthleteApp {

    public static void main(String[] args) {
        BasketBallPlayer kobe = new BasketBallPlayer("Kobie Bryant","Black Mamba",1978,"Lakers",83.7,25.0,1346);
        BasketBallPlayer jordan = new BasketBallPlayer("Michael Jordan","MJ",1963,"Chicago Bulls",83.5,30.1,1007);
        BasketBallPlayer magic = new BasketBallPlayer("Earvin Johnson","Magic",1959,"Lakers",84.8,19.1,983);


        BasketBallPlayer[] basketballPlayers = new BasketBallPlayer[3];
        basketballPlayers[0]= kobe;
        basketballPlayers[1]= jordan;
        basketballPlayers[2]= magic;


        for(BasketBallPlayer basketBallPlayer :basketballPlayers) {
            System.out.println("----------------Basketball Player----------------");
            basketBallPlayer.getBio();
        }


        FootballPlayer Messi = new FootballPlayer("Leo Messi","G.A.O.T",1984,"Argentina",1000,785,10);
        FootballPlayer Ronaldo  = new FootballPlayer("Christiano Ronaldo","Ronaldo",1980,"Portugal",1000,756,10);
        FootballPlayer Neymar = new FootballPlayer("Neymar Jr.","Neymar",1990,"Brazil",856,685,6);

        FootballPlayer[] footballPlayers= new FootballPlayer[3];
        footballPlayers[0]= Messi;
        footballPlayers[1]= Ronaldo;
        footballPlayers[2]= Neymar;

        for(FootballPlayer footballPlayer:footballPlayers){
            System.out.println("---------------Football Player-----------------");
            footballPlayer.getBio();
        }

    }
}
