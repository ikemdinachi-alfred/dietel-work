package Exercises;

public class Abs {
    public static int absoluteNumber(int number){
        if (number>=0 ) return number;
        else return - 1 * number;
    }
    public static double absoluteNumber(double number){
        if (number>=0 ) return number;
        else return - 1 * number;
    }
    public static float absoluteNumber(float number){
        if (number>=0 ) return number;
        else return - 1 * number;
    }
    public static byte absoluteNumber(byte number){
        if (number>=0 ) return number;
        else return (byte) (- 1 * number);
    }

}
