package chapter6;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0, counter = 0; int random , guess;
        Random randomNumbers = new Random();
        random = 1 + randomNumbers.nextInt(20);
        while (number!=2) {
            counter++;
            System.out.println("Guess number between 1 - 20: ");
            guess = input.nextInt();
            if (guess < random) System.out.println("guessed number is low ");
            if (guess > random) System.out.println("guessed number is high");
            if (guess == random) {
                random = 1 + randomNumbers.nextInt(20);
                System.out.println("Congratulation! you win ");
                if (counter <10) System.out.println("Either you know the secret or you got Lucky");
                if (counter ==10) System.out.println("Aha you know the secret!");
                if (counter > 10) System.out.println("you should be able to do better! Why should it take more than 10 guess ");
                System.out.println(" Enter 1 to play again or 2 to stop");
                number = input.nextInt();
                counter = 0;
            }

        }
    }
}
