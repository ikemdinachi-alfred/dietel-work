package ClassTask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AfternoonDrilTest {
    @Test
    public void testSimpleInput() {
        int[] num = {4,5,8,8,8,82,9,81};
        boolean [] expected = {false,true,false,false,false,false,true,true};
        boolean [] result= AfternoonDril.evenAndOdd(num);
        assertArrayEquals(result, expected);



    }

}