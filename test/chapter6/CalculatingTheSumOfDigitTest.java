package chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatingTheSumOfDigitTest {
@Test
    public void TestThatAllIntegerCanAdd(){
    int actual = CalculatingTheSumOfDigit.sumNumbers(5726);
    assertEquals(20,actual);
}
}