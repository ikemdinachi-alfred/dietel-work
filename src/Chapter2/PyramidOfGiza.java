package Chapter2;

import java.util.Scanner;

public class PyramidOfGiza {
        public static void main(String [] args) {

            Scanner egypt= new Scanner (System.in);

            System.out.printf("It will inerest you to know that The great Pyramid of Giza have the following features: %s%n%s%n%s%n%s%n", " it took Approximately 2500kg(2.5 tonns) average weight of Stones to finish the pyramid", "It took 20 years for its completion", "Approximately 2,300,000 stones were used", "and 4,000 workers did the building");


            System.out.print("Enter Average Weight of each stone used to build Pyramid of Giza in kg : ");
            double weight= egypt.nextDouble();


            System.out.print("Enter The  Number Of Stone Used : ");
            double height= egypt.nextDouble();

            System.out.print("Enter Number of Years taken : ");
            int years= egypt.nextInt();

            System.out.print("Numbers of workers  : ");
            double workers= egypt.nextDouble();

            int year= years;
            int hour = year* 1440;
            int minute =hour*24;

            System.out.printf("Number of Stone Used: %.2f%n%n", height);
            System.out.printf("Average of each Stone Used: %.2f%n%n", weight);
            System.out.printf("Number of workers Approximately: %.2f%n%n", workers);
            System.out.printf("Time taken to buld pyramid of Giza in years: %d%s%n%n", year, " years");
            System.out.printf("Time taken to build pyramid of Giza in  Hours: %d%s%n%n", hour, " Hours");
            System.out.printf("Time taken to build pyramid of Giza in  Minutes: %d%s%n%n", minute, " Minutes");




        }
    }



