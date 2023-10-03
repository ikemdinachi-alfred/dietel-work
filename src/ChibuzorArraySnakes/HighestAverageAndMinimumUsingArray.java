package ChibuzorArraySnakes;

import java.util.Scanner;

public class HighestAverageAndMinimumUsingArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         int[] scores = new int[10];
         int count = 0;
         int total = 0;
         double average = 0;
         int  minimum = 0;
         int maximum = 0;

        for ( ; count< scores.length; count++){
             System.out.print(" Enter  Score " + (count+1)+ " :  " );
              scores[count] = scanner.nextInt();
         }
         for (count = 0 ; count< scores.length; count++){
             minimum =  scores[count];
             total =total + scores[count];
             average = (double) total/scores.length;
             if (scores[count] < minimum)  minimum = scores[count];
             if (scores[count] > maximum)  maximum = scores[count] ;

        }
        System.out.println("The total total score is : " + total);
        System.out.println("the average of the score is: " + average);
        System.out.println("The minimum of the score is: "+ minimum);
        System.out.println("The maximum of the score is: "+ maximum);
    }
}