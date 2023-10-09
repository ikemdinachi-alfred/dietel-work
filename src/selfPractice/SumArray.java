
package selfPractice;

public class SumArray {
    public static void main(String[] args) {
        //  getSumOfOddPosition(new int[]{5,4,1,0,6,7,9});
        // getSumOfEvenPosition(new int[]{5,4,1,0,6,7,9});
        System.out.println(getSumOfOddNumbers((new int[]{5, 4, 1, 0, 6, 7, 9})));
        System.out.println(getSumOfEvenNumbers((new int[]{5, 4, 1, 0, 6, 7, 9})));
      //  concatenateTwoArray(new String{"6"});
    }

    public static int getSumOfOddPosition(int[] arry) {
        int sum = 0;
        for (int index = 1; index < arry.length; index += 2) {
            sum = sum + arry[index];
        }
        return sum;
    }

    public static int getSumOfEvenPosition(int[] arry) {
        int sum = 0;
        for (int index = 0; index < arry.length; index += 2) {
            sum = sum + arry[index];
        }
        return sum;
    }

    public static int getSumOfOddNumbers(int[] arry) {
        int sum = 0;
        for (int index = 0; index < arry.length; index += 1) {
            if (arry[index] % 2 == 1) sum += arry[index];
        }
        return sum;
    }

    public static int getSumOfEvenNumbers(int[] arry) {
        int sum = 0;
        for (int index = 0; index < arry.length; index += 1) {
            if (arry[index] % 2 == 0) sum += arry[index];
        }
        return sum;
    }

    public static String[] concatenateTwoArray(String[] character, int[] number) {
        String[] totalList = new String[character.length + number.length];
        int counter = 0;
        for (int i = 0; i < totalList.length; i+=2) {
            totalList[counter] = character[i];
        }
        int numbers = 1;
        for (int index = 0; index < number.length; index++) {
            totalList[numbers] = String.valueOf(number[index]) ;
            if (counter == number.length - 2) {
                numbers++;
            } else {
                numbers += 2;
            }
        }
        return totalList;
    }
}
