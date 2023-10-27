package ChibuzorWeekendSnakes;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorFunction {
    public static void main(String[] args) {
        System.out.println(getPrimeFactor(6));
    }

    public static List<Integer> getPrimeFactor(int number) {
        ArrayList<Integer> factors = new ArrayList<>();
        for (int count = 2; count <= number; count += 1) {
            while (number % count == 0) {
                factors.add(count);
                number = number / count;
            }
        }
        return factors;
    }
    public static int[] convertToArray(ArrayList<Integer> factors){
        int [] factor = new int [factors.size()] ;
        for (int i = 0; i <factor.length ;) {
            factor[++i] = factors.get(i);
        }
        return factor;
    }
}
