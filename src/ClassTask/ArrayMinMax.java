package ClassTask;

public class ArrayMinMax {
    public static void main(String[] args) {
        int [] number = {5,3,4,2,1};
         System.out.println(total(number)-minimum(number));
        System.out.print(total(number)-maximum(number));



    }

    public static int total(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum = sum + number;
        }
        return sum;
    }

    public static int maximum(int[] numbers) {
        int maximum = 0;
        for (int number : numbers) {
            if ( number > maximum) maximum = number;
        }
        return maximum;

    }

    public static int minimum(int[] numbers) {
        int minimum = numbers[0];
        for (int number : numbers) {
            if (number < minimum) minimum = number;
        }
        return minimum;

    }
}