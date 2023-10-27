package Exercises;

public class IntegerCounter {
    public static int returnInteger(String[] arrayValues) {
        int add = 0;
        for (String saveArrayIndex : arrayValues) {
            for (int count = 0; count < saveArrayIndex.length(); count++) {
                char sliceSaveArrayIndex = saveArrayIndex.charAt(count);

                if (sliceSaveArrayIndex >= 48 && sliceSaveArrayIndex <= 58)
                    add += 1;
            }
        }
        return add;
    }
}
