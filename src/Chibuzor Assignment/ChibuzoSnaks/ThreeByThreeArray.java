package ChibuzoSnaks;

public class ThreeByThreeArray {
    public static void main(String[] args) {


        char[][] multiMatrix = {{'x', 'o', 'x'}, {'x', 'x', 'o'}, {'o', 'x', 'x'}};
        for (int count = 0; count < multiMatrix.length; count++) {
            for (int counter = 0; counter < multiMatrix.length; counter++) {
                System.out.print(multiMatrix[count][counter]  +" ");

            }
            System.out.println();
        }

    }
}