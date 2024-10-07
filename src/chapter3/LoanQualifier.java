package chapter3;

import java.util.Scanner;

/*
 * NESTED IFS:
 * To qualify for a loan, a person must make at least $30.000 a year
 * AND have been working at their current job for at least 2 years
 */
public class LoanQualifier {
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
        if(salary >= requiredSalary){
            if(years >= requiredYears){
                System.out.println("You qualify for a loan. Congrats!");
            } else System.out.println("You do not qualify for a loan, try keeping a job for "
                    + requiredYears + " years or more and come back to us. Caprice?");

        } else System.out.println("You do not qualify for a loan, you earn too little money man. Come back when you earn $"
        + requiredSalary + " or more.");
    }
}
