package selfPractice;

import java.util.Scanner;
public class MinimumAndMaximum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number= input.nextInt();

        int maximum=0;
        int minimum=number;
        for (int counter=0; counter<4; counter++){
            System.out.print("Enter a number: ");
            number=input.nextInt();
            if (number>maximum){
                maximum=number;
            }
            if (number<minimum){
                minimum=number;
            }
        }
        System.out.println(" The largest number is: " + maximum);
        System.out.println("The  lowest is: " + minimum);

    }
}