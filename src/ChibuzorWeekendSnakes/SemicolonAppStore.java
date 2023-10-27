package ChibuzorWeekendSnakes;
import java.util.Scanner;
public class SemicolonAppStore {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the number of items: ");
            int numItems = input.nextInt();
            String[] itemNames = new String[numItems];
            int[] itemQuantities = new int[numItems];
            double[] itemPrices = new double[numItems];

            // Collecting item information
            for (int i = 0; i < numItems; i++) {
                System.out.print("Enter name of item " + (i + 1) + ": ");
                itemNames[i] = input.next();
                System.out.print("Enter quantity of " + itemNames[i] + ": ");
                itemQuantities[i] = input.nextInt();
                System.out.print("Enter price per unit of " + itemNames[i] + ": ");
                itemPrices[i] = input.nextDouble();
            }

            // Displaying table with item information
            System.out.printf("%-15s", "Item Name");
            System.out.printf("%-15s", "Quantity");
            System.out.printf("%-15s", "Price per Unit");
            System.out.println();

            double totalAmount = 0;
            for (int i = 0; i < numItems; i++) {
                double amount = itemQuantities[i] * itemPrices[i];
                totalAmount += amount;
                System.out.printf("%-15s", itemNames[i]);
                System.out.printf("%-15d", itemQuantities[i]);
                System.out.printf("$%-14.2f", itemPrices[i]);
                System.out.println();
            }

            // Calculating discount and VAT
            double discount = 0;
            System.out.print("Enter customer name: ");
            String customerName = input.next();
            System.out.print("Enter discount percentage: ");
            double discountPercentage = input.nextDouble();
            if (discountPercentage > 0) {
                discount = totalAmount * discountPercentage / 100;
                totalAmount -= discount;
            }
            double vat = totalAmount * 17.5 / 100;

            // Displaying table with total amount, discount, and VAT
            System.out.printf("%-15s", "Total Amount");
            System.out.printf("$%-14.2f", totalAmount);
            System.out.println();
            if (discount > 0) {
                System.out.printf("%-15s", "Discount");
                System.out.printf("$%-14.2f", discount);
                System.out.println();
            }
            System.out.printf("%-15s", "VAT");
            System.out.printf("$%-14.2f", vat);
        }
    }


