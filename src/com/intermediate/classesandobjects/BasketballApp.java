package com.intermediate.classesandobjects;

public class BasketballApp {

    public static void main(String[] args) {
        BasketBallPlayer kobe = new BasketBallPlayer("Kobie Bryant","Black Mamba",1978,"Lakers",83.7,25.0,1346);
        BasketBallPlayer jordan = new BasketBallPlayer("Michael Jordan","MJ",1963,"Chicago Bulls",83.5,30.1,1007);
        BasketBallPlayer magic = new BasketBallPlayer("Earvin Johnson","Magic",1959,"Lakers",84.8,19.1,983);


        BasketBallPlayer[] basketballPlayers = new BasketBallPlayer[3];
        basketballPlayers[0]= kobe;
        basketballPlayers[1]= jordan;
        basketballPlayers[2]= magic;


        for(BasketBallPlayer basketBallPlayer :basketballPlayers) {
            basketBallPlayer.freeThrow();
        }

    }
}
