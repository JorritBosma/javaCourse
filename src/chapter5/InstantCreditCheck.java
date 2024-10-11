package chapter5;

import java.util.Scanner;

/*
 * VARIABLE SCOPE
 * Write an 'instant credit check' program that approves
 * anyone who makes more than $25,000 and has a credit score
 * of 700 or better. Reject all others.
 */
public class InstantCreditCheck {
    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;

    static Scanner scanner = new Scanner(System.in);
    public static void main(String args[]){

        //Initialize what we know
        //This is done at class level so we have access to variables in every method within the class,
        // global variables baby!

        //Get what we do not know
        double salary = getSalary();
        int creditScore = getCreditScore();
        scanner.close();

        //Check if the user is qualified
        boolean qualified = isUserQualified(creditScore, salary);

        //Notify user
        notifyUser(qualified);
    }

    public static double getSalary(){
        System.out.println("What is your salary?");
        double salary = scanner.nextDouble();

        return salary;
    }

    public static int getCreditScore(){
        System.out.println("What is your credit score?");
        int creditScore = scanner.nextInt();
        return creditScore;
    }
    public static boolean isUserQualified(int creditScore, double salary){
        if(creditScore >= requiredCreditScore && salary >= requiredSalary){
            return true;
        } else{
            return false;
        }
    }

    public static void notifyUser(boolean isQualified){
        if(isQualified == true){
            System.out.println("You passed the credit check and we will lend you money.");
        }
        else {
            System.out.println("You did not pass the credit check. Please go away.");
        }
    }
}
