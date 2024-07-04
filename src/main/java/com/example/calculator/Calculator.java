package com.example.calculator;

import org.springframework.stereotype.Service;
import java.util.logging.Logger;

@Service
public class Calculator {

    private static final Logger logger = Logger.getLogger(Calculator.class.getName());

    public int add(int a, int b) {
        int result = a + b;
        logger.info("Addition: " + a + " + " + b + " = " + result);
        return result;
    }

    public int subtract(int a, int b) {
        int result = a - b;
        logger.info("Subtraction: " + a + " - " + b + " = " + result);
        return result;
    }

    public int multiply(int a, int b) {
        int result = a * b;
        logger.info("Multiplication: " + a + " * " + b + " = " + result);
        return result;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        int result = a / b;
        logger.info("Division: " + a + " / " + b + " = " + result);
        return result;
    }
}
