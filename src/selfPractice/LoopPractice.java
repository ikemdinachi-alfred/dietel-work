package selfPractice;
//
//import java.util.Scanner;
//
public class LoopPractice {
   public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int number= input.nextInt();
//        int factoria=1;
//        int count=number;
//
//        while (count>=1){
//            factoria=factoria*count;
//            count-=1;
//        }
//        System.out.print("The factorial of: " + number + " is = " +factoria);
//


       int x = -2;
       int total = 0;

       while (x <= 10) {
           int y = x + 2;
           x++;
           total += y;
           System.out.printf("Y is: %d and total is %d\n", y, total);

       }

   }
}
