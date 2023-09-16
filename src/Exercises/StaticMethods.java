package Exercises;

public class StaticMethods {
    public static void main(String[] args) {
        add(5,100);
        square(9);

    }


    public static void printBox(int numberOfStars) {
        for (int count = 1; count <= numberOfStars; count += 1) {
            printStars(numberOfStars);
        }
    }


    public static void printStars(int numberOfStars) {
        for (int count = 1; count <= numberOfStars; count += 1) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printTwoStars() {
        for (int count = 0; count < 3; count += 1) {
            System.out.println("*    *");
        }
    }


    private static void add(int number , int number1) {
        int result = number1+number;
        System.out.println(result);

    }
    public static void square(int number){
        int result= number*number;
        System.out.println(result);

    }
}
