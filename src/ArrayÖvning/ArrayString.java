package ArrayÖvning;

import java.util.Scanner;

//Skapa ett program som läser in 5 namn ifrån terminalen och sedan sparar de i en array
//Skriv ut det första och sista namnet
public class ArrayString {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv 5 olika namn: ");
        String[] namn = new String[5];

        for (int i = 0; i < namn.length; i++) {
            namn[i] = scan.nextLine();
        }

        System.out.println(namn[0]);
        System.out.println(namn[4]);
    }
}
