package Chapter4;

import java.util.Scanner;

public class PositiveNegativeAndZero {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number and stop by pressing 0 ");
        int userInput = input.nextInt();
        int positive = 0;
        int negative = 0;
        int zero = 0;

        while (userInput !=0) {
            System.out.println("Enter a number and stop by pressing 0 ");
            userInput = input.nextInt();
            if (userInput > 0) {
                positive++;
            }
            if (userInput < 0) {
                negative++;
            }
            if (userInput == 0) {
                zero++;
            }
        }
        System.out.println(" positive Numbers = " + positive);
        System.out.println(" Negative Numbers = " + negative);
        System.out.println(" Zero = "+ zero);


    }
}

