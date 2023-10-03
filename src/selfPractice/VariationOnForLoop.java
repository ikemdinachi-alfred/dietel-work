package selfPractice;

public class VariationOnForLoop {
    public static void main(String[] args) {
         multiplication();

    }

    public static void multiplication() {
        int i, j, k;
        for (i = 0, j = 30, k = 1; i < j; i++, j--, k += 2) {
            System.out.println(i + ", " + j + "  and  " + k);
        }
    }
}