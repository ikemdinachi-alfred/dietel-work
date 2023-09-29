package selfPractice;
public class MathClass {
    public static void main(String[] args) {
        int result = maximumValue(6547866,98765,126);
        System.out.println( " MaximumValue is " + result);
    }

    public static int maximumValue(int firstNumber, int secondNumber, int thirdNumber) {
        int maximumNumber = firstNumber;
        if (secondNumber > firstNumber) {
            maximumNumber = secondNumber;
        }
        if (thirdNumber > firstNumber) {
            maximumNumber = thirdNumber;

        }
         return maximumNumber;
        // the Maths class can be imported to do same calculation as a build in function
       // return Math.max(firstNumber,Math.max(secondNumber,thirdNumber));
    }



}