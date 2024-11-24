package ArrayÖvning;

public class Array {
    //Skapa ett program som läser in fem namn ifrån terminalen och sparar dem i en array

   // Skriv ut det första och sista namnet
    public static void main(String[] args) {

        //String[] namn = {"Eva", "Johan", "Karl", "Peter", "Karin"};
        String[] namn = new String[5];

        namn[0] = "Eva";
        namn[1] = "Johan";
        namn[2] = "Karl";
        namn[3] = "Peter";
        namn[4] = "Karin";

        for(int i=0;i<namn.length;i++) {
            System.out.println(namn[i]);
        }

        String myString = "Hej på dig";
        String[] arrayString = myString.split(" ");

        for(int i=0;i<arrayString.length;i++) {
            System.out.println(arrayString[i]);
        }
    }
}
