import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        int count=0;
        int number=500;
        while (number>100){
            number-=50;
            count++;

        }
        System.out.println(count+ ": God is faithful");
    }
}
