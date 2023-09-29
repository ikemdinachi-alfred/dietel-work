package ChibuzoSnaks;

import java.util.Scanner;
public class TenScores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0; int totalSum =0;
        for (int count = 1; count<=10; count+=1){
            System.out.print("Enter score: ");
            number = input.nextInt();
            totalSum = totalSum + number;
        }
        System.out.println("The total score is: " + totalSum);
    }
}
