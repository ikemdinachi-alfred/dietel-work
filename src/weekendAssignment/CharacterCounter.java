package weekendAssignment;

import java.util.HashMap;
import java.util.Map;

public class CharacterCounter {
    public static void main(String[] args) {
        String inputStr = "semicolon.africa";
        Map<Character, Integer> result = countCharacters(inputStr);

        // Print the result in the specified format
        for (Map.Entry<Character, Integer> entry : result.entrySet()) {
            System.out.print("\"" + entry.getKey() + "\":" + entry.getValue() + ",");
        }

        // Output:
        // "s":1,"e":1,"m":1,"i":2,"c":2,"o":2,"n":1,".":1,"a":2,"f":1,"r":1
    }

    public static Map<Character, Integer> countCharacters(String inputString) {
        Map<Character, Integer> charCount = new HashMap<>();

        for (char character : inputString.toCharArray()) {
            charCount.put(character, charCount.getOrDefault(character, 0) + 1);
        }

        return charCount;
    }
}



