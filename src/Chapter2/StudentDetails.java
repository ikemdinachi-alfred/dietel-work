package Chapter2;
import java.util.Scanner;
public class StudentDetails {

        public static void main(String[] args){

            Scanner name = new Scanner(System.in);

            System.out.print ("Please Enter The First and Sure Name Of The First  Student :");
            String firstName = name.nextLine();

            System.out.print ("Please Enter The First and Sure Name Of The Second Student :");
            String secondName = name.nextLine();

            System.out.print ("Please Enter The First and Sure Name Of The Third  Student :");
            String thirdName = name.nextLine();

            System.out.print ("Please Enter The First and Sure Name Of The Fourth Student :");
            String fourthName = name.nextLine();

            System.out.print ("Please Enter The First and Sure Name Of The Fifth  Student :");
            String fifthName= name.nextLine();

            System.out.println(firstName);
            System.out.println(secondName);
            System.out.println(thirdName);
            System.out.println(fourthName);
            System.out.println(fifthName);

        }
    }




