package ChibuzoSnaks;

import java.util.Scanner;

public class AverageOfEvenTenScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int sum = 0;
        int number = 0;
        while (count <= 10) {
            System.out.print("Enter Score between 1 - 100: ");
            number = scanner.nextInt();
            if (number >0 && number <=100){
                count++;
            sum = sum + number;
        }
    }
        System.out.println("The sum of the even numbers of the score is : "+ sum);
    }
}
