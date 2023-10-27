package ClassTask;

import java.util.Scanner;

public class columnAndRowPlayWithFunction {
    public static void main(String[] args) {
        java.util.Scanner input = new Scanner(System.in);
        int [][] matrix = new int[4][4];
        System.out.println("Enter " + matrix.length + " rows and " +
                matrix[0].length + " columns: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextInt();


            }

/*
    public static void fillArray(String[][] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter item price: ");
        int j = 0;
        int i = 0;
        arr[i][j] = sc.nextLine();
        for (i = 1; i < 4; i++) {
            for (j = 1; j < 5; j++) {
                System.out.println("Enter value for " + arr[i][0] + ", " + arr[0][j]);

                arr[i][j] = sc.nextLine();
            }
        }
    }

    // This function prints the array to the console
    public static void printArray(String[][] arr) {
        System.out.println("The array is: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}


*/
        }
    }
}