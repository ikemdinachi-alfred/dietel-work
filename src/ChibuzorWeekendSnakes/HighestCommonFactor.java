package ChibuzorWeekendSnakes;

import java.util.Arrays;

public class HighestCommonFactor {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getHCF(new int[]{6, 12, 18, 24})));

    }


    public static int[] getHCF(int[] number) {
        int[] HCF = new int[number.length];
        int add = 2;
        for (int count = 0; count < number.length; count++)
            while (count < number.length)
                HCF = new int[]{number[count] % add};
                     add++;

                 return HCF;
    }
}