package ClassWithMyOga;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = input.nextInt();
        int factorail = 1;
        for (int counter = number ; counter > 0; counter-- ){
            factorail = factorail * counter;

        }
        System.out.println("The factorial of " + number + " is : " + factorail);




    }

    }
