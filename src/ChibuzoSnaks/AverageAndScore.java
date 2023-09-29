package ChibuzoSnaks;

import java.util.Scanner;

public class AverageAndScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0; int average =0; int totalNumber =0;
        for (int count = 1; count<=10; count+=1){
            System.out.print("Enter score: ");
            number = scanner.nextInt();
            totalNumber = totalNumber+ number;
            average = totalNumber/ count;
        }
        System.out.println("The sum is " + totalNumber + " \n" +"The average score is: " + average);
    }
}
