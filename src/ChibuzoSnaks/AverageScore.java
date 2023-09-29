package ChibuzoSnaks;

import java.util.Scanner;

public class AverageScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0; int average =0; int totalNumber =0;
        int count = 1;
        for (; count<=10; count+=1){
            System.out.print("Enter score: ");
            number = scanner.nextInt();
            totalNumber = totalNumber+ number;
        }
        average = totalNumber/ count;
        System.out.println("The average score is: " + average);
    }
}
