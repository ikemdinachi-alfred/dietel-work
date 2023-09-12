package Chapter4;

import java.util.Scanner;

public class ItelPhone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("""
                     itel phone
                1-> menu   2-> Extras
                3-> chart   4-> contact
                """);
        int userInput = input.nextInt();
        switch (userInput) {
            case 1:
                System.out.println("Welcome to Menu");
                System.out.println("""
                        1-> setting
                        2-> Fm radio
                        3-> messages""");
        }

    }
}
