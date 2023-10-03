   import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("""
                press
                1-> English
                2-> Yoruba
                3-> Pigin
                """);
        int userinput = input.nextInt();
        for (; userinput <= 3; userinput++) {
            switch (userinput) {
                case 1:
                    System.out.println("English");
                    break;
                case 2:
                    System.out.println("Yoruba");
                    System.out.println(" Do you want to speak yoruba? \n press 1: ");
                    int speakIjebu = input.nextInt();
                    if (speakIjebu == 1) {
                        System.out.println("ijebu mode Activated");
                    } else {
                        System.out.println("wrong input, please try again");
                    }

                case 3:
                    System.out.println("Pigin");
                    System.out.println("You wan speak pidgin  press 1?");
                    int speaakWafi = input.nextInt();
                    switch (speaakWafi) {
                        case 1 -> System.out.println("pigin mode on");
                        case 2 -> System.out.println("pigin mode off");
                    }
                    break;
                default:
                    System.out.println("You no get sense!!!!!");
            }

        }
    }
}