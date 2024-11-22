package exersice13;

import java.util.Scanner;

public class LongWords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv in en bokstav mellan A-D: ");
        String letter = scan.nextLine();

        switch(letter) {
            case "A":
                System.out.println("Acetylsalicylsyra");
                break;
            case "a":
                System.out.println("Acetylsalicylsyra");
                break;
            case "B":
                System.out.println("Barnavårdscentralen");
                break;
            case "b":
                System.out.println("Barnavårdscentralen");
                break;
            case "C":
                System.out.println("Citronsyracykeln");
                break;
            case "c":
                System.out.println("Citronsyracykeln");
                break;
            case "D":
                System.out.println("Djungeltelegrafen");
                break;
            case "d":
                System.out.println("Djungeltelegrafen");
                break;
            default:
                System.out.println("Felaktig bokstav inskriven, testa igen!");

        }

    }
}
