package CodeTogether;

import java.util.Random;
import java.util.Scanner;

public class CodeTogetherGuessTheNumber {


    // Genrera ett slumptal mellan 0 och 99X
    // gissa på ett tal och svara om slumptalet är större eller mindreX
    // Skriv Grattis när du gissat rättX

    // Skriv slumptalsgeneratorn i separat klass

    // Skriv enhetstest

    // Gissningslogiken får vara i valfri klass X


    public static void main(String[] args) {
        Random random = new Random();
        int generatedNumber = random.nextInt(100);
        System.out.println(generatedNumber);
        System.out.println("Jag har ett nummer mellan 0 och 99, gissa vilket. :");

        Scanner scanner = new Scanner(System.in);
        int userNumber = Integer.parseInt(scanner.nextLine());

        if (generatedNumber == userNumber){
            System.out.println("Grattis");
        }else if (generatedNumber < userNumber){
            System.out.println("Ditt nummer är större");
        }else {
            System.out.println("Ditt nummer är mindre");
        }

        switch (Integer.compare(generatedNumber, userNumber)) {
            case 0:
                System.out.println("Grattis");
                break;
            case -1:
                System.out.println("Ditt nummer är större");
                break;
            case 1:
                System.out.println("Ditt nummer är mindre");
                break;

        }


//       int[] arrayRandom = new int[10];
//        for (int i = 0; i < 100; i++) {
//            int number = (int) (Math.floor(Math.random() * 10));
//            // System.out.println(number);
//            arrayRandom[number] = arrayRandom[number] + 1;
//        }
//        System.out.println(Arrays.toString(arrayRandom));


//        Random random = new Random();
//        arrayRandom = new int[10];
//        for (int i = 0; i < 100; i++) {
//            int number = random.nextInt(100);
//            arrayRandom[number] = arrayRandom[number] + 1;
//        }
//        System.out.println(Arrays.toString(arrayRandom));
    }
}