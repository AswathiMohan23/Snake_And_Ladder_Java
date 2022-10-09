package com.java;
//UC3
//The Player then checks for a Option. They are No Play,Ladder or Snake. - Use ((RANDOM)) to
// check for Options - In Case of No Play the player stays in the same position- In Case of Ladder the player
// moves ahead by the number of position received in the die- In Case of Snake the player moves
// behind by the number of position received in the die

public class Snake_And_Ladder {
    public static void main(String[] args){
        System.out.println("\nWelcome to snake and ladder");
        int ladder = 1,player=0;
        int snake = 1,max = 2, min = 0, count = 0, positionMax = 6, positionMin = 1;

        int randomCheck = (int) (Math.random() * (max - min + 1) + min);

        if (randomCheck == 1){
            int positionCheck = (int) (Math.random() * (positionMax - positionMin + 1) + positionMin);
            System.out.println("you got : " + positionCheck);
            ladder = player + positionCheck;
            if (ladder >= 100)
                ladder = 100;
            player = ladder;
            System.out.println("Ladder : now your position has gone to : " + player);
        } else if (randomCheck == 2) {
            int positionCheck = (int) (Math.random() * (positionMax - positionMin + 1) + positionMin);
            System.out.println("you got : " + positionCheck);
            snake = player - positionCheck;
            if (snake <= 1)
                snake = 1; // to change -ve to +ve
            player = snake;
            System.out.println("snake : ohh now your position has gone down to : " + player );
        } else if ((randomCheck == 0)) {
            int positionCheck = (int) (Math.random() * (6 - 2 + 1) + 2);// if 1 comes it till show noplay so we are taking from 2 for this uc
            System.out.println("\nyou got : " + positionCheck);
            System.out.println("No play : you need 1 to start the game try again");}
    }


}
