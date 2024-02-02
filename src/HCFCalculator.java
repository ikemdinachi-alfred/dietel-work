public class HCFCalculator {

        private static int findHCF(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }
        public static int findHCFArray(int[] numbers) {
            if (numbers.length < 2) {
                throw new IllegalArgumentException("Input array should have at least two numbers.");
            }
            int hcf = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                hcf = findHCF(hcf, numbers[i]);
            }
            return hcf;
        }

        public static void main(String[] args) {
            int[] input = {8,4,12};
            int output = findHCFArray(input);


            System.out.println("HCF of the given array is: " + output);
        }
    }


