package Chapter3;

public class PetrolPurchaseTest {
    public static void main(String[] args) {


        PetrolPurchase gDoilAndGas = new PetrolPurchase();

        gDoilAndGas.setLocation("312 Yaba road");

        gDoilAndGas.setQuantityOfPurchase(25);
        gDoilAndGas.setPricePerLitre(490.00);
        gDoilAndGas.setTypeOfPetrol("Fuel");
        gDoilAndGas.setDiscount(0.34);

        System.out.println("Welcome to :" + gDoilAndGas.getLocation());
        System.out.println("Type of goods purchase is: " + gDoilAndGas.getTypeOfPetrol());
        System.out.println("Amount to be paid: " + gDoilAndGas.amountToBePaid());


    }

}