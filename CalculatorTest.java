package CalculatorJUnit;

import org.junit.Test;

import Calculator.Calculator;

import static org.junit.Assert.fail;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void testSumCorrect() {
        int x1 = 2, y2 = 3, expected = 5;
        int result = calculator.sum(x1, y2);
        System.out.println("The sum of " + x1 + " + " + y2 + " = " + result + " | and the sum is " + expected + " and is correct ");
        System.out.println("---------------------------------------------");
        if (result != expected) {
            fail("The sum method failed with the data " + x1 + " and " + y2);
        }
    }
    @Test
    public void testSumError() {
        int x1 = 2, y2 = 3, expected = 7;
        int result = calculator.sum(x1, y2);
        System.out.println("The sum of " + x1 + " + " + y2 + " = " + result + " | and the sum is " + expected + " and is incorrect ");
        System.out.println("---------------------------------------------");
        if (result != expected) {
            fail("The sum method failed with the data " + x1 + " and " + y2);
        }
    }

    @Test
    public void testDifferenceCorrect() {
        int x1 = 3, y2 = 2, expected = 1;
        int result = calculator.difference(x1, y2);
        System.out.println("The difference of " + x1 + " - " + y2 + " = " + result + " | and the difference is " + expected + " and is correct ");
        System.out.println("---------------------------------------------");
        if (result != expected) {
            fail("The diff method failed with the data " + x1 + " y " + y2);
        }
    }
    @Test
    public void testDifferenceError() {
        int x1 = 3, y2 = 2, expected = 5;
        int result = calculator.difference(x1, y2);
        System.out.println("The difference of " + x1 + " - " + y2 + " = " + result + " | and the difference is " + expected + " and is incorrect ");
        System.out.println("---------------------------------------------");
        if (result != expected) {
            fail("The diff method failed with the data  " + x1 + " y " + y2);
        }
    }
}
