package selfPractice;

import java.util.Scanner;

public class LoopPlay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder a = new StringBuilder(" ");
        StringBuilder b = new StringBuilder(" ");
        StringBuilder c = new StringBuilder(" ");
        StringBuilder d = new StringBuilder(" ");
        StringBuilder e = new StringBuilder(" ");


        System.out.print("Enter  first number of star: ");
        String v = " ";
        int firstNumber = scanner.nextInt();
        for (int count = 0; count < firstNumber; count++) {
            v = "* ";
            a.append(v);
        }
        System.out.print("Enter  second number of star: ");
        int secondNumber = scanner.nextInt();
        String r = " ";
        for (int count = 0; count < secondNumber; count++) {
            r = "* ";
            b.append(r);
        }
        System.out.print("Enter  third number of star: ");
        int thirdNumber = scanner.nextInt();
        String g = " ";
        for (int count = 0; count < thirdNumber; count++) {
            g = "* ";
            c.append(g);
        }
        System.out.print("Enter  fourth number of star: ");
        int fourthNumber = scanner.nextInt();
        d.append(v.repeat(Math.max(0, fourthNumber)));

        System.out.print("Enter  fifth number of star: ");
        String x = " ";
        int fifthNumber = scanner.nextInt();
        for (int count = 0; count < fifthNumber; count++) {
            x = "* ";
            e.append(x);
        }
        System.out.printf("%d: %s%n%d: %s%n%d: %s%n%d: %s%n%d: %s%n", firstNumber, a, secondNumber, b, thirdNumber, c, fourthNumber, d, fifthNumber, e);

    }

}
