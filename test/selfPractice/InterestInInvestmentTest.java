package selfPractice;

import junit.framework.TestCase;

public class InterestInInvestmentTest extends TestCase {

    public void testInterest() {
        double result = InterestInInvestment.interestAfterTenYear(1000);
        assertEquals(1629.0,result);
    }
    public void testThatWhenTheUserAmountIsNegativeItReTurnZero(){
        double interest = InterestInInvestment.interestAfterTenYear(-12000);
        assertEquals(0.0,interest);
    }
}
