 package ChibuzorWeekendSnakes;

 public class ArrayWeekendTask {

    public static int[] reverseArrayList(int[] array) {
        int reverser = 0;
        int[] arrayReverse = new int[array.length];
        for (int count = array.length - 1; count >= 0; count -= 1) {
            arrayReverse[reverser] = array[count];
            reverser++;
        }
        return arrayReverse;
    }

    public static int largestElement(int[] element) {
        int largest = 0;
        for (int count = 0; count < element.length; count++)
            if (element[count] > largest)
                largest = element[count];
        return largest;
    }

    public static boolean checkElementOccurred(int[] elements, int number) {
        boolean result = false;
        for (int count = 0; count < elements.length; count++) {
            if (elements[count] == number)
                result = true;
        }
        return result;
    }

    public static int[] oddPosition(int[] elements) {
        int result = 0;
        int[] odd = new int[elements.length / 2];
        for (int i = 1; i < elements.length; i += 2) {
            odd[result] = elements[i];
            result++;
        }
        return odd;
    }

    public static int[] EvenPosition(int[] elements) {
        int result = 0;
        int[] even = new int[elements.length / 2];
        for (int i = 0; i < elements.length; i += 2) {
            even[result] = elements[i];
            result++;
        }
        return even;
    }
    public static boolean stringPalindrome(String palindrome){
        for (int i = 0, j = palindrome.length() - 1; i < j; i++, j--) {
            if (palindrome.charAt(i) == palindrome.charAt(j))
                return true;
            else ;
        }
            return false;
    }


}