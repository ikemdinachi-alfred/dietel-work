package selfPractice;

import junit.framework.TestCase;
import org.junit.Test;

public class SumDigitTest extends TestCase {
@Test
public void testThatThreeNumberAreEqualToSum() {

    int result =   SumDigit.sumDigits(111);
assertEquals(3,result);
    }
}