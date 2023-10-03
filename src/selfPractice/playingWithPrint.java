package selfPractice;

public class playingWithPrint {
    public static void main(String[] args)
            throws java.io.IOException {

        char ch, input = 'k';
            System.out.println("guess an alphabet between a to z");
            System.out.print("can you guess it: ");

        ch = (char) System.in.read();
            if (ch == input) System.out.println("** Rightly correct **");
            if (ch < input) System.out.println(" too low");
            if (ch > input)System.out.println(" too high ");
            else System.out.println("...Sorry, you're wrong try again.");


        }
    }

