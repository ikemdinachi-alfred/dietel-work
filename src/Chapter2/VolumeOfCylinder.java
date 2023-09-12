package Chapter2;

import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of a cylinder: ");
        float radius= input.nextFloat();

        System.out.print("Enter the length of a cylinder: ");
        float length= input.nextFloat();

        float area= (float) (radius * radius* (22/7));
        float volume= area*length;

        System.out.printf("The area is: %f.2%n%s%f.2",area, "The volume is: ", volume);



    }

}
