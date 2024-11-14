package exersice11;

import java.util.Random;
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello you Dog!");

        Random random = new Random();
        int generatedNumber = random.nextInt(99);
        System.out.println("Gissa ett nummer mellan 0 - 99!");

        Scanner scanner = new Scanner(System.in);

        int userNumber = Integer.parseInt(scanner.nextLine());

        if (userNumber == generatedNumber) {
            System.out.println("Grattis, du gissade rätt!!");
        }
        else if (userNumber < generatedNumber) {
            System.out.println("Tyvärr, inte rätt! Nummret var: " + generatedNumber);
            System.out.println("Testa igen gärna :)");
        }
        else if (userNumber > generatedNumber) {
            System.out.println("Tyvärr, inte rätt! Numret var: " + generatedNumber);
            System.out.println("Testa igen gärna :)");
        }

    }



}
