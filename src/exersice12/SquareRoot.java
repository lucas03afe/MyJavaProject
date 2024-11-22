package exersice12;

import java.util.Scanner;

public class SquareRoot {
//Skapa en metod som läser in 2 kateter (a och b) på en triangel och räknar ut hypotenusan

    //Tips: Hypotenusan i en kvadrat är lika med summan av kvadraterna och kateterna
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv in första talet: ");

        double a = Integer.parseInt(scanner.nextLine());

        System.out.println("Skriv in andra talet: ");
        double b = Integer.parseInt(scanner.nextLine());

        double hypotenuse = Math.sqrt(a*a + b*b);
        System.out.println("Hypotenusan är: " + hypotenuse);


    }
}
