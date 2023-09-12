package Chapter4;

import java.util.Scanner;

public class FactorCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();


        int factor=0;

        for( int count=1; count<=number; count++){
            if (number% count==0) factor= factor+1;
        }
        System.out.println(factor);

    }
}
