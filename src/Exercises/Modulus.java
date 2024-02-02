package Exercises;

import java.util.Arrays;

public class Modulus {

    public static int[] returnNumber(String number){
        int add = number.length()-1;
       int []  addNumber = new int[number.length()];
       int [] newAddnumber = new int[number.length()];
       int newNumber = Integer.parseInt(number);
       for (int count = 0; count<number.length();count++){
           int put = newNumber %10;
           addNumber[count] = put;
           newNumber = newNumber /10;
           newAddnumber[add] = addNumber[count];
           add--;

       }
return newAddnumber;
    }

    public static void main(String[] args) {
        String number = "67895";
        System.out.println(Arrays.toString(returnNumber(number)));
    }
}
