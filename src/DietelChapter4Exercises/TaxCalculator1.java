package DietelChapter4Exercises;

import java.util.Scanner;

public class TaxCalculator1 {
    public static void main(String[] args) {

    Scanner input= new Scanner(System.in);
    Scanner input1= new Scanner(System.in);

    System.out.print("Enter first Citizen Name: ");
    String citizen1 = input.nextLine();

        System.out.print("Enter first citizen Annual Salary: $");
        int citizen1Salary = input1.nextInt();

        System.out.println("\n ");

        System.out.print("Enter second Citizen Name: ");
        String citizen2 = input.nextLine();

        System.out.print("Enter second citizen Annual Salary: $");
        int citizen2Salary = input1.nextInt();

        System.out.println("\n ");

        System.out.print("Enter third citizen Name: ");
        String citizen3 = input.nextLine();

        System.out.print("Enter second citizen Annual salary: $");
        int citizen3Salary = input1.nextInt();

        System.out.println("\n ");

        double citizen1MonthlyTaxOf15 = ((double)Math.round( citizen1Salary / 12) * 0.15);
        double citizen1MonthlyTaxOf20 = ((double) Math.round(citizen1Salary / 12) * 0.20);
        double citizen1AnnualTaxOf15 = (citizen1MonthlyTaxOf15 * 12);
        double citizen1AnnualTaxOf20 = (citizen1MonthlyTaxOf20 * 12);
        System.out.println("Citizen Name: " + citizen1 + "\n" + "Annual Salary is: $" + citizen1Salary);

        if (citizen1Salary <= 30_000) {
            double citizen1SalaryBelow = citizen1Salary - citizen1AnnualTaxOf15;
            System.out.println("15% Monthly Tax :$" + citizen1MonthlyTaxOf15);
            System.out.println("15% Annual Tax :$" + citizen1AnnualTaxOf15);
            System.out.println("Balance After annualTax: $" + citizen1SalaryBelow);
        } else {
            double citizen1SalaryAbove = citizen1Salary - citizen1AnnualTaxOf20;
            System.out.println("20% Monthly Tax :$" + citizen1MonthlyTaxOf20);
            System.out.println("20% Annual Tax :$" + citizen1AnnualTaxOf20);
            System.out.println("Balance After Annual Tax: $" + citizen1SalaryAbove);
        }


        System.out.println("\n\n");
        double citizen2MonthlyTaxOf15 = ((double) citizen2Salary / 12) * 0.15;
        double citizen2MonthlyTaxOf20 = ((double) Math.round(citizen2Salary / 12) * 0.20);
        double citizen2AnnualTaxOf15 = (citizen1MonthlyTaxOf15 * 12);
        double citizen2AnnualTaxOf20 = (citizen2MonthlyTaxOf20 * 12);
        System.out.println("Citizen Name: " + citizen2 + "\n" + "Annual Salary is: $" + citizen2Salary);

        if (citizen2Salary <= 30_000) {
            double citizen2SalaryBelow = citizen2Salary - citizen2AnnualTaxOf15;
            System.out.println("15% Monthly Tax :$" + citizen2MonthlyTaxOf15);
            System.out.println("15% Annual Tax :$" + citizen2AnnualTaxOf15);
            System.out.println("Balance After annualTax: $" + citizen2SalaryBelow);
        } else {
            double citizen2SalaryAbove = citizen2Salary - citizen2AnnualTaxOf20;
            System.out.println("20% Monthly Tax :$" + citizen2MonthlyTaxOf20);
            System.out.println("20% Annual Tax :$" + citizen2AnnualTaxOf20);
            System.out.println("Balance After Annual Tax: $" + citizen2SalaryAbove);
        }


        System.out.println("\n\n");
        double citizen3MonthlyTaxOf15 = ((double)Math.round( citizen3Salary / 12) * 0.15);
        double citizen3MonthlyTaxOf20 =  ((double) Math.round(citizen3Salary / 12) * 0.20) ;
        double citizen3AnnualTaxOf15 = (citizen3MonthlyTaxOf15 * 12);
        double citizen3AnnualTaxOf20 = (citizen3MonthlyTaxOf20 * 12);
        System.out.println("Citizen Name: " + citizen3 + "\n" + "Annual Salary is: $" + citizen3Salary);

        if (citizen3Salary <= 30_000) {
            double citizen3SalaryBelow = citizen3Salary - citizen3AnnualTaxOf15;
            System.out.println("15% Monthly Tax :$" + citizen3MonthlyTaxOf15);
            System.out.println("15% Annual Tax :$" + citizen3AnnualTaxOf15);
            System.out.println("Balance After annualTax: $" + citizen3SalaryBelow);
        } else {
            double citizen3SalaryAbove = citizen3Salary - citizen3AnnualTaxOf20;
            System.out.println("20% Monthly Tax :$" + citizen3MonthlyTaxOf20);
            System.out.println("20% Annual Tax :$" + citizen3AnnualTaxOf20);
            System.out.println("Balance After Annual Tax: $" + citizen3SalaryAbove);
        }


    }

}

