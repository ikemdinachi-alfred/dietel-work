package Chapter2;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a Temperature Value in Celsius: ");
        double userInput = input.nextDouble();

        double fahrenheit = 1.8 * userInput + 32;
        System.out.println(fahrenheit+ ":" + "  fahrenheit");


    }
}
