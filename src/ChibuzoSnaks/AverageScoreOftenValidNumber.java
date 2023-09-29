package ChibuzoSnaks;

import java.util.Scanner;

public class AverageScoreOftenValidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int sum = 0;
        int average = 0;
        int number = 0;
        while (count <= 10) {
            System.out.print("Enter Score between 1 - 100: ");
            number = scanner.nextInt();
            count++;
            if (number >0 && number <=100){
                sum = sum + number;
                average = sum / count;

            }
        }
        System.out.println("The average of the valid score is : "+ average);
    }
}


