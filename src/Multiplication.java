import java.util.Scanner;

public class Multiplication {

    public static String multiply(int firstNumber, int secondNumber){
        int difference;double average = (double)(firstNumber + secondNumber)/2;
        int sum = firstNumber + secondNumber; int product = firstNumber * secondNumber;
        int byTheWay; if (firstNumber < secondNumber){ byTheWay = firstNumber;
            difference = secondNumber - byTheWay;
        }else difference = firstNumber - secondNumber;
        return String.format("""
                The product is: %d
                The sum is : %d
                The Average is %.1f
                The Difference is: %d
                
                """,product,sum,average,difference);
    }
    public static int input(String string){
        Scanner input = new Scanner(System.in);
        System.out.println(string);
        return input.nextInt();
    }

    public static void main(String[] args) {
        int number1 = input("Enter firstNumber: ");
        int number2 =input("Enter Second Number");
        System.out.println(multiply(number1, number2));


    }

}
