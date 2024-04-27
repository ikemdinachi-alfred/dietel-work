package ClassTask;

import java.util.ArrayList;
import java.util.List;

public class NumberMultiplier {
        public static List<Integer> multiplyAndAdd(List<Integer> numbers) {
            List<Integer> resultList = new ArrayList<>();

            for (Integer num : numbers) {
                resultList.add(num);
                int multiplied = num * 2;
                resultList.add(multiplied);
            }

            return resultList;
        }

        public static void main(String[] args) {
            List<Integer> inputList = List.of(4, 5, 8);
            List<Integer> resultList = multiplyAndAdd(inputList);
            System.out.println(resultList);
        }
    }

