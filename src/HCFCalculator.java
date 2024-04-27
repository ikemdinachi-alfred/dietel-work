
    public class HCFCalculator {
        public static int calculateHCF(int[] numbers) {
            if (numbers == null || numbers.length == 0) {
                throw new IllegalArgumentException("Input array must not be empty or null.");
            }

            int hcf = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                hcf = calculateHCF(hcf, numbers[i]);
            }
            return hcf;
        }

        private static int calculateHCF(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }

        public static void main(String[] args) {
            int[] numbers = {12, 18, 24};
            int hcf = calculateHCF(numbers);
            System.out.println("HCF of the numbers is: " + hcf);
        }
    }




