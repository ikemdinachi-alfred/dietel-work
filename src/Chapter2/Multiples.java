package Chapter2;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:  ");
        int number = scanner.nextInt();
        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();
        int triple = number * 3;
        int doubled = number2 * 2;
        if ( doubled % triple == 0)
            System.out.println("The triple of the first number is a factor of the doubled second number" + triple);
        else  System.out.println("The triple of the first number is not a factor of the doubled second number" + doubled);
    }
}
