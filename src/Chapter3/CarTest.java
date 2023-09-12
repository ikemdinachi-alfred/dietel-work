package Chapter3;

public class CarTest {
    public static void main(String[] args) {
        Car myBlueCar = new Car();
        Car myRedCar = new Car();

        myBlueCar.setPrice(9_200_000);
        myBlueCar.setYear("2022");
        myBlueCar.setModel("Toyota");
        double blueCarDiscount= (0.05)* myBlueCar.getPrice();
        double priceAfterDiscount= myBlueCar.getPrice()-blueCarDiscount;
        if (myBlueCar.getPrice()<0) {
            myBlueCar.setPrice(0);
        }

        myRedCar.setPrice(9_000_000);
        double redCarDiscount= (0.07)* myRedCar.getPrice();
        double priceAfterDiscount2= myRedCar.getPrice()-redCarDiscount;
        myRedCar.setModel("BMW");
        myRedCar.setYear("2023");
        if (myRedCar.getPrice()<0) {
            myRedCar.setPrice(0);
        }

        System.out.println("Price of first car is: "+ myBlueCar.getPrice());
        System.out.println("The Discount price is: "+ blueCarDiscount);
        System.out.println("The price after discount is: "+ priceAfterDiscount);
        System.out.println("Model: " + myBlueCar.getModel());
        System.out.println("Year :" + myBlueCar.getYear() );

        System.out.println("Price of second car is: "+ myRedCar.getPrice());
        System.out.println("The 7% Discount Price is: "+ redCarDiscount);
        System.out.println("The price After Discount is: "+ priceAfterDiscount2);
        System.out.println("Model: " + myRedCar.getModel());
        System.out.println("Year :" + myRedCar.getYear() );
    }
}
