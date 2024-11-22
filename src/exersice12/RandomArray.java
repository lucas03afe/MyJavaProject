package exersice12;

public class RandomArray {

    public static void main(String[] args) {
        //Spara 10 slumptal från 1-100 i en array

        int[] randomArray = new int[10];
//define the range
        int min = 1;
        int max = 100;
        int range = max - min + 1;

//generate numbers from min to max
        for (int i = 0; i < 10; i++) {
            int rand = (int) (Math.random() * range) + min;
            randomArray[i] = rand;

        }
        //Skriv ut innehållet i arrayn till consolen
        //for (int i=0;i<10;i++) {
         //   System.out.println(randomArray[i]);
       // }
        //Skapa en metod som returnerar slumptal från 1-100 i en array
        RandomGenerator generator = new RandomGenerator();
        int[] newArray = generator.randomArray();
        for (int i=0;i<newArray.length;i++) {
            System.out.println(newArray[i]);
        }
    }
    //Storleken på arrayn är också ett slumptal mellan 1-100
}