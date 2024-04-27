package ClassTask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MorningDrillTest {
    @Test
    void testMorningDrill() {
        int [] arr = {4,5,8,9,10};
        int[] result = MorningDrill.doubleArray(arr);
        int[] expected = {4,5,8,9,10,8,10,16,18,20};
        assertArrayEquals(result,expected);

    }

}