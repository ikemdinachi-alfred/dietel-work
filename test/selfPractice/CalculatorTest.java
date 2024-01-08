package selfPractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
@Test
    public void testCalculatorFunctionality(){
    Calculator myCalculator = new Calculator();
    int expected = myCalculator.calculate("2*5");
    assertEquals(10,expected);
}
}