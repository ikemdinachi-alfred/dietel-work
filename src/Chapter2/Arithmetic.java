package Chapter2;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:  ");
        int number = scanner.nextInt();
        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();

        int numberSquare = number * number;
        int number2Square = number2 * number2;
        int sumOfSquare = numberSquare + number2Square;
        int differentOfSquare = numberSquare - number2Square;

        System.out.println("The square of first number is: " + numberSquare + "\n The square of second number is: " + number2Square);
        System.out.println("The sum of squared first and second number is: " + sumOfSquare + "\n The difference of squared first and second number is: "+ differentOfSquare);

    }
}
