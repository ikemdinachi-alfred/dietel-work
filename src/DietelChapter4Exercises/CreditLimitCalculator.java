package DietelChapter4Exercises;

public class CreditLimitCalculator {
    public static void main(String[] args) {
      int result =  creditLimitCalculator("2371222526",90_000,20_000,50_000);
        System.out.println(result);
    }



    public static int creditLimitCalculator(String accountNumber, int balanceAtMonthBeginning, int totalOfAllCreditAppliedToCustomerAccount, int allowedCreditlimit){
        int newBalance;
      newBalance = balanceAtMonthBeginning + totalOfAllCreditAppliedToCustomerAccount - allowedCreditlimit;
if (newBalance ==0 || newBalance < 0)
    System.out.println("Credit limit exceeded");
 return newBalance;
    }




}
