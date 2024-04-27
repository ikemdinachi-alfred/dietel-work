package sevenSegment;

import java.util.Scanner;

public class SevenSegmentDisplay {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a binary number: ");
            String binary = input.nextLine();
            int value = convertToSevenSegment(binary);
            System.out.println("Binary Number: " + binary);
            System.out.println("Seven-Segment Value: " + value);


        }


        public static int convertToSevenSegment(String binaryNumber) {
            switch (binaryNumber) {
                case "1111110":
                    return 0;
                case "0110000":
                    return 1;
                case "1101101":
                    return 2;
                case "1111001":
                    return 3;
                case "0110011":
                    return 4;
                case "1011011":
                    return 5;
                case "1011111":
                    return 6;
                case "1110000":
                    return 7;
                case "1111111":
                    return 8;
                case "1111011":
                    return 9;

            }

            return -1;
        }
    }

