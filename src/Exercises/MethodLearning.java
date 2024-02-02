package Exercises;

import java.util.Scanner;

public class MethodLearning {


    public static int inputOfTypeInt(String statement){
        int result;
        Scanner input = new Scanner(System.in);
        System.out.print(statement);
        result = input.nextInt();
        return result;
    }
    public static int maximumOfThree(){
        int number1 = inputOfTypeInt("Enter first Number: ");
        int number2 = inputOfTypeInt("Enter second Number: ");
        int number3 = inputOfTypeInt("Enter third Number: ");
        return maximum(number1,number2,number3);
    }


    public static int maximum(int number1, int  number2, int number3){
        int maximum = 0;
        if (number1 > number2 && number2 > number3){
            maximum = number1;
        }
        if (number2 > number1 && number2 > number3){
            maximum = number2;
        }
        if (number3 > number2 && number3 > number1){
            maximum = number3;
        }
      return maximum;
    }


    public static void main(String[] args) {
        System.out.println("The maximum is: "+ maximumOfThree());
    }
}
