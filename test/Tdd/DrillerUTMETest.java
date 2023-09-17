package Tdd;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class DrillerUTMETest {
    @Test
    public void testDiscountOfPaperByQuantity(){
        DrillerUTME discount = new DrillerUTME();
        int result = discount.paperCopies(700);
        assertEquals(1000,result);

    }
}
