package Chapter4;

public class Brake {
    public static void main(String[] args) {
        int number=50;
        int count=0;
        for (;;number++){
            if (number==80)
                break;
                count++;
            }
        System.out.println(count+ ": This is me");
        }
    }

