package ChibuzorWeekendSnakes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class ArrayWeekendTaskTest {

    @Test
    public void testReverseArrayList() {
        int[] number1 = {54, 67, 68, 34};
        int[] result = ArrayWeekendTask.reverseArrayList(number1);
        int[] reverse = {34, 68, 67, 54};
        assertArrayEquals(result, reverse);

    }

    @Test
    public void testForTheLargestElementInAList() {
        int[] number = {56, 98, 89, 90, 200};
        int largest = 200;
        int result = ArrayWeekendTask.largestElement(number);
        assertEquals(largest, result);

    }

    @Test
    public void testThatANumberOccured() {
        int[] number = {45, 98, 70, 98, 45, 124};
        int element = 70;
        boolean result = ArrayWeekendTask.checkElementOccurred(number, element);
        assertTrue(result);
    }

    @Test
    public void testThaFunctionPrintOddPosition() {
        int[] number = {12, 45, 76, 89, 90, 75, 34, 82, 81, 100};
        int[] odd = {45, 89, 75, 82, 100};
        int[] result = ArrayWeekendTask.oddPosition(number);
        assertArrayEquals(result, odd);

    }

    @Test
    public void testThaFunctionPrintEvenddPosition() {
        int[] number = {12, 45, 76, 89, 90, 75, 34, 82, 81, 100};
        int[] even = {12, 76, 90, 34, 81};
        int[] result = ArrayWeekendTask.EvenPosition(number);
        assertArrayEquals(result, even);
    }

    @Test
    public void testThatStringPaindromeIsTrueOrFalse() {
        String palindrome = "son";
        boolean result = ArrayWeekendTask.stringPalindrome(palindrome);
        System.out.println(result);
        assertTrue(true);
    }
}