package chapter6;


public class CalculatingTheSumOfDigit {
    public static int sumNumbers(int number) {
        int value = 0;
        while (number!=0){
            value  += number %10;
            number = number/ 10;
        }
        return value;
    }
}
