package Exercises;

import java.util.Scanner;

public class Numbering {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number: ");
        double number = Double.parseDouble(input.nextLine());

        double absolutNumber = Abs.absoluteNumber(number);
        System.out.println(absolutNumber);

    }
}
