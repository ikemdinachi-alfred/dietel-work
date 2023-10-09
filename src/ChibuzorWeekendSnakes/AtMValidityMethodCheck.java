package ChibuzorWeekendSnakes;

import java.util.Scanner;

public class AtMValidityMethodCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print(" Hello kindly Enter Card Detail to verify: ");
        String cardNumber = input.nextLine();

        System.out.println("***************************************************");
        System.out.println("** The card type is: "+ checkCardType(cardNumber));
        System.out.println("** The length of the digit is " + cardNumber.length());
        System.out.println("** The card Number is :" + cardNumber);
        cardValidityCheck(cardNumber);
        System.out.println("**************************************************");
    }

    public static void  cardValidityCheck(String cardNumber) {
        int firstSum = 0;
        int secondSum = 0;
        int sum = 0;
        int[] cardCheck = new int[cardNumber.length()];
        for (int index = 0; index < cardCheck.length; index++) {
            cardCheck[index] = Integer.parseInt(cardNumber.substring(index, index + 1));
        }
        for (int index = 0; index <= cardCheck.length - 1; index += 2) {
            int add = 1;
            int result = cardCheck[index];
            result *= 2;
            if (result > 9)
                result = result % 10 + add;
            firstSum = firstSum + result;
        }
        for (int index = 1; index <= cardCheck.length - 1; index += 2) {
            secondSum = secondSum + cardCheck[index];
        }
        sum = firstSum + secondSum;
        if (sum % 10 == 0) System.out.println("** credit card validity status: valid");
        else System.out.println("** credit card validity status: invalid");
    }

    public static String checkCardType(String cardNumber) {
        int[] cardCheck = new int[cardNumber.length()];
        for (int index = 0; index < cardCheck.length; index++) {
            cardCheck[index] = Integer.parseInt(cardNumber.substring(index, index + 1));
            if (cardCheck[0]==4) return "Visa Card";
            if (cardCheck[0]==5) return "Master Card";
            if (cardCheck[0]==3) return "American Express Card";
            if (cardCheck[0]==6) return "For Discover cards";
        }
            return "unknown card type";
    }
}