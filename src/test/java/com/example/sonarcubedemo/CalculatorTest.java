package com.example.sonarcubedemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void applyOperator() {
        Calculator calc = new Calculator();
        assertEquals(16, calc.applyOperator("+", 7, 9));
        assertEquals(-2, calc.applyOperator("-", -7, -9));
        assertEquals(63, calc.applyOperator("*", 7, 9));
        assertEquals(1, calc.applyOperator("/", 7, 9));
        assertEquals(7, calc.applyOperator("MIN", 7, 9));
        assertEquals(9, calc.applyOperator("MAX", 7, 9));
    }

    @Test
    void applyOperatorShouldThrowExceptionForDivideByZero() {
        Calculator calc = new Calculator();
        assertThrows(ArithmeticException.class, () -> calc.applyOperator("/", 0, 9));
    }

    @Test
    void isOperator() {
        Calculator calc = new Calculator();
        assertTrue(calc.isOperator("+"));
        assertTrue(calc.isOperator("MIN"));
        assertFalse(calc.isOperator("maximum"));
        assertFalse(calc.isOperator("^"));
    }
}