package Chapter4;

import java.util.Scanner;

public class TwelveMonthsOfTheYear {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

    System.out.println("Enter number between 1-12 to select month of The year");
    int number = input.nextInt();
    switch (number) {
        case 1 -> System.out.println(" month is January");
        case 2 -> System.out.println("Month is February");
        case 3 -> System.out.println("Month is March");
        case 4 -> System.out.println("Month is April");
        case 5 -> System.out.println("Month is May");
        case 6 -> System.out.println("Month is June");
        case 7 -> System.out.println("Month is July");
        case 8 -> System.out.println("Month is August");
        case 9 -> System.out.println("Month is September");
        case 10 -> System.out.println("Month is October");
        case 11 -> System.out.println("Month is November");
        case 12 -> System.out.println("Month is December");
        default -> System.out.println("wrong input try again later ");
    }
}

    }

