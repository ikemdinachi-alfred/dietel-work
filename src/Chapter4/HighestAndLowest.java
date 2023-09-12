package Chapter4;

import java.util.Scanner;

public class HighestAndLowest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("continue to enter a number and stop by pressing 00");
        int number = input.nextInt();
        int maximumNumber = 0, minimumNumber = 0, count;
        maximumNumber = number;
        minimumNumber = number;

        for (count = 0; number != 00; count++) {
            System.out.println("continue to enter a number and stop by pressing 00");
            number = input.nextInt();
            if (number > maximumNumber && number != 00) {
                maximumNumber = number;
            }
            if (number < minimumNumber && number != 00) {
                minimumNumber = number;

            }

            System.out.println(" Minimum number is: " + minimumNumber);
            System.out.println(" Maximum number is: " + maximumNumber);
        }

    }

}