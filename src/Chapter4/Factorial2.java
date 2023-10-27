package Chapter4;

import java.util.Scanner;

public class Factorial2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number= input.nextInt();
        double sum=1;
        double product= 1;
        for (int count=0; count<=number;count+=1){
            sum = 1 * (1.0/count);
            product= 1+1+sum;

            System.out.println(product);
        }

    }
}
