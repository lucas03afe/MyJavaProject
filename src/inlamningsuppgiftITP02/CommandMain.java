package inlamningsuppgiftITP02;

import java.util.Scanner;

public class CommandMain {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Skriv in text rad för rad. Skriv 'stopp' för att avsluta.");

        CommandLogistik logistik = new CommandLogistik();

        while (true) {
            String input = scan.nextLine();
            if (logistik.isSTOP(input)) {
                break;
            }
            logistik.updateInput(input);

        }

        System.out.println("Programmet avslutas...");
        System.out.println("Antal rader: " + logistik.getAmountOfRows());
        System.out.println("Antal tecken: " + logistik.getAmountOfCharacters());
        System.out.println("Antal ord: " + logistik.getAmountOfWords());
        System.out.println("Längsta ordet är: " + logistik.getLongestWord());

    }
}