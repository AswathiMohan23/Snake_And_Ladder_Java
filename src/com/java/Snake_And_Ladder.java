package com.java;
//UC4
//Repeat till the Player reaches the winning position 100. - Note In case
// the player position moves below 0, then the player restarts from 0

public class Snake_And_Ladder {
    public static void main(String[] args) {
        System.out.println("\nWelcome to snake and ladder");
        int ladder = 1,player=0;
        int snake = 1,max = 2, min = 0, count = 0, positionMax = 6, positionMin = 1;
        for (int i = 1;player!=100 ; i++) {
            i++;
            int randomCheck = (int) (Math.random() * (max - min + 1) + min);
            if (player == 100) {
                int positionCheck = (int) (Math.random() * (positionMax - positionMin + 1) + positionMin);
                System.out.println("your previous position  : " + player);
                System.out.println("you got : " + positionCheck);
                System.out.println("\nCongrats you got 100 and won the game");
            } else if ((randomCheck == 1)&&(count==2)){
                int positionCheck = (int) (Math.random() * (positionMax - positionMin + 1) + positionMin);
                System.out.println("\nyour previous position  : " + player);
                System.out.println("you got : " + positionCheck);
                ladder = player + positionCheck;
                if (ladder >= 100)
                    ladder = 100;
                player = ladder;
                System.out.println("Ladder : now your position has gone to : " + player);
            } else if ((randomCheck == 2)&&(count==2)) {
                int positionCheck = (int) (Math.random() * (positionMax - positionMin + 1) + positionMin);
                System.out.println("\nyour previous position  : " + player);
                System.out.println("you got : " + positionCheck);
                snake = player - positionCheck;
                if (snake <= 1)
                    snake = 1; // to change -ve to +ve
                player = snake;
                System.out.println("snake : ohh now your position has gone down to : " + player );
            } else if ((randomCheck == 0)) {
                int positionCheck = (int) (Math.random() * (positionMax - positionMin + 1) + positionMin);
                if ((count == 0) && (positionCheck == 1)) {
                    System.out.println("\nyou got : " + positionCheck);
                    System.out.println("you can start the game now");
                    player = 1;
                    count = 2;}
                else if((count == 0) && (positionCheck != 1)){
                    System.out.println("\nyou got : " + positionCheck);
                    System.out.println("No play : you need 1 to start the game try again");}

            }
        }

    }

}
