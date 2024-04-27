package Chapter4;

import java.util.Scanner;

public class IsSquare {
    public static boolean isSquare(int number){
        boolean result = false;
        for (int i = 0; i < number; i++) {
            int check = i * i;
            if (check == number){
                result = true;
            }
            if (result ==true) break;

        }
        return result;
    }
    public static boolean isPrimeNumber (int number){
        if (number <= 2)
            return false;
        for (int count = 2; count < number; count++)
            if (number % count == 0){
                return false;}
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        if (isPrimeNumber(number)){ System.out.println(STR."\{number} is a prime ");}
        else {System.out.println(STR."\{number} is not a prime");}
    }
}
