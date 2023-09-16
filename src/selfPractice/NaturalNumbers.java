package selfPractice;
/* wRITE A JAVA PROGRAM THAT PRINTS ALL THE NUMBERS FROM 0 TO 6 EXCEPT 3 AND 6

 */
public class NaturalNumbers {
    public static void main(String[] args) {

        for (int count=0; count<7; count+=1)
            if (count!=3 && count!=6)
                System.out.print(count);
    }
}
