package com.example.sonarcubedemo;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class RPNCalculator extends Calculator {

    public float solve(String[] input) {
        Deque<String> stack = new ArrayDeque<>();
        Arrays.asList(input).forEach(x -> {
            if(isOperator(x)) {
                computeAndPush(stack, x);
            } else stack.push(x);
        });
        return Float.parseFloat(stack.pop());
    }

    private void computeAndPush(Deque<String> stack, String operator) {
        float num1 = Float.parseFloat(stack.pop());
        float num2 = Float.parseFloat(stack.pop());
        float result = applyOperator(operator, num1, num2);
        stack.push(String.valueOf(result));
    }
}
