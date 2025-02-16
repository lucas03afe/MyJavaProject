package inlamningsuppgift1TAOP;

import java.util.HashMap;

public class MorseConverter {


    private static final HashMap<Character, String> englishToMorse = new HashMap<>();
    private static final HashMap<String, Character> morseToEnglish = new HashMap<>();


    static {
        char[] letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
                "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",
                "..-", "...-", ".--", "-..-", "-.--", "--.." };


        for (int i = 0; i < letters.length; i++) {
            englishToMorse.put(letters[i], morse[i]);
            morseToEnglish.put(morse[i], letters[i]);
        }

        englishToMorse.put(' ', "/");
        morseToEnglish.put("/", ' ');
    }

    // Metod för att omvandla text till Morse-kod
    public static String toMorse(String text) {
        StringBuilder morseText = new StringBuilder();
        text = text.toUpperCase(); // Gör texten till stora bokstäver

        // Går igenom varje bokstav i texten
        for (char c : text.toCharArray()) {
            if (!englishToMorse.containsKey(c)) {
                return "Fel: Ogiltigt tecken i texten.";
            }
            morseText.append(englishToMorse.get(c)).append(" ");
        }
        return morseText.toString().trim();
    }

    // Metod för att omvandla Morse-kod till text
    public static String toEnglish(String morseCode) {
        StringBuilder text = new StringBuilder();
        String[] morseWords = morseCode.split(" ");

        // Går igenom varje Morse-sekvens
        for (String word : morseWords) {
            if (!morseToEnglish.containsKey(word)) { //
                return "Fel: Ogiltig Morse-kod.";
            }
            text.append(morseToEnglish.get(word)); //
        }
        return text.toString();
    }
}
