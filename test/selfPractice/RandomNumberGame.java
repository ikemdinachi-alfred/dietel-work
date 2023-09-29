package selfPractice;

import java.util.Scanner;
public class RandomNumberGame {
    public static void main(String[] args) {
        guessingNumberGame();
    }

    public static void guessingNumberGame() {
        Scanner input = new Scanner(System.in);
        int number = (int) (1 + (10 * Math.random()));
        int numberOfTrial = 9;
        int count =number, guess =0;
        System.out.println("Choose a number between 1 - 10, in 9 trial");

        while (number!=guess){
            count++;
            System.out.print("Guess the number:   ");
            guess = input.nextInt();
            if (number == guess) {
                System.out.println("Congratulations!  you guessed correctly " + " The guess number is:  " + number);
            }

        }
    }
}
