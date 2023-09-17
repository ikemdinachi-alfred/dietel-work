package Chapter4;

import java.util.Scanner;

public class Comparator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter first Number: ");
        int number1= input.nextInt();
        System.out.print(" Enter second Number: ");
        int number2= input.nextInt();

        if (number1==number2){
            System.out.println(number1+ " = "+ number2+ " Answer = " +"0");
        } else if (number1>number2) {
            System.out.println(number1+ " > "+ number2+ " Answer = " + "1");
        } else if (number2 > number1) {
            System.out.println(number2+ " > "+ number1+ " Answer = "+ "-1");

        }

    }
        }


