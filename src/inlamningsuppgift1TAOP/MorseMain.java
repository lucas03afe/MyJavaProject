package inlamningsuppgift1TAOP;

import java.util.Scanner;

public class MorseMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Välj alternativ:");
        System.out.println("1. Omvandla engelsk text till Morse-kod");
        System.out.println("2. Omvandla Morse-kod till engelsk text");

        int val = scanner.nextInt();
        scanner.nextLine();

        // Om användaren väljer 1
        if (val == 1) {
            System.out.println("Skriv in text:");
            String text = scanner.nextLine();
            System.out.println("Morse-kod: " + MorseConverter.toMorse(text)); // Konverterar och skriver ut Morse-kod

            // Om användaren väljer 2
        } else if (val == 2) {
            System.out.println("Skriv in Morse-kod:");
            String morse = scanner.nextLine();
            System.out.println("Engelsk text: " + MorseConverter.toEnglish(morse)); // Konverterar och skriver ut engelsk text

            // Om användaren skriver något annat än 1 eller 2
        } else {
            System.out.println("Felaktigt val. Starta om programmet.");
        }
    }
}
