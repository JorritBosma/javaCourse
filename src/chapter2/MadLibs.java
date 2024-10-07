package chapter2;

import java.util.Scanner;

public class MadLibs {

    public static void main (String arg[]){
        // 1. Ask for a season of the year and store in variable
        System.out.println("Wat is je lievelingsseizoen?");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        // 2. Ask of a whole number and store in variables
        System.out.println("Wat is je lievelingsgetal?");
        int number = scanner.nextInt();

        // 3. Ask for an adjective and store in variable.
        System.out.println("Welk bijvoeglijk naamwoord vind je leuk?");
        String adjective = scanner.next();
        scanner.close();

        // 4. Display the sentence, concatenate away!
        System.out.println("Op een " + adjective + " " + season + "dag, drink ik minstens " + number + " kopjes koffie, als dat mag.");
    }
}
