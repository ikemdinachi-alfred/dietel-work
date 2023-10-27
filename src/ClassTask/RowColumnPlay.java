package ClassTask;

import java.util.Scanner;

public class RowColumnPlay {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[][] arr = new String[4][3];
        arr[0][0] = " ";
        arr[0][1] = "customer1";
        arr[0][2] = "customer2";
        arr[0][3] = "customer3";
        arr[0][4] = "customer4";
        arr[1][0] = "item1";
        arr[2][0] = "item2";
        arr[3][0] = "item3";

        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 5; j++) {
                System.out.println("Enter value for  " + arr[i][0] + ", " + arr[0][j]);
                arr[i][j] = input.nextLine();
            }
        }

        System.out.println("The array is: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }


}










