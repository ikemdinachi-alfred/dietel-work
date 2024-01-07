package Tdd;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BackToSenderLogisticServicesTest {
    public void checkRiderspayment() {
        BackToSenderLogisticServicesPay dispatchpayment = new BackToSenderLogisticServicesPay();
        int result = dispatchpayment.ridersPayment(80);
        assertEquals(45000, result);

    }
}
