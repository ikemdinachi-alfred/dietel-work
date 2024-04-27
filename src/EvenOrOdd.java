

public class EvenOrOdd {
    public static void main(String[] args) {

    }


        private static int power(int number, int powerValue){
        int result = 1;
            for (int counter = 0; counter < powerValue; counter++) {
                result = result * number;

            }
            return result;
    }
    private static long power(long number, long powerValue) {
        long result = 1;
        for (int counter = 0; counter < powerValue; counter++) {
            result = result * number;

        }
        return result;

    }



}
