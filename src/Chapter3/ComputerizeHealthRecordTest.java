package Chapter3;

import java.util.Scanner;

public class ComputerizeHealthRecordTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        ComputerizeHealthRecord healthRecord = new ComputerizeHealthRecord();
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();
        healthRecord.setFirstName(firstName);

        System.out.print("Enter last Name: ");
        String lastName = scanner.nextLine();
        healthRecord.setLastName(lastName);

        System.out.print("Enter gender: ");
        String gender = scanner.nextLine();
        healthRecord.setGender(gender);

        System.out.print("Enter day of Birth: ");
        String day = scanner.nextLine();

        System.out.print("Enter month of Birth: ");
        String month = scanner.nextLine();

        System.out.print("Enter year of Birth: ");
        int year = scanner1.nextInt();
        healthRecord.setBirthday(day, month, year);

        System.out.print("Enter your height in Centimeters : ");
        double height = scanner2.nextDouble();
        System.out.print("Enter your weight in kg: ");
        int weight = scanner1.nextInt();
        healthRecord.setHeight(height);
        healthRecord.setWeight(weight);

        System.out.println("""
                *********************************************
                WELCOME TO OVERCOMER'S HEALTH CARE
                BELOW ARE YOUR HEALTH RECORDS
                ---------------------------------------------
                """);
        System.out.println("FULLNAME: " + healthRecord.getFirstName() + " " + healthRecord.getLastName());
        System.out.println("GENDER: " + healthRecord.getGender());
        System.out.println("AGE: " + healthRecord.getAge() + " Years Old");
        System.out.println("WEIGHT: " + healthRecord.getWeight() + " Kg");
        System.out.println("HEIGHT: " + healthRecord.getHeight() + " Meters");
        System.out.println("DATE OF BIRTHDAY: " + healthRecord.getBirthday());
        System.out.println("MAXIMUM HEART RATE: " + healthRecord.getMaximumHeartRate());
        System.out.println("TARGETED HEART RATE: " + healthRecord.getTargetHeartRate());
        System.out.printf("BMI: %.2f%n ",  healthRecord.getBMI());
        System.out.println("---------------------------------------------");
        
    }
}
