package chapter5;

import java.util.Scanner;

public class PhoneBiller {
    static double overagePrice = 0.25;
    static double taxRate = 0.15;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){
        //User input
        double baseCost = getBaseCost();
        int overageMinutes = getOverageMinutes();
        scanner.close();
        double overageCost = calculateOverageCost(overageMinutes);
        double subtotal = calculateSubtotal(baseCost, overageMinutes);
        double tax = calculateTax(subtotal);
        double total = calculateTotal(subtotal, tax);
        printPhoneBillStatement(baseCost, overageCost, tax, total);
    }
    public static double getBaseCost(){
        System.out.println("Enter base cost of the plan:");
        double baseCost = scanner.nextDouble();
        return baseCost;
    }

    public static int getOverageMinutes(){
        System.out.println("Enter overage minutes:");
        int overageMinutes = scanner.nextInt();
        return overageMinutes;
    }

    public static double calculateOverageCost(int overageMinutes){
        double overageCost = overageMinutes * overagePrice;
        return overageCost;
    }

    public static double calculateSubtotal(double baseCost, int overageMinutes){
        double subtotal = baseCost + (overageMinutes * overagePrice);
        return subtotal;
    }

    public static double calculateTax(double subtotal){
        double tax = subtotal + (subtotal * taxRate);
        return tax;
    }

    public static double calculateTotal(double subtotal, double tax){
        double total = subtotal + tax;
        return total;
    }

    public static void printPhoneBillStatement(double baseCost, double overageCost, double tax, double total){
        System.out.println("Phone bill statement\n" +
                String.format("Plan: $" + String.format("%.2f", baseCost) + "\n" +
                        "Overage: $" + String.format("%.2f", overageCost) + "\n" +
                        "Tax: $" + String.format("%.2f", tax) + "\n" +
                        "Total: $" + String.format("%.2f", total) + "\n"));
    }
}


//System.out.println("That will be $" + String.format("%.2f", total) + " please. Thanks for shopping!");