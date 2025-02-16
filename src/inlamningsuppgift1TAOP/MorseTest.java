package inlamningsuppgift1TAOP;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MorseTest {

    // Testar att text omvandlas korrekt till Morse-kod
    @Test
    void testToMorse() {
        assertEquals(".... . .---", MorseConverter.toMorse("HEJ"));
        assertEquals(".-", MorseConverter.toMorse("A"));
    }

    // Testar att Morse-kod omvandlas korrekt till text
    @Test
    void testToEnglish() {
        assertEquals("HEJ", MorseConverter.toEnglish(".... . .---"));
        assertEquals("A", MorseConverter.toEnglish(".-"));
    }

    // Testar att felaktiga tecken i text ger ett felmeddelande
    @Test
    void testInvalidCharacter() {
        assertEquals("Fel: Ogiltigt tecken i texten.", MorseConverter.toMorse("$"));
    }

    // Testar att felaktig Morse-kod ger ett felmeddelande
    @Test
    void testInvalidMorseCode() {
        assertEquals("Fel: Ogiltig Morse-kod.", MorseConverter.toEnglish("....."));
    }

    // Testar att mellanslag hanteras korrekt
    @Test
    void testSpaceManagement() {
        assertEquals(".... . .--- / .-- --- .-. .-.. -..", MorseConverter.toMorse("HEJ WORLD")); // "HEJ WORLD" ska bli ".... . .--- / .-- --- .-. .-.. -.."
        assertEquals("HEJ WORLD", MorseConverter.toEnglish(".... . .--- / .-- --- .-. .-.. -..")); // ".... . .--- / .-- --- .-. .-.. -.." ska bli "HEJ WORLD"
    }
}
