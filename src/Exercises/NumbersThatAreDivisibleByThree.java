package Exercises;

import java.util.Scanner;

public class NumbersThatAreDivisibleByThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int divisor = 0;
        for (int i = 0; i < 10; i++) {
            System.out.printf("Enter number %d : ", i);
            int number = input.nextInt();
            if (number % 3 == 0) divisor += number;
            System.out.println(" The total of the numbers divisible by 3 is: " + divisor);
        }
    }
}