package Chapter4;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("CALCULATOR ");

            System.out.println("""
                    Select
                    1-> Addition
                    2-> Subtraction
                    3-> Division
                    4-> Multiplication
                    5-> Square root
                    6-> More Options
                               
                                        """);
            System.out.println("select options: ");
            int number1;
            int number2;

            int userInput = input.nextInt();
            switch (userInput) {
                case 1 -> {
                    System.out.println("Addition");
                    System.out.print("Enter first Number : ");
                    number1 = input.nextInt();
                    System.out.print("Enter Second number: ");
                    number2 = input.nextInt();
                    int result = number1 + number2;
                    System.out.println("Result is: " + result);
                    System.out.println("Do you want to continue press 1");
                    int secondNumber = input.nextInt();
                    switch (secondNumber) {

                        case 1:
                            System.out.println("Welcome back !");
                            break;
                        default:
                            System.out.println("Wrong input");
                            break;

                    }
                }
                case 2 -> {
                    System.out.println("subtraction");
                    System.out.print("Enter first Number : ");
                    number1 = input.nextInt();
                    System.out.print("Enter Second number: ");
                    number2 = input.nextInt();
                    int result1 = number1 - number2;
                    System.out.println("Result is: " + result1);
                    System.out.println("Do you want to continue press 1");
                    int welcome=input.nextInt();
                    switch (welcome) {
                        case 1:
                            System.out.println("Welcome back !!");
                            break;
                        default:
                            System.out.println("Wrong input");
                            break;
                    }

                        }


                case 3 -> {
                    System.out.println("Division");
                    System.out.print("Enter first Number : ");
                    number1 = input.nextInt();
                    System.out.print("Enter Second number: ");
                    number2 = input.nextInt();
                    double result2 = (double) number1 / number2;
                    System.out.printf("result is: %.1f %n", result2);
                    System.out.println("Do you want to continue press 1");
                    int welcome1=input.nextInt();
                    switch (welcome1) {
                        case 1:
                            System.out.println("Welcome back !!");
                            break;
                        default:
                            System.out.println("Wrong input");
                            break;
                    }

                }

                case 4 -> {
                    System.out.println("Multiplication");
                    System.out.print("Enter first Number: ");
                    number1 = input.nextInt();
                    System.out.print("Enter Second Number: ");
                    number2 = input.nextInt();
                    int result4 = number1 * number2;
                    System.out.println("Result is: " + result4);
                    System.out.println("Do you want to continue press 1");
                    int welcome=input.nextInt();
                    switch (welcome) {
                        case 1:
                            System.out.println("Welcome back !!");
                            break;
                        default:
                            System.out.println("Wrong input");
                            break;
                    }

                }

                case 5 -> {
                    System.out.println("Square root");
                    System.out.print("Enter Number: ");
                    number1 = input.nextInt();
                    int result5 = number1 * number1;
                    System.out.println("Result is: " + result5);
                    System.out.println("Do you want to continue press 1");
                    int welcome=input.nextInt();
                    switch (welcome) {
                        case 1:
                            System.out.println("Welcome back !!");
                            break;
                        default:
                            System.out.println("Wrong input");
                            break;
                    }

                }

                case 6 -> {
                    System.out.println("more Options:");
                    System.out.println("more option status is being updated, try again.");
                    System.out.println("Do you want to continue press 1");
                    int welcome=input.nextInt();
                    switch (welcome) {
                        case 1:
                            System.out.println("Welcome back !!");
                            break;
                        default:
                            System.out.println("Wrong input");
                            break;
                    }

                }


                default ->
                    System.out.println("Wrong option chosen!!");



                }
                }

            }

        }
    
