package selfPractice;

public class SumDigit {
    public static int sumDigits(int number){
        int firstNumber = 0; int sum = 0;
        int secondNumber =0; int thirdNumber =0; int result =0;

        for (int count =1; count<=1; count++){
            firstNumber = number % 10;
             sum = number /10;
            secondNumber = sum% 10;
            thirdNumber = number/100;
        }
        result = firstNumber + secondNumber +thirdNumber;
        return result;
    }
}
