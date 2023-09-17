package Tdd;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BackToSenderLogisticServicesTest {
    @Test
    public void testForLogisticAllowancePay(){
         BackToSenderLogisticServicesPay incentive = new BackToSenderLogisticServicesPay();
      int  result = incentive.ridersPayment(80);
        assertEquals(45000,result);

    }
}
