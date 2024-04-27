package ClassTask;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class MorningDrill {
    public static int[] doubleArray(int[] arr) {
        int[] newArr = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
            newArr[i + arr.length] = arr[i] * 2;
        }
        return newArr;
    }

    public static void main(String[] args) {
       IntSummaryStatistics value = IntStream.rangeClosed(1,10).summaryStatistics();
        System.out.printf(" Count: %d%n Sum: %d%n Average: %f%n Minimum: %d%n Maximum: %d%n",
                value.getCount(),value.getSum(),value.getAverage(),value.getMin(),value.getMax());

    }
}
