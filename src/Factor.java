import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        if (number%5==0){
            System.out.println(number + " is a factor");
    }else {
            System.out.println(number + " is not a factor");
        }
    }
}
