package chapter3;

import java.util.Scanner;

/*
multiline comments! oh boy...
it is REALLY multiline, neat!
Back to business, we are working on an IF Statement this lesson.
All salespeople get a standard payment of $1000 a week.
Salespeople who exceed 10 sales get an additional bonus of $250 and some nice words in the console, who wouldn't want that!
 */
public class SalaryCalculator {

    public static void main(String args[]){

        //Initialize known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;
        String noBonusWord = "not ";
        String noBonusCongrats = "Do better next time...";

        //Get values for the unknown
        System.out.println("How many sales did you make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Quick detour for the bonus earners
        if(sales > quota){
            salary = salary + bonus;
            noBonusWord = "";
            noBonusCongrats = "You are a sales maniac!";
        }


        //Output
        System.out.print("Ok, here's the deal. You have earned a salary of $" + salary + " this week. Don't spend it all at once!" + "\r\n" + "You did " + noBonusWord + "earn a bonus this week. " + noBonusCongrats);
    }
}
