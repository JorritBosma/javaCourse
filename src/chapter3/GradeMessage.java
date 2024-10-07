package chapter3;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String args[]){

        System.out.println("What was your letter grade?");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message;

        switch(grade){
            case "A":
                message = "Excellent job, couldn't be better!";
                break;
            case "B":
                message = "Great job, but not the best.";
                break;
            case "C":
                message = "Good job, but not great.";
                break;
            case "D":
                message = "Work harder fool!";
                break;
            case "F":
                message = "This is unexceptable. Shame on you!";
                break;
            default:
                message = "Error. Invalid grade";
                break;
        } System.out.println("I have only one thing to say:\n" + message);

    }
}
