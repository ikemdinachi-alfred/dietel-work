package selfPractice;

import java.util.Arrays;

public class ArrayPrint {
    public static void main(String[] args) {


        int[] number = new int[10];
        for (int cont =0; cont < number.length; cont++){
            number[cont] = cont + 1;


        }
        System.out.println(Arrays.toString(number));
    }
}