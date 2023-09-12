package Exercises;

import java.util.Scanner;

public class studentExam {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println(" Answer the following maths Questions");

        System.out.println(" Q1. 100 - 75 = : ");
        int number= input.nextInt(); if (number==25) System.out.println("Correct");
        if (number!=25) System.out.println("incorrect Answer");
        System.out.println(" Q2. what is the square root of 5? = : ");
        int number1= input.nextInt();if (number1==25) System.out.println("Correct");
        if (number1!=25) System.out.println("incorrect Answer");

        System.out.println("well done, Thanks for your Time ");
    }
}