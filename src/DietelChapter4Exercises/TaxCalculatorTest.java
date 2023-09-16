package DietelChapter4Exercises;

import java.util.Scanner;

public class TaxCalculatorTest {
    public static void main(String[] args) {
        Scanner userInput= new Scanner(System.in);
        Scanner userInput1 = new Scanner(System.in);

        TaxCalculator firstName = new TaxCalculator();
        TaxCalculator secondName= new TaxCalculator();
        TaxCalculator thirdName = new TaxCalculator();


        System.out.print("Enter Name of first citizen: ");
        String name1= userInput.nextLine();
        firstName.setName(name1);
        name1=firstName.getName();


        System.out.print("Enter Annual Salary: $");
        int firstCitizenSalary= userInput1.nextInt();
        firstName.setSalary(firstCitizenSalary);
        firstCitizenSalary=firstName.getSalary();

        System.out.println("\n");

        double citizen1MonthlyTaxOf15 = ((double) firstCitizenSalary / 12) * 0.15;
        double citizen1MonthlyTaxOf20 = ((double) firstCitizenSalary / 12) * 0.20;
        double citizen1AnnualTaxOf15 = (citizen1MonthlyTaxOf15 * 12);
        double citizen1AnnualTaxOf20 = (citizen1MonthlyTaxOf20 * 12);
        System.out.println("Citizen Name: " + name1 + "\n" + "Annual Salary is: $" + firstCitizenSalary);



        if (firstCitizenSalary <= 30_000) {
            double citizen1SalaryBelow = firstCitizenSalary - citizen1AnnualTaxOf15;
            System.out.println("15% Monthly Tax :$" + citizen1MonthlyTaxOf15);
            System.out.println("15% Annual Tax :$" + citizen1AnnualTaxOf15);
            System.out.println("Balance After annualTax: $" + citizen1SalaryBelow);
        } else {
            double citizen1SalaryAbove = firstCitizenSalary - citizen1AnnualTaxOf20;
            System.out.println("20% Monthly Tax :$" + citizen1MonthlyTaxOf20);
            System.out.println("20% Annual Tax :$" + citizen1AnnualTaxOf20);
            System.out.println("Balance After Annual Tax: $" + citizen1SalaryAbove);
        }
    }
}
