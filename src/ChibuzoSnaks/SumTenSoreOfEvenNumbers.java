package ChibuzoSnaks;

import java.util.Scanner;

public class SumTenSoreOfEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int sum = 0;
        int score = 0;
        while (count < 10) {
            System.out.print("Enter Score: ");
            score = scanner.nextInt();
            if (score % 2 == 0)
                sum = sum + score;
            count++;
        }
        System.out.println("The sum of the even numbers of the score is : "+ sum);
    }
}