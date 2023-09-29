package Exercises;

public class StarShape {

    public static void main(String[] args) {

        printRow();
        changeRow();
    }

    public static void printRow() {
        int number = 5;
        for (int count = 1; count <= number; count += 1) {
            for (int count2 = 1; count2 <= count; count2++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void changeRow() {
        int number = 4;
        for (int count = 1; count <= number; count += 1) {
            for (int count2 = count; count2  <= number; count2++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}