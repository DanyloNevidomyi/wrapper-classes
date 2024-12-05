package learning.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberToStringTest {
    @Test
    public void testConvertIntegerToString() {
        NumberToString converter = new NumberToString();
        String result = converter.convertIntegerToString(123);
        assertEquals("123", result, "Результат перетворення числа на рядок має бути '123'");
    }

    @Test
    public void testConvertDoubleToString() {
        NumberToString converter = new NumberToString();
        String result = converter.convertDoubleToString(123.45);
        assertEquals("123.45", result, "Результат перетворення числа з плаваючою точкою на рядок має бути '123.45'");
    }
}