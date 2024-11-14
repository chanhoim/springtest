package com.example.calculator.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorServiceTest {

    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    public void sum() {
        assertEquals(5, calculatorService.sum(2, 3));
    }

    @Test
    public void sub() {
        assertEquals(-3, calculatorService.sub(3, 6));
    }

    @Test
    public void mul() {
        assertEquals(10, calculatorService.mul(2, 5));
    }

    @Test
    public void div() {
        assertEquals(6, calculatorService.div(12, 2));
    }
}