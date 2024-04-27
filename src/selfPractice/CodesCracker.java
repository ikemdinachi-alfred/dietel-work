package selfPractice;

import java.io.IOException;
import java.util.Scanner;

public class CodesCracker
{
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Number of seconds to short down this system: ");
        int seconds = scan.nextInt();

        ProcessBuilder r = new ProcessBuilder();

        System.out.println("The PC will get restarted after " +seconds +" seconds.");
        r.command(STR."java -jar CodesCracker.jar\{seconds}");
    }
}
