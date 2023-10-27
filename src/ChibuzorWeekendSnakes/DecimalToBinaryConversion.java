package ChibuzorWeekendSnakes;

public class DecimalToBinaryConversion {
    public static void main(String[] args) {
        System.out.println(convertDecimalToBinaryNumber(18));
        System.out.println(convertBinaryToDecimalNumber(1000000));
    }

    public static long convertDecimalToBinaryNumber(int number) {
        long binaryNumber = 0;
        int remainder, i = 1, step = 0;
        while (number != 0) {
            remainder = number % 2;
            step = step + 1;
            System.out.println("Step " + step + ": " + number + "/2");
            System.out.println("Quotient = " + number + ", Remainder = " + remainder);
            number = number / 2;
            binaryNumber += remainder * i;
            i *= 10;
        }
        return binaryNumber;
    }

    public static int convertBinaryToDecimalNumber(long number) {
        long remainder;
        int count = 0, decimalNumber = 0;
        while (number != 0) {
            remainder = number % 10;
            number = number / 10;
            decimalNumber += remainder * Math.pow(2, count);
            count++;
        }
        return decimalNumber;
    }

}
