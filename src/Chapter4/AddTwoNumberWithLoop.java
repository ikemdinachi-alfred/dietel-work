package Chapter4;

import java.util.Scanner;

public class AddTwoNumberWithLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        do {
            System.out.print("Enter first Numbers: ");
            int number1 = input.nextInt();
            System.out.print("Enter second Number: ");
            int number2 = input.nextInt();
            int sum = number1 + number2;
            System.out.println("The sum of " + number1 + " and " + number2 + " is :" + sum);
            System.out.println("Do you wish to perform another action press 1");
            number = input.nextInt();
        } while (number==1);



    }
}
