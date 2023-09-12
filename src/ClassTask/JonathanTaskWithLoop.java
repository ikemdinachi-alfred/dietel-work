package ClassTask;

import java.util.Scanner;

public class JonathanTaskWithLoop {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Enter the day of the week between 0-6");
        int month = input.nextInt();
        while (month >6) {
            System.out.println("Enter the day of the week between 0-6");
            month = input.nextInt();
        }
        switch(month){
        case 0 -> System.out.println("Sunday");
        case 1 -> System.out.println("Monday");
        case 2 -> System.out.println("Tuesday");
        case 3 -> System.out.println("Wednesday");
        case 4 -> System.out.println("Thursday");
        case 5 -> System.out.println("Friday");
        case 6 -> System.out.println("Saturday");
            default -> System.out.println("invalid");
    }
}

}