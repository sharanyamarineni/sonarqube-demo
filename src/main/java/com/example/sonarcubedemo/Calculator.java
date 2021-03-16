package com.example.sonarcubedemo;

import java.util.Arrays;

public class Calculator {
//int a,b;
    float applyOperator(String op, float num1, float num2) {
        switch (op) {
            case "/":
                if(num1 == 0) {
                    throw new ArithmeticException("Can't divide by zero");
                }
                return  (float) Math.round(num2 / num1);
            case "+":
                return num2 + num1;
            case "-":
                return num2 - num1;
            case "*":
                return num2 * num1;
            case "MIN":
                return Math.min(num2, num1);
            case "MAX":
                return Math.max(num2, num1);
            default:
                return 0;
        }
    }

    boolean isOperator(String op) {
        return Arrays.asList("+", "-", "*", "/", "MIN", "MAX").contains(op);
    }
}