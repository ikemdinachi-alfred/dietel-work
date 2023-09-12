package Chapter4;

import java.util.Scanner;

public class DaysOfTheWeek {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println(" Enter number of the day from 0-6 today");
        int userInput= input.nextInt();
        switch (userInput) {
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
        int userInput1= input.nextInt();
        if (userInput==0 && userInput1==0) System.out.println("Future Day is Sunday");
        if (userInput==0 && userInput1==1) System.out.println("Future Day is Monday");
        if (userInput==0 && userInput1==2) System.out.println("Future Day is Tuesday");
        if (userInput==0 && userInput1==3) System.out.println("Future Day is Wednesday");
        if (userInput==0 && userInput1==4) System.out.println("Future Day is Thursday");
        if (userInput==0 && userInput1==5) System.out.println("Future Day is Friday");
        if (userInput==0 && userInput1==6) System.out.println("Future Day is Saturday");

        if (userInput==1 && userInput1==1) System.out.println("Future Day is Tuesday");
        if (userInput==1 && userInput1==2) System.out.println("Future Day is Wednesday");
        if (userInput==1 && userInput1==3) System.out.println("Future Day is Thursday");
        if (userInput==1 && userInput1==4) System.out.println("Future Day is Friday");
        if (userInput==1 && userInput1==5) System.out.println("Future Day is Saturday");
        if (userInput==1 && userInput1==6) System.out.println("Future Day is Sunday");

        if (userInput==2 && userInput1==1) System.out.println("Future Day is Wednesday");
        if (userInput==2 && userInput1==2) System.out.println("Future Day is Thursday");
        if (userInput==2 && userInput1==3) System.out.println("Future Day is Friday");
        if (userInput==2 && userInput1==4) System.out.println("Future Day is Saturday");
        if (userInput==2 && userInput1==5) System.out.println("Future Day is Sunday");
        if (userInput==2 && userInput1==6) System.out.println("Future Day is Monday");

        if (userInput==3 && userInput1==1) System.out.println("Future Day is Thursday");
        if (userInput==3 && userInput1==2) System.out.println("Future Day is Friday");
        if (userInput==3 && userInput1==3) System.out.println("Future Day is Saturday");
        if (userInput==3 && userInput1==4) System.out.println("Future Day is Sunday");
        if (userInput==3 && userInput1==5) System.out.println("Future Day is Monday");
        if (userInput==3 && userInput1==6) System.out.println("Future Day is Tuesday");

        if (userInput==4 && userInput1==1) System.out.println("Future Day is Friday");
        if (userInput==4 && userInput1==2) System.out.println("Future Day is Saturday");
        if (userInput==4 && userInput1==3) System.out.println("Future Day is Sunday");
        if (userInput==4 && userInput1==4) System.out.println("Future Day is Monday");
        if (userInput==4 && userInput1==5) System.out.println("Future Day is Tuesday");
        if (userInput==4 && userInput1==6) System.out.println(" Future Day is Wednesday");

        if (userInput==5 && userInput1==1) System.out.println("Future Day is Saturday");
        if (userInput==5 && userInput1==2) System.out.println("Future Day is Sunday");
        if (userInput==5 && userInput1==3) System.out.println("Future Day is Monday");
        if (userInput==5 && userInput1==4) System.out.println("Future Day is Tuesday");
        if (userInput==5 && userInput1==5) System.out.println(" Future Day is Wednesday");
        if (userInput==5 && userInput1==6) System.out.println(" Future Day is Thursday");

        if (userInput==6 && userInput1==1) System.out.println("Future Day is Sunday");
        if (userInput==6 && userInput1==2) System.out.println("Future Day is Monday");
        if (userInput==6 && userInput1==3) System.out.println("Future Day is Tuesday");
        if (userInput==6 && userInput1==4) System.out.println(" Future Day is Wednesday");
        if (userInput==6 && userInput1==5) System.out.println(" Future Day is Thursday");
        if (userInput==6 && userInput1==6) System.out.println(" Future Day is Friday");



    }
}
