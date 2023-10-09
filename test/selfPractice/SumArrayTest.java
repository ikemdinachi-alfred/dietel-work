package selfPractice;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SumArrayTest extends TestCase {
    @Test
    public void testGetSumOfOddPosition() {
        // given that i have an array
        int[] result = {5, 4, 1, 0, 6, 7, 9};
        // when the sum of the odd position is add
        int expected = 11;
        // assert
        int actual = SumArray.getSumOfOddPosition(result);
        assertEquals(expected, actual);
    }
    @Test
    public void testGetSumOfEvenPosition() {
        // given that i have an array
        int[] result = {5, 4, 1, 0, 6, 7, 9};
        // when the sum of the odd position is add
        int expected = 21;
        // assert
        int actual = SumArray.getSumOfEvenPosition(result);
        assertEquals(expected, actual );
    }
    @Test
    public void testGetSumOfOddNumbes() {
        // given that i have an array
        int[] result = {5, 4, 1, 0, 6, 7, 9};
        // when the sum of the odd position is add
        int expected = 22;
        // assert
        int actual = SumArray.getSumOfOddNumbers(result);
        assertEquals(expected, actual );
    }
    @Test
    public void testGetSumOfEvenNumbes() {
        // given that i have an array
        int[] result = {5, 4, 1, 0, 6, 7, 9};
        // when the sum of the odd position is add
        int expected = 10;
        // assert
        int actual = SumArray.getSumOfEvenNumbers(result);
        assertEquals(expected, actual );
    }
}