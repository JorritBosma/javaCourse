package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String arg[]){

        // 1. Get number of hours worked
        System.out.println("Enter the number of hours the employee worked.");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        // 2. Get hourly pay rate
        System.out.println("Enter the employee's hourly pay rate.");
        double rate = scanner.nextDouble();
        scanner.close();

        // 3. Multiply hours and pay rate
        double grossPay = hours * rate;

        // 4. Display result
        System.out.println("The gross pay of the employee is: €" + grossPay + ". Don't spend it all at once!");

    }

}
