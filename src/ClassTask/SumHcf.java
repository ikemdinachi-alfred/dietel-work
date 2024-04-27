package ClassTask;

public class SumHcf {

    public static int sumHcf(int[] numbers) {
        int sum = 0;
        int fig = numbers[0];
        while (fig != 1) {
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 == 0) {
                    sum += numbers[i] / 2 ;
                    fig = fig / 2;

                }
            }

        }
        return sum;

    }

    public static void main(String[] args) {
        int[] number  ={8,16,12};
        System.out.println(sumHcf(number));
    }
}
