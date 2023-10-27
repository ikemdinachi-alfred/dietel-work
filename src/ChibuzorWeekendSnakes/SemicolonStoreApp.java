package ChibuzorWeekendSnakes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class SemicolonStoreApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("what is the customer's Name: ");
        String name = scanner.nextLine();

        String moreItem;
        double totalAmount = 0.0;
        String good;
        ArrayList<String> goods = new ArrayList<>();
        ArrayList<Integer> goodsPieces = new ArrayList<>();
        ArrayList<Double> goodsprices = new ArrayList<>();

        do {
            System.out.println("What did the user Buy? :  ");
            good = scanner.next();

            System.out.println("How many pieces ? :");
            int pieces = scanner.nextInt();

            System.out.println("How much per unit? :");
            double price = scanner.nextInt();

            double amount = price * pieces;
            totalAmount += amount;
            System.out.println("add more item: Enter yes or No ");
            moreItem = scanner.next();

            goods.add(good);
            goodsPieces.add(pieces);
            goodsprices.add(price);
        }
        while (Objects.equals(moreItem, "yes"));
        System.out.println("What is your name:  ");
        String cashier = scanner.nextLine();

        System.out.println("How much did the customer give you");
        double amountPaid = scanner.nextDouble();

        System.out.printf("""
                SEMICOLON STORE
                MAIN BRANCH
                LOCATION: 312 HERBERT MACAULAY WAY,SABO YABA LAGOS.
                TELL: 081000556645
                Date: 15 - 10 -2023 8:34:56 PM
                Cashier Name: Cashier's Name: %s
                Customer's Name: %s
                ================================================================
                Goods          quantity             price     Total(NGN)\s
                ----------------------------------------------------------------
                %s               %s                  %s          %f
                """, name, cashier, goods, goodsPieces, goodsprices, totalAmount
        );
    }
}
