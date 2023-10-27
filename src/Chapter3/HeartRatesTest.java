package Chapter3;

import java.util.Scanner;

public class HeartRatesTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        HeartRates patientHeartRate = new HeartRates();


        System.out.print("Enter your full Name: ");
        String name = input.nextLine();
        patientHeartRate.setFullName(name);

        System.out.print("Enter day of birth: ");
        int date = input1.nextInt();

        System.out.print("Enter month of birth in number: ");
        int month = input1.nextInt();
        System.out.print("Enter year of birth: ");
        int year = input1.nextInt();

        patientHeartRate.setBirthDay(date, month, year);

        System.out.println("""
                ==========================================
                Hello,
                Welcome To Heart Rate calculator
                Your Details Are:
                ------------------------------------------
                """);
        System.out.println("FULLNAME; " + patientHeartRate.getFullName());
        System.out.println("DATE OF BIRTH: " + patientHeartRate.getBirthday());
        System.out.println("YOU ARE: " + patientHeartRate.getAge() + " Years Old");
        System.out.println("YOUR MAXIMUM HEART RATE IS: " + patientHeartRate.getMaximumHeartRate());
        System.out.println("YOUR TARGETED HEART RATE IS : " + patientHeartRate.getTargetHeartRate());
        System.out.println("------------------------------------------");


    }
}
