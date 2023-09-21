package selfPractice;

public class MultiplyTwoNumbers {

    public  int multiply(int firstNumber, int secondNumber) {
        int answer = 0;
        int counter;
        int multiplier;
        if (firstNumber < 0) {
            counter = secondNumber;
            multiplier = firstNumber;
        } else {
            counter = firstNumber;
            multiplier = secondNumber;
        }
        if (secondNumber < 0) {
            counter = firstNumber;
            multiplier = secondNumber;
        }
        if (firstNumber < 0 && secondNumber < 0){
            counter =0; multiplier =0;
            for (int count = 0; count > firstNumber; count--) {
               counter+=1;
            }

            for (int i = 0; i > secondNumber ; i--) {
                multiplier++;
            }
        }

        for (int i = 0; i < counter; i++) {
            answer+=multiplier;
        }

            return answer;


    }
}