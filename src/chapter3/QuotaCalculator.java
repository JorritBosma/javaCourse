package chapter3;

import java.util.Scanner;

/*
 * IF ELSE
 * All salespeople are expected to make at least 10 sales each week.
 * For those who do, they receive a congratulatory message.
 * For those who don't, they are informed of how many sales they were short.
 */
public class QuotaCalculator {

    public static void main (String args []){

        //Initialize values we know
        int quota = 10;

        //Get unknown values
        System.out.println("How many sales did you make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Make a decision on the path to take - Output
        if(sales >= quota){
            System.out.println("Congrats! You have made your quota, well done.");
        }
        else {
            int shortage = quota - sales;
            System.out.println("Oh no! You did not make your quota. You were " + shortage + " sales short. Do better next time!");
        }

    }
}
