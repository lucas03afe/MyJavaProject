package inlamningsuppgiftITP02;

public class CommandLogistik {

    private int amountOfRows = 0;
    private int amountOfCharacters = 0;
    private int amountOfWords = 0;
    private String longestWord = "";

    public boolean isSTOP(String input) {
        return input.equalsIgnoreCase("stopp");
    }

    public void updateInput(String input) {
        amountOfRows ++;
        amountOfCharacters += input.length();
        amountOfWords += countWords(input);
        findLongestWord(input);
    }

    public int getAmountOfRows() {
        return amountOfRows;
    }

    public int getAmountOfCharacters() {
        return amountOfCharacters;
    }

    public int getAmountOfWords() {
        return amountOfWords;
    }
    private int countWords(String input) {
        if (input.trim().isEmpty()) { // Hanterar tomma eller bara mellanslag
            return 0;
        }
        return input.trim().split("\\s+").length; // Dela upp på ett eller flera mellanslag
    }
    public String getLongestWord() {
        return longestWord;
    }

    private void findLongestWord(String input) {
        // Dela upp strängen i ord
        String[] words = input.trim().split("\\s+");
        for (String word : words) {
            // Om ordet är längre än det nuvarande längsta ordet, uppdatera
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
    }
}
