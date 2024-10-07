package chapter4;

import java.util.Scanner;

/*
 * DO WHILE LOOP:
 * Write a program that allows a user to enter two numbers,
 * and then sums up the two numbers. The user should be able to
 * repeat this action until they indicate they are done.
 */
public class AddNumbers {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        boolean again;

        do{
            System.out.println("Let's add up two numbers!\nEnter the first number:");
            double num1 = scanner.nextDouble();
            System.out.println("Excellent choice. Now enter the second number:");
            double num2 = scanner.nextDouble();
            double total = num1 + num2;
            System.out.println("Your total is: " + String.format("%.2f", total) + ".\n" +
            "Do you want to add up another pair of numbers? Type 'true' or 'false'.");
            again = scanner.nextBoolean();
        } while(again);
        scanner.close();
        System.out.print("Thanks for playing, bye!");
    }
}
