package chapter4;


import java.util.Random;
import java.util.Scanner;

public class RollDieGame {

    public static void main(String args[]){

        //Initialize what we know
        int maxRolls = 5;
        int finalSpace = 20;

        Random random = new Random();

        //Play the game
        System.out.println("Let's play this game. " +
                "We will roll the die a maximum number of 5 times and try to reach space 20 exactly. Good luck!");

        int currentSpace = 0;

        for(int i = 1; i<=maxRolls; i++){
            //roll
            int die = random.nextInt(6) + 1;
            currentSpace = currentSpace + die;

            //report roll
            System.out.println(String.format("\nRoll %d: You have rolled a %d.", i, die));

            //check which scenario is reached:
            //win
            if(currentSpace == finalSpace){
                System.out.println("Congratulations, you've won! You reached space " + finalSpace + " in " + i + " rolls.");
                break;
            }

            //overshot lose
            else if (currentSpace > finalSpace) {
                int rollsOvershot = currentSpace - finalSpace;
                System.out.println("Sorry, you overshot space " + finalSpace + " by " + rollsOvershot + " spaces." +
                        " Better luck next time!");
                break;
            }
            //short lose
            else if (i==maxRolls && currentSpace < finalSpace) {
                int rollsShort = finalSpace - currentSpace;
                System.out.println("Sorry, you are out of rolls." +
                        " You are on place " + currentSpace + " and only had " + rollsShort + " places to go.\n");
                break;
            } else {
                int spacesToGo = finalSpace - currentSpace;
                System.out.println("You are no on space " + currentSpace + " and have " + spacesToGo + " spaces to go.");
            }
        }

    }
}