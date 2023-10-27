package Exercises;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(swap(new int[]{1, 2, 3, 4, 5}, 1, 0)));
    }



    public static int[] swap(int[] number, int index1, int index2) {
        int index = 0;
        number[index1] = number[index1] + number[index2];
        number[index2] = number[index1] + number[index2];
        number[index1] = number[index1] - number[index2];
        return number;
    }
}
