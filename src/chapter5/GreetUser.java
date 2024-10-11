package chapter5;


/*
 * MY FIRST METHOD
 * Write a method that asks a user for their name, then greets them by name.
 */

import java.awt.datatransfer.SystemFlavorMap;
import java.util.Scanner;

public class GreetUser {
    public static void main(String args[]){
        System.out.println("Hello, my name is GreetUser. I am a Java package. What is your name?");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        greetUser(userName);
        }

        //My first method, note that the storing in a variable is not really needed, did it just for fun.
    public static void greetUser(String userName){
        String greeting = "Hello, " + userName + "! How do you do?";
        System.out.println(greeting);
    }

}
