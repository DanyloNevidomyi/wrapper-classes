package learning.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToNumberTest {

    @Test
    public void testConvertIntegerStringToNumber() {
        StringToNumber converter = new StringToNumber();
        int result = converter.convertStringToInteger("123");
        assertEquals(123, result, "Результат перетворення рядка на ціле число має бути 123");
    }

    @Test
    public void testConvertDoubleStringToNumber() {
        StringToNumber converter = new StringToNumber();
        double result = converter.convertStringToDouble("123.45");
        assertEquals(123.45, result, 0.0001, "Результат перетворення рядка на число з плаваючою точкою має бути 123.45");
    }

    @Test
    public void testInvalidIntegerString() {
        StringToNumber converter = new StringToNumber();
        assertThrows(NumberFormatException.class, () -> {
            converter.convertStringToInteger("abc");
        }, "Очікується виняток NumberFormatException для некоректного рядка");
    }

    @Test
    public void testInvalidDoubleString() {
        StringToNumber converter = new StringToNumber();
        assertThrows(NumberFormatException.class, () -> {
            converter.convertStringToDouble("abc.def");
        }, "Очікується виняток NumberFormatException для некоректного рядка");
    }
}