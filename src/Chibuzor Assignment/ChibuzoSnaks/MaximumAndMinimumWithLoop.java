package ChibuzoSnaks;

import java.util.Scanner;

public class MaximumAndMinimumWithLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1 Score: ");
        int userInput = scanner.nextInt();

        int total = userInput; double average = userInput;
        int minimum = userInput ;int count = 1;int maximum = 0 ;

        for (; count<= 9; count+=1){
            System.out.print("Enter " + (count + 1 )+ " score :  ");
            userInput =scanner.nextInt();
            if (userInput > maximum){
                maximum = userInput;
            }
            if (userInput < minimum){
                minimum = userInput;
            }
            total = total + userInput;
            average = (double)total / count;
        }
        System.out.println("Total = " + total);
        System.out.println(" The average is :"+ average);
        System.out.println(" The minimum score is : " +  minimum);
        System.out.println("The maximum score is : " + maximum);
    }
}
