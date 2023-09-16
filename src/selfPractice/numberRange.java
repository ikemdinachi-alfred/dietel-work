package selfPractice;

import java.util.Scanner;

public class numberRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter A Number: ");
        int number = input.nextInt();

        if (number>=1 && number<30)
            System.out.print(" Low level");
        else if (number<50) {
            System.out.print("Average");
        } else if (number<80) {
            System.out.print("High");
        } else if ( number<=100) {
            System.out.print("A- Level");
        }else {
            System.out.println("Out of range");
        }


    }
}