package Exercises;

public class StarShape {

    public static void main(String[] args) {
        System.out.print(printRow() + " "+changeRow());
        System.out.print(printRow() + " "+changeRow());


    }

    public static String printRow() {
        int number = 8;
        for (int count = 1; count <= number; count += 1) {
            for (int count2 = 1; count2 <= count; count2++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        return "";
    }

    public static String changeRow() {
        int number = 7;
        for (int count = 1; count <= number; count += 1) {
            for (int count2 = count; count2  <= number; count2++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        return "";
    }
}