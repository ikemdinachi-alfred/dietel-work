package Chapter4;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number =  input.nextInt();

        if (isPalindrome(number)){
            System.out.println("is palindrome");
        }
        else System.out.println("is not palindrome");


    }

    public static boolean isPalindrome(int number){
        int originalNumber = number;
        int reverseNumber = 0;

        while (number!=0){
            int digit = number% 10;
            reverseNumber = reverseNumber * 10 + digit;
            number /= 10;
        }
        return originalNumber==reverseNumber;
    }
}
