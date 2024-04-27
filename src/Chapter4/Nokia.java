package Chapter4;

import java.util.Scanner;

public class Nokia {
    static Scanner input = new Scanner(System.in);
    public static void mainMenu(){
        System.out.print("""
                                Menu  \s
                    **************************************           \s
                    *        1-> Phone book              *
                    *        2-> Messages                *
                    *        3-> Chat                    *
                    *        4-> Call Register           *
                    *        5-> Tones                   *
                    *        6-> Settings                *
                    *        7-> Call Divert             *
                    *        8-> Games                   *
                    *        9-> Calculator              *
                    *        10-> Reminders              *
                    *        11-> Clock                  *
                    *        12-> Profiles               *
                    *        13-> SIM services           *
                    **************************************        \s
                            
                    select options:   
                                            """);
        int userInput = input.nextInt();
        switch (userInput) {
            case 1: phoneBook();
            case 2: messages();
            case 3: chat();
            case 4: callRegister();
    }
}

    private static void callRegister() {
    }

    private static void chat() {
    }

    private static void messages() {
    }

    private static void phoneBook() {
        System.out.println("""
                             Phone Book:
                             1-> Search
                             2-> Service Nos.
                             3-> Add name
                             4-> Erase
                             5-> Edit
                             6-> Assign tone
                             7-> Send b'card
                             8-> Option
                             9-> Speed dials
                             10-> Voice tags
                            """);
        int userInput1 = input.nextInt();
        switch (userInput1) {
            case 1:
                System.out.println(" Search Activated");
                break;
            case 2:
                System.out.println(" Service Nos Activate");
                break;
            case 3:
                System.out.println(" Add name Activated");
                break;
            case 4:
                System.out.println(" Erase Activated ");
                break;
            case 5:
                System.out.println(" Edit Activated");
                break;
            case 6:
                System.out.println(" Assign tone Activated");
                break;
            case 7:
                System.out.println(" end b'card is Activated");
                break;
            case 8:
                System.out.println(" Option Activated");
                System.out.println("""
                                    Option
                                    1-> Type of view
                                    2-> Memory Status
                                    """);
                int userInput2 = input.nextInt();
                switch (userInput2) {
                    case 1 -> System.out.println("Type of view Activated");
                    case 2 -> System.out.println("Memory Status Activated");
                    default -> System.out.println("sorry wrong input, try again.");
                }
            case 9:
                System.out.println(" Speed dail activated ");
                break;
            case 10:
                System.out.println("voice tag activated");
                break;
            default:
                System.out.println("wrong input, try again!!");
                mainMenu();
                break;
        }

    }

    public static void main(String[] args) {
        mainMenu();
    }

    }
