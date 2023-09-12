package Chapter2;

import java.util.Scanner;

public class Circumference {

        public static void main(String [] args){

            Scanner input= new Scanner (System.in);
            System.out.print ("Enter The Value of the Radius of a Circle:");
            int radius=input.nextInt();

            int diameter= 2* radius;
            double circumference= 2*3.142* radius;

            double area= 3.142*radius*radius;

            System.out.printf("%s%d%n", "The Circle Diameter is: ", diameter);
            System.out.printf("%s%2f%n", "The Circle Circumference is: ", circumference);
            System.out.printf("%s%2f%n", "The Area of The Circle is: ", area);

        }

    }



