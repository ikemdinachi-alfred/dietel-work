package Chapter2;

import java.util.Scanner;

public class WorldCalculator {

        public static void main(String [] args){
            Scanner input= new Scanner (System.in);

            System.out.print("The World Current Population is: 8,045,311,447  Click ENTER to continue.");
            String  worldPop = input.nextLine();

            System.out.print("Please Enter the World Population to Continue: ");
            long worldPop1 = input.nextLong();


            long extraNumber=70798740L ;
            long size = 8045311447L;

            long population1= size + extraNumber;
            long population2= population1 + extraNumber;
            long population3= population2+ extraNumber;
            long population4= population3 + extraNumber;
            long population5= population4 + extraNumber;

            System.out.printf("The World population by 2024 will be Approximately: %d%n%n", population1);
            System.out.printf("The World population by 2025 will be Approximately: %d%n%n", population2);
            System.out.printf("The World population by 2026 will be Approximately: %d%n%n", population3);
            System.out.printf("The World population by 2027 will be Approximately: %d%n%n", population4);
            System.out.printf("The World population by 2028 will be Approximately: %d%n%n", population5);



        }

    }

