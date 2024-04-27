package lambdas;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Chapter17 {
    public static void main(String[] args) {
        OptionalDouble result =  IntStream.rangeClosed(1,20).average();
      System.out.println(result);
    }
}
