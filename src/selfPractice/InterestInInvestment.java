package selfPractice;

public class InterestInInvestment {

    public static double interestAfterTenYear (double investmentAmount){
        double result = 0.0;
        if (investmentAmount <= 0) return 0.0;
        for (int count = 1; count <=10; count++) {
            result = investmentAmount * Math.pow(1 + 0.05,count);
            result =Math.round(result);
          //  System.out.println(result);
        }
        return result;
    }

}