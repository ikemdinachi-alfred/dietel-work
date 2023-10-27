package Chapter3;

import java.util.Scanner;

public class PetrolPurchaseTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        PetrolPurchase gDoilAndGas = new PetrolPurchase();

        gDoilAndGas.setLocation("""
              ================================================
                WELCOME TO G & J GAS STATION:
                312 YABA LANE LAGOS STATE:
              ------------------------------------------------""");
        System.out.print("What is the customer buying? - fuel, gas or diesel: ");
        String goods = scanner.nextLine();

        System.out.print("How many liter of " + goods + " is the customer buying ? : ");
        int literOfOil = scanner.nextInt();

        gDoilAndGas.setQuantityOfPurchase(literOfOil);
        System.out.print("Enter price of " + goods + " per liter: ");
        double fuelPrice = scanner.nextDouble();

        gDoilAndGas.setPricePerLitre(fuelPrice);
        gDoilAndGas.setTypeOfPetrol(goods);

        System.out.print("How much discount is he receiving ? : ");
        double discount = scanner.nextDouble();
        gDoilAndGas.setDiscount(discount);
        System.out.println("\n\n\n\n");

        System.out.println(gDoilAndGas.getLocation());
        System.out.println("| Type of goods purchase is: " + gDoilAndGas.getTypeOfPetrol());
        System.out.println("| Liters of " + goods + " purchased : " + literOfOil);
        System.out.println("| price per liter is: " + fuelPrice);
        System.out.println("| Discount received: " + discount + " Naira");
        System.out.println("| Amount to be paid: " + gDoilAndGas.amountToBePaid());
        System.out.println("| Thank you for coming ");
        System.out.println("""
              ===============================================""");


    }

}