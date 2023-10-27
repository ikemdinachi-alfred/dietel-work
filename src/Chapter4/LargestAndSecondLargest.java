package Chapter4;

import java.util.Scanner;

public class LargestAndSecondLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int largest = 0;
        int secondLargest = 0;


        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            int num = input.nextInt();
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest) {
                secondLargest = num;
            }
        }
        System.out.println("largest is :" + largest);
        System.out.println("Second largest is :" + secondLargest);
    }
}
