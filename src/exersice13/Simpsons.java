package exersice13;

import java.util.Scanner;

public class Simpsons {

    public static void main(String[] args) {
        //Skriv en metod som läser in tal (1-11) och skriver ut en simpson's catch phrase för olika karaktärer
        //skriver man fel tal skriver metoden ut "please choose a correct character"
        //använd en switch

        Scanner scan = new Scanner(System.in);
            System.out.println("1: Homer, 2: Marge, 3: Bart, 4: Lisa, 5: Maggie, 6: Ned, 7: Burns, 8: Edna, 9: Charmels, 10: Apu, 11: Stu");
        System.out.println("Skriv in ett tal mellan 1-11: ");
        int simpsons = Integer.parseInt(scan.nextLine());

        switch (simpsons) {
            case 1:
                System.out.println("Homer: D'oh");
                break;
            case 2:
                System.out.println("Marge: Mmm-mmmmmm");
                break;
            case 3:
                System.out.println("Bart: ¡Ay-Caramba!");
                break;
            case 4:
                System.out.println("Lisa: If anyone wants me, I'll be in my room.");
                break;
            case 5:
                System.out.println("Maggie: (Pacifier suck)");
                break;
            case 6:
                System.out.println("Ned: Hi-Diddly-Ho");
                break;
            case 7:
                System.out.println("Burns: Excellent!");
                break;
            case 8:
                System.out.println("Edna: Ha!");
                break;
            case 9:
                System.out.println("Charmels: SAAAYYYMOOOURRR");
                break;
            case 10:
                System.out.println("Apu: Thank you, Come again!");
                break;
            case 11:
                System.out.println("Stu: Disco Stu likes disco music!");
                break;
            default:
                System.out.println("Please choose a correct character!");
                break;
        }
    }
}

