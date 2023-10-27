package Exercises;

public class Palindrome {
    public static void main(String[] args) {

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


