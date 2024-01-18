package LibrarayManagementApplication;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagementApp {
    static Library library;
    static int  totalNumberOfRegisteredUsers;

    public static  int getTotalNumberOfRegisteredUsers() {
        return totalNumberOfRegisteredUsers;
    }

    public static void main(String[] args) {
        libraryMainMenu();
    }

    public static void libraryMainMenu(){
        String main = input("""
                1-> Register
                2-> login
                2-> Borrow Book
                3-> Return Book
                4-> Exit
                """);
        switch (main){
            case "1":
                register();
            case "2":
                login();
        }

    }

    private static void login() {
        String name = input("Enter your name: ");
        String id = input("Enter your ID Number: ");
        try {
            library.login(name,id);
            System.out.println("you login succcessfully...");
            libraryMainMenu();
        }
        catch (InvalidBookSearchException message){
            System.out.println(message.getMessage());
        }
        libraryMainMenu();

    }

    private static void register() {
        totalNumberOfRegisteredUsers++;
        ArrayList<Users> users = new ArrayList<>();
        String firstName = input("Enter your first Name: ");
        String lastName = input("Enter last Name: ");
        String phoneNumber = input("Enter your phone Number: ");
        String address = input("Enter Email Address: ");
        String id = iDGenerator();
        String fullName = concatinateName(firstName,lastName);
        Users users1 = new Users(fullName,phoneNumber,id,address);
        users.add(users1);
        System.out.println("Registration successful....\n check your details \n");
        System.out.println(users);
        libraryMainMenu();
    }



    private static String iDGenerator() {
        return "000" + getTotalNumberOfRegisteredUsers();
    }

    private static String concatinateName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public static String input(String string){
        Scanner input = new Scanner (System.in);
        System.out.print(string);
        return input.nextLine();
    }

}
