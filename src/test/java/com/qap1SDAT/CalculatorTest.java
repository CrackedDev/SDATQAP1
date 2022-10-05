package com.qap1SDAT;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator objCalculator = new Calculator();

    @Test

    public void testAdd() {
        int a = 20;
        int b = 40;
        int expectedResult = 60;
        double result = objCalculator.add(a, b);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testSubtract() {
        int a = 50;
        int b = 40;
        int expectedResult = 10;
        double result = objCalculator.subtract (a, b);
        Assertions.assertEquals(expectedResult,result);
    }

    @Test

    public void testMult() {
        int a = 2;
        int b = 40;
        int expectedResult = 80;
        double result = objCalculator.multiply (a, b);
        Assertions.assertEquals(expectedResult,result);
    }
    @Test

    public void testDiv() {
        int a = 10;
        int b = 5;
        int expectedResult = 2;
        double result = objCalculator.divide(a, b);
        Assertions.assertEquals(expectedResult,result);
    }
}



