package selfPractice;

public class ArraySort {
    public static void main(String[] args) {
        int [] array = {100, 400, 500, 900, -455, -788, 830, 200, -23, 8};
        int t =1;

        for (int i = 0; i < array.length ; i++) {
            System.out.print( "Array index:"+ i + " =  " + array[i]);
            System.out.println();
        }
        for (int i = 0; i < array.length ; i++) {
            for (int j = array.length -1; j>=i ; j--) {
                if (array[j -1] > array[j])  t = array[j];
                array[j-1] = array[j];
                array[j] = t;

                System.out.print("Sorted array is:");
                for(int a =0; a < array.length; a++)
                    System.out.print(" " + array[a]);
                System.out.println();

            }

        }
    }
}
