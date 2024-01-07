package Tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ArithmeticsTest {
    public void testForEvenNumber() {
        Arithmetics arithmetics = new Arithmetics();
        boolean result = arithmetics.isEven(12);
        assertTrue(result);
    }

    public void testForPrimeNumber() {
        Arithmetics prime = new Arithmetics();
        boolean result = prime.isPrimeNumber(11);
        assertTrue(result);
    }

    public void testForDifferenceOfTwoNumbersToReturnPositiveValue() {
        Arithmetics addition = new Arithmetics();
        int result = addition.subtraction(25, 30);
        assertEquals(5, result);
    }

    public void testForDivision() {
        Arithmetics division = new Arithmetics();
        int result = division.divide(12, 2);
        assertEquals(6, result);
        System.out.println(result);
    }

    public void testForFactors() {
        Arithmetics factor = new Arithmetics();
        int result = factor.facorOf(10);
        assertEquals(4, result);
    }

    public void testForSquare() {
        Arithmetics square = new Arithmetics();
        int result = square.isSquare(5);
        assertEquals(25, result);
    }
    public void testForPalindrome() {
        Arithmetics palindrome = new Arithmetics();
        int result = palindrome.isPalindrome(22123);
        assertTrue(true);
    }
    public void testForFactotrialOf(){
        Arithmetics factorial = new Arithmetics();
        int result= factorial.factorialOf(5);
        assertEquals(120,result);
    }

}

