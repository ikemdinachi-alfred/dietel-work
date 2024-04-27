package sevenSegment;

import java.util.Scanner;

public class SevenSegmentDisplayReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number from 0 -9: ");
        int number = sc.nextInt();
        System.out.println("Enter seven binary digits: ");
        String numbers = sc.nextLine();



        if(sc.hasNextInt()){
            convertFromNumberToBinary(number);
        }
            if(sc.hasNextLine()){
                convertFromBinaryToNumber(numbers);
            }



    }

    public static void convertFromNumberToBinary(int value) {
        switch (value) {
            case 0:
                System.out.println("1111110");
                break;
            case 1:
                System.out.println("0110000");
                break;
            case 2:
                System.out.println("1101101");
                break;
            case 3:
                System.out.println("1111001");
                break;
            case 4:
                System.out.println("0110011");
                break;
            case 5:
                System.out.println("1011011");
                break;
            case 6:
                System.out.println("1011111");
                break;
            case 7:
                System.out.println("1110000");
                break;
            case 8:
                System.out.println("1111111");
                break;
            case 9:
                System.out.println("1111011");
                break;
            default:
                System.out.println("Invalid seven-segment value: ");
        }
    }

    public static void convertFromBinaryToNumber(String value) {
        switch (value) {
            case "1111110":
                System.out.println(0);
                break;
            case "0110000":
                System.out.println(1);
                break;
            default:
                System.out.println("Invalid seven-segment value: ");
        }
    }
}
