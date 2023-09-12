package Chapter2;

import java.util.Scanner;

public interface EvenOdd {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter A number: ");
        int number= input.nextInt();

        if (number%2==0){
            System.out.printf( number + " is an even number");

        }else {
            System.out.print(number + " is an odd number");
        }

        }
    }

