package com.example.sonarcubedemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RPNCalculatorTest {
    @Test
    void solve() {
        RPNCalculator rpnCalculator = new RPNCalculator();
        assertEquals(20, rpnCalculator.solve(new String[]{"20"}));
        assertEquals(25, rpnCalculator.solve(new String[]{"20", "5", "+"}));
        assertEquals(15, rpnCalculator.solve(new String[]{"20", "5", "-"}));
        assertEquals(4, rpnCalculator.solve(new String[]{"20", "5", "/"}));
        assertEquals(100, rpnCalculator.solve(new String[]{"20", "5", "*"}));
        assertEquals(0, rpnCalculator.solve(new String[]{"6", "-132", "/"}));
        assertEquals(18, rpnCalculator.solve(new String[]{"4", "2", "+", "3", "*"}));
        assertEquals(141, rpnCalculator.solve(new String[]{"3", "5", "8", "*", "7", "+", "*"}));
        assertEquals(9, rpnCalculator.solve(new String[]{"2", "1", "+", "3", "*"}));
        assertEquals(22, rpnCalculator.solve(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}));

        assertEquals(4, rpnCalculator.solve(new String[]{"4", "5", "MIN"}));
        assertEquals(6, rpnCalculator.solve(new String[]{"5", "6", "MAX"}));
        assertEquals(10, rpnCalculator.solve(new String[]{"4", "5", "MAX", "1", "2", "MAX", "*"}));
        assertEquals(-750, rpnCalculator.solve(new String[]{"6", "-132", "8", "MIN", "7", "+", "*"}));
        assertEquals(17, rpnCalculator.solve(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "MAX"}));
    }
}
