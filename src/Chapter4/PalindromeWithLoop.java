package Chapter4;

import java.util.Scanner;

public class PalindromeWithLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = in.nextInt();
        int num1 = num;
        int m = 0;
        while (num > 0) {
            m = m * 10 + num % 10;
            num = num / 10;
        }
        if (num1 == m) {
            System.out.println(" the number is a palindrome");
        } else
            System.out.println(" the number is not a palindrome");


    }

}
