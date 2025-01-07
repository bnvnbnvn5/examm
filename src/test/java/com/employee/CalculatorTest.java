package com.employee;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        assertEquals(4, calculator.add(2, 2));
        assertEquals(0, calculator.add(-2, 2));
        assertEquals(-4, calculator.add(-2, -2));
    }

    @Test
    public void testSubtract() {
        assertEquals(0, calculator.subtract(2, 2));
        assertEquals(-4, calculator.subtract(2, 6));
        assertEquals(4, calculator.subtract(6, 2));
    }

    @Test
    public void testMultiply() {
        assertEquals(4, calculator.multiply(2, 2));
        assertEquals(-4, calculator.multiply(2, -2));
        assertEquals(0, calculator.multiply(0, 5));
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, calculator.divide(4, 2), 0.0001);
        assertEquals(0.5, calculator.divide(1, 2), 0.0001);
        assertEquals(-2.0, calculator.divide(-4, 2), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        calculator.divide(4, 0);
    }
}
