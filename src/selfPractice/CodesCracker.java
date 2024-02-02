package selfPractice;
import java.util.Scanner;
import java.io.*;

public class CodesCracker
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Number of seconds to short down this system: ");
        int seconds = scan.nextInt();
        Runtime r = Runtime.getRuntime();

        try
        {
            System.out.println("The PC will get restarted after " +seconds +" seconds.");
            r.exec("shutdown -r -t " + seconds);
        }
        catch(IOException e)
        {
            System.out.println("Exception: " +e);
        }
    }
}
