package Exercises;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegerCounterTest {
    @Test
    public void TestTheCountOfIntegers() {

       int result = IntegerCounter.returnInteger(new String[]{"Cohort18", "are in 19 class200"});
        assertEquals(result,7 );
    }
}
