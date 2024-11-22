package inlamningsuppgiftITP02;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class CommandTest {

    //Kontrollera att isStopp fungerar korrekt
    @Test
    public void testisSTOP() {
        CommandLogistik logistik = new CommandLogistik();

        assertTrue(logistik.isSTOP("stopp"));
        assertTrue(logistik.isSTOP("STOPP"));
        assertTrue(logistik.isSTOP("StoPP"));

        assertFalse(logistik.isSTOP("hejsan"));
        assertFalse(logistik.isSTOP(" "));
        assertFalse(logistik.isSTOP(","));
    }

    //Kontrollera att antal tecken beräknas korrekt
    @Test
    public void testGetAmountOfCharacters() {
        CommandLogistik logistik = new CommandLogistik();

        logistik.updateInput("Tja!");
        assertEquals(4, logistik.getAmountOfCharacters());

        logistik.updateInput("Jag heter Lucas,");
        assertEquals(20, logistik.getAmountOfCharacters());

        logistik.updateInput("vad heter du?");
        assertEquals(33, logistik.getAmountOfCharacters());
    }

    //Kontrollera att antal rader beräknas korrekt
    @Test
    public void testGetAmountOfRows() {
        CommandLogistik logistik = new CommandLogistik();

        logistik.updateInput("Tja!");
        assertEquals(1, logistik.getAmountOfRows());

        logistik.updateInput("Jag heter Lucas,");
        assertEquals(2, logistik.getAmountOfRows());

        logistik.updateInput("vad heter du?");
        assertEquals(3, logistik.getAmountOfRows());
    }
}
