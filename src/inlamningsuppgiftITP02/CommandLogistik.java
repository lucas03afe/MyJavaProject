package inlamningsuppgiftITP02;

public class CommandLogistik {

    private int amountOfRows = 0;
    private int amountOfCharacters = 0;

    public boolean isSTOP(String input) {
        return input.equalsIgnoreCase("stopp");
    }

    public void updateInput(String input) {
        amountOfRows ++;
        amountOfCharacters += input.length();
    }

    public int getAmountOfRows() {
        return amountOfRows;
    }

    public int getAmountOfCharacters() {
        return amountOfCharacters;
    }

}