package selfPractice;
import java.util.Map;
import java.util.HashMap;

public class Mode {
        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 2, 2, 4, 5, 2, 6, 2, 7, 8, 9, 2, 10};

            int mostOccurred = findMostOccurredNumber(numbers);
            System.out.println("The most occurred number is: " + mostOccurred);
        }

        public static int findMostOccurredNumber(int[] numbers) {
            Map<Integer, Integer> countMap = new HashMap<>();

            for (int num : numbers) {
                countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            }

            int mostOccurredNumber = numbers[0];
            int maxCount = countMap.get(mostOccurredNumber);

            for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
                if (entry.getValue() > maxCount) {
                    mostOccurredNumber = entry.getKey();
                    maxCount = entry.getValue();
                }
            }

            return mostOccurredNumber;
        }
    }


