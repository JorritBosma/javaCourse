package chapter3;

import java.util.Scanner;

/* Remember the guilder?
* This game will ask the user to enter quantities of change coins to add up to a whole guilder.
* We have centen, stuivers, dubbeltjes and kwartjes.
* At the end the program will spit out one of three messages.
*
*/
public class GuldenGame {
    public static void main (String args[]){
        // Initialize known values.
        double cent = 0.01;
        double stuiver = 0.05;
        double dubbeltje = 0.1;
        double kwartje = 0.25;
        int gulden = 1;

        // Ask for unknown values
        System.out.println("Welkom bij het Gulden-spel! We vragen je vier keer hoeveel muntjes je wilt.\n" +
                "Het doel is om precies op één gulden uit te komen. Heb je zin om te spelen? Type 'Ja' of 'Nee' en druk op Enter.");
        Scanner scanner = new Scanner(System.in);
        String readyAnswer = scanner.next();
        String message;
        switch(readyAnswer){
            case "Ja":
                message = "Dan gaan we beginnen!\nDenk erom dat je steeds een heel getal invoert.";
                break;
            case "Nee":
                message = "Dan niet joh, start het programma nog maar eens op als je wel zin hebt.";
                break;
            default:
                message = "Error. Je hebt iets anders ingevoerd dan 'Ja' of 'Nee'.\n" +
                        "Denk erom dat je begint met een hoofdletter en dat je geen overbodige karakters intikt.\n"
                        + "Start het programma opnieuw op en probeer het nog eens.";
                break;
        } System.out.println(message);

        if(readyAnswer.equals("Ja")){
            System.out.println("Hoeveel centen wil je hebben?");
            int numOfCents = scanner.nextInt();
            System.out.println("Hoeveel stuivers wil je hebben?");
            int numOfStuivers = scanner.nextInt();
            System.out.println("En hoeveel dubbeltjes wil je hebben?");
            int numOfDubbeltjes = scanner.nextInt();
            System.out.println("Laatste vraag. Hoeveel kwartjes wil je hebben?");
            int numOfKwartjes = scanner.nextInt();
            scanner.close();
            double total = numOfCents * cent + numOfStuivers * stuiver + numOfDubbeltjes * dubbeltje + numOfKwartjes * kwartje;
            double excess = total - 1;
            double shortage = 1 - total;

            // Make decision
            if (total < gulden){
                System.out.println("Helaas. Je hebt minder dan een gulden.\n" +
                        "Je kwam " + shortage + " gulden tekort.\n" +
                        "Volgende keer iets minder bescheiden zijn.");
            } else if (total > gulden){
                System.out.println("Helaas. Je hebt meer dan een gulden.\n" +
                        "Je hebt " + excess + " gulden teveel gegraaid.\n" +
                        "Volgende keer iets minder inhalig zijn.");
            } else {
                System.out.println("Gefeliciteerd! Je hebt precies één gulden verzameld, rekenwonder!");
            }
        } else {
            System.out.println("Doei!");
        }





    }
}
