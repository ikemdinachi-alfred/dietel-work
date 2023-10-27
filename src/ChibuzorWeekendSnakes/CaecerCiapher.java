package ChibuzorWeekendSnakes;

public class CaecerCiapher {


    public static void main(String[] args) {
        String plainText = "JOIN"; // Example input
        int shift = 1; // Shift value (can be adjusted)

        String encryptedText = encryptAlphabet(plainText, shift);
        System.out.println("Encrypted: " + encryptedText);
    }

    public static String encryptAlphabet(String input, int shift) {
        StringBuilder result = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                char base = Character.isUpperCase(ch) ? 'A' : 'a';
                char encryptedChar = (char) ((ch - base + shift) % 26 + base);
                result.append(encryptedChar);
            } else {
                result.append(ch); // Non-alphabetic characters remain unchanged
            }
        }
        return result.toString();
    }







    public static String decryptAlphabet(String input, int shift) {
        StringBuilder result = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                char base = Character.isUpperCase(ch) ? 'A' : 'a';
                char decryptedChar = (char) ((ch - base - shift + 26) % 26 + base);
                result.append(decryptedChar);
            } else {
                result.append(ch); // Non-alphabetic characters remain unchanged
            }
        }
        return result.toString();
    }
}
