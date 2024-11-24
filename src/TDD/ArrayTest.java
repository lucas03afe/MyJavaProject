package TDD;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ArrayTest {

    ArrayPass pass = new ArrayPass();

    @Test
    public void testCorrectPassword() {
        boolean expected = true;

        boolean actual = pass.check("¤password1");

        assertEquals(expected, actual);
    }

    @Test
    public void testAtLeast8Characters() {
        boolean expected = false;

        boolean actual = pass.check("pass1");

        assertEquals(expected, actual);
    }

    @Test
    public void testNoDigits() {
        boolean expected = false;

        boolean actual = pass.check("pass%word");

        assertEquals(expected, actual);
    }

    @Test
    public void testLessThan8CharactersAndNoDigit() {
        boolean expected = false;

        boolean actual = pass.check("pass");

        assertEquals(expected, actual);
    }

    @Test
    public void testNoSpecialCharacters() {
        boolean expected = false;

        boolean actual = pass.check("pass3word");

        assertEquals(expected, actual);
    }
}
