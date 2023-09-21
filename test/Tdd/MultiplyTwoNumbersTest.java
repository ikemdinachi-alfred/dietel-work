package Tdd;

import junit.framework.TestCase;
import org.junit.Test;
import selfPractice.MultiplyTwoNumbers;

public class MultiplyTwoNumbersTest extends TestCase {
    @Test
    public void testThatCalculatorCanMultiplyTwoValues(){
        MultiplyTwoNumbers multiplyingCalculator = new MultiplyTwoNumbers();
        int result = multiplyingCalculator.multiply(-5,-6);
        assertEquals(30,result);


    }

}