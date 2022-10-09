package com.java;

//UC2 : The Player rolls the die to get a number between 1 to 6.
// Use ((RANDOM)) to get the number between 1 to 6

public class Snake_And_Ladder {
    public static void main(String[] args){
        int max=6,min=1;
        int randomCheck= (int)(Math.random()*(max-min+1)+min); // get values between 1 to 6
        System.out.println("Starting position = 0");
        System.out.println("player got : "+randomCheck);
    }

}
