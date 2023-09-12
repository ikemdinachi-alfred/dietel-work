package Chapter4;

import java.util.Scanner;

public class FutureDayWithLoop {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println(" Enter number of the day from 0-6 today");
        int today= input.nextInt();

        switch (today) {
            case 0 -> System.out.println(" Today is Sunday");
            case 1 -> System.out.println("Today is Monday");
            case 2 -> System.out.println("Today is Tuesday");
            case 3 -> System.out.println("Today is Wednesday");
            case 4 -> System.out.println("Today is Thursday");
            case 5 -> System.out.println("Today is Friday");
            case 6 -> System.out.println("Today is Saturday");
            default -> System.out.println("Wrong input, try again");
        }
        System.out.println(" Enter  Future day: ");
        int week= input.nextInt();
    }
}
