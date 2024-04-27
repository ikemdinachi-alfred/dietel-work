package ClassTask;

import java.util.Arrays;

public class MorningDril {

    private static int zeroAndOne(int number){
        if(number%2==0)return 0;
        else return 1;
    }

    public static int[] evenAndOdd(int[] num){
        int [] newNum = new int[num.length];
        for(int i=0; i<num.length; i++){
         newNum[i]   = zeroAndOne(num[i]);
        }
        return newNum;
    }

    public static void main(String[] args) {
        int[] num = {4,5,8,8,8,82,9};
        System.out.println(Arrays.toString(evenAndOdd(num)));
    }


}
