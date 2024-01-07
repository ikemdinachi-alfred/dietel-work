package chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssistedInstruction {
    public static String questioniare() {
        Scanner input = new Scanner(System.in);
        SecureRandom secureRandom = new SecureRandom();
        int number1 = secureRandom.nextInt(1, 6);
        int number2 = secureRandom.nextInt(6, 12);

        System.out.println("How much is " + number1 + " times " + number2 + " ? : ");
        int answer = input.nextInt();
        int question = number1 * number2;
        ifs(answer,question);
        return repeatQuestion();
    }

    private static void elseif(int answer) {
        System.out.println("No please try again " + "The correct answer is : " + answer );
        System.out.println(repeatQuestion());
    }
    private static  void ifs(int answer1, int question1){
        if (answer1 == question1){ System.out.println("Very good ! ");}
        else {elseif(question1);}

    }

    public static String repeatQuestion(){
        Scanner input = new Scanner(System.in);
        System.out.println("do you want to continue ? press 1 or 2 to stop");
        int yes = input.nextInt();
        switch (yes){
            case 1:
                System.out.println(questioniare()); break;
            case 2:
                System.out.println("Thank you for playing the Game: "); break;
            default:
                System.out.println("Wrong input " + repeatQuestion()); break;
        }
        return stop();
    }
    private static String stop(){
        System.out.println();
        return " ";
    }

    public static void main(String[] args) {
        questioniare();
    }

}
