package selfPractice;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplyTwoNumbersTest {
    @Test
    public void testThatCalculatorCanMultiplyTwoNumbersWithoutTheMultiplicationSign(){
        MultiplyTwoNumbers multiply = new MultiplyTwoNumbers();
        int result = multiply.multiply(5,5);
        assertEquals(25,result);
    }

}
