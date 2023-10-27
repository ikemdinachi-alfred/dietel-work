package Chapter2;

import java.util.Scanner;
public class DecisionOutPut {

        public static void main(String[] args){
            Scanner number= new Scanner(System.in);

            System.out.print("Enter First Integer: ");
            int integer1= number.nextInt();

            System.out.print("Enter Second Integer: ");
            int integer2= number.nextInt();

            System.out.print("Enter Third Integer: " );
            int integer3= number.nextInt();

            System.out.print("Enter Fourth Integer: " );
            int integer4= number.nextInt();

            System.out.print("Enter Fifth Integer: " );
            int integer5= number.nextInt();

            System.out.printf("%n%n");

            if (integer1> integer2 && integer1> integer3 && integer1> integer4 && integer1> integer5)
                System.out.printf("The Highest integer is: %d%n%n", integer1);

            if ( integer2 > integer1 && integer2> integer3 && integer2> integer4 && integer2> integer5)
                System.out.printf("The Highest integer is: %d%n%n", integer2);

            if (integer3> integer1 && integer3> integer2 && integer3> integer4 && integer3> integer5)
                System.out.printf("The Highest integer is: %d%n%n", integer3);

            if (integer4> integer1 && integer4> integer2 && integer4> integer3 && integer4> integer5)
                System.out.printf("The Highest integer is: %d%n%n", integer4);

            if (integer5> integer1 && integer5> integer2 && integer5> integer3 && integer5> integer4)
                System.out.printf("The Highest integer is: %d%n%n%n", integer5);

            if (integer1< integer2 && integer1< integer3 && integer1< integer4 && integer1< integer5)
                System.out.printf("The Lowest integer is: %d%n%n", integer1);

            if (integer2 < integer1 && integer2< integer3 && integer2< integer4 && integer2< integer5)
                System.out.printf("The Lowest integer is: %d%n%n", integer2);

            if (integer3< integer1 && integer3< integer2 && integer3< integer4 && integer3< integer5)
                System.out.printf("The Lowest integer is: %d%n%n", integer3);

            if (integer4< integer1 && integer4< integer2 && integer4< integer3 && integer4< integer5)
                System.out.printf("The Lowest integer is: %d%n%n", integer4);

            if (integer5< integer1 && integer5< integer2 && integer5< integer3 && integer5< integer4)
                System.out.printf("The Lowest integer is: %d%n%n", integer5);

        }

    }




