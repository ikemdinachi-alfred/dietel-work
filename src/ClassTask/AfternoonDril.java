package ClassTask;

import java.util.Arrays;

public class AfternoonDril {
    private static boolean falseTrue(int number){
        if(number%2==0)return false;
        else return true;
    }
    public static boolean[] evenAndOdd(int[] num){
        boolean [] newNum = new boolean[num.length];
        for(int i=0; i<num.length; i++){
            newNum[i]   = falseTrue(num[i]);
        }
        return newNum;
    }

        void main(String[]args) {
        int [] num = {4,5,8,8,8,2,9};
        System.out.println(Arrays.toString(evenAndOdd(num)));
    }

}
