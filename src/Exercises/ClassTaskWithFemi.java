package Exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class ClassTaskWithFemi {
    public static void main(String[] args) {
        System.out.println(stringPalindrome("madam"));
        System.out.println(stringReverse("We outside"));
        System.out.println(Arrays.toString(findDuplicates(new int[]{1, 2, 3, 3, 2, 4, 5, 6})));
        System.out.println(Arrays.toString(returnDominantNumber(new int[]{9, 3, 10, 3, 7, 4})));
        System.out.println(reportTarget("49465", 0, 1, 5));

    }

    public static boolean stringPalindrome(String palindrome) {
        for (int i = 0, j = palindrome.length() - 1; i < j; i++, j--) {
            if (palindrome.charAt(i) == palindrome.charAt(j))
                return true;
        }
        return false;
    }

    public static String stringReverse(String words) {
        StringBuilder newWords = new StringBuilder();
        for (int i = words.length() -1; i >= 0; i--) {
            newWords.append(words.charAt(i));
        }
        return newWords.toString();

    }


    public static int[] findDuplicates(int[] numbers) {
        // Create a hash set to store the unique elements of the array
        ArrayList<Integer> set = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int number : numbers) {
            if (set.contains(number)) {
                list.add(number);
            } else {
                set.add(number);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public static int[] returnDominantNumber(int[] numbers) {
        ArrayList<Integer> dominant = new ArrayList<>();
        int counter = 0;
        int count = 0;
        for (int index = 0; index < numbers.length; index++) {
            int currentElement = numbers[index];
            for (int index2 = index + 1; index2 < numbers.length; index2++) {
                counter++;
                if (currentElement > numbers[index2])
                    count++;
            }
            if (count == counter) {
                dominant.add(currentElement);
            }
            counter = 0;
            count = 0;

        }
        return convertToArray(dominant);

    }

    public static int[] convertToArray(ArrayList<Integer> input) {
        int[] array = new int[input.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.get(i);

        }
        return array;
    }


    public static boolean reportTarget(String number, int firstCompare, int secondCompare, int target) {

        for (int i = 0; i < number.length(); i++) {
            for (int j = 0; j < number.length(); j++) {
                if (i == firstCompare && j == secondCompare) {
                    if (target > Integer.parseInt(String.valueOf(number.charAt(i))) && target
                            < Integer.parseInt(String.valueOf(number.charAt(j)))) {
                        return (true);
                    }
                }
            }
        }
        return false;
    }

}