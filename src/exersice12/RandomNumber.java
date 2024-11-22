package exersice12;

public class RandomNumber {

    public static void main(String[] args) {
        //define the range
        int min = 1000;
        int max = 9999;
        int range = max - min + 1;

//generate numbers from min to max
        for (int i = 0; i < 10; i++) {
            int rand = (int) (Math.random() * range) + min;
            System.out.println(rand);
        }
    }
}