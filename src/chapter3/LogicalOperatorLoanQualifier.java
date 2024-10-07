package chapter3;

import java.util.Scanner;

/*
 * LOGICAL OPERATORS:
 * To qualify for a loan, a person must make at least $30.000 a year
 * AND have been working at their current job for at least 2 years
 */
public class LogicalOperatorLoanQualifier {
    public static void main(String args[]){
        // Initialize known
        int requiredSalary = 30000;
        int requiredYears = 2;

        // Get unknown
        System.out.println("Enter your salary for a year:");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("How many years have you been working at your current job?");
        double years = scanner.nextDouble();
        scanner.close();

        // Make decision
        if(salary >= requiredSalary && years >= requiredYears){
            System.out.println("You qualify for a loan. Congrats!");
        } else if (salary >= requiredSalary && years < requiredYears){
            System.out.println("You do not qualify for a loan. Although you earn enough money, try keeping a job for "
                    + requiredYears + " years or more and come back to us. Caprice?");
        } else if (salary < requiredSalary && years >= requiredYears){
            System.out.println("You do not qualify for a loan. Although you kept your current job long enough, try earning $"
                    + requiredSalary + " or more, then come back. Got it?");
        } else {
            System.out.println("How dare you come to us. You haven't kept your job for "
                + requiredYears + " years and you do not earn at least $"
                + requiredSalary + ". You are wasting our time big time!");
        }
    }
}

//             if(years >= requiredYears){
//                System.out.println("You qualify for a loan. Congrats!");
//            } else System.out.println("You do not qualify for a loan, try keeping a job for "
//                    + requiredYears + " years or more and come back to us. Caprice?");
//
//        } else System.out.println("You do not qualify for a loan, you earn too little money man. Come back when you earn $"
//        + requiredSalary + " or more.");