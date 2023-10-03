package Exercises;

public class ArrayOfScore {
    public static void main(String[] args) {
largestElement(new int[]{23, 78, 100, 40,90});
    }
    public static int largestElement(int[] array){
        int maximum =0;
        array = new int[]{23, 78, 90, 100, 40};
        for (int i = 0; i <array.length ; i++) {
            if (array.length > maximum) maximum = array.length;

        }
        System.out.println(maximum);
        return maximum;
    }
}
