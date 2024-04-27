package selfPractice;

import java.io.IOException;
import java.util.Scanner;

public class ShotDownSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter time in seconds: ");
        int time = sc.nextInt();

        Runtime runtime = Runtime.getRuntime();

        try {
            System.out.println("yor system will shot down in "+time+" seconds");
            runtime.exec(sc.next(String.valueOf(time)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
