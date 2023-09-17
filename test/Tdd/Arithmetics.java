package Tdd;

public class Arithmetics {

    public boolean isEven(int number) {
        boolean result = false;
        if (number % 2 == 0) {
            result = true;
            System.out.println(result);
        } else if (number % 2 == 1) {
            result = false;
            System.out.println(result);
        }
        return result;
    }
    public boolean isPrimeNumber (int number){
        if (number <= 1)
            return false;
        for (int count = 2; count < number; count++)
            if (number % count == 0)
                return false;
        return true;
    }
    public int subtraction (int number1, int number2){
        int result=0;
        if (number1 >number2) {
            result = number1 - number2;
        } else if (number2 > number1) {
            result = (number2 - number1);
           result=Math.abs(result);}
        return result;
    }
    public int divide (int number1,int number2){
        int result =0;
      // result= Math.round(result);
        result =  number1 / number2;
        return result;
    }
    public int facorOf(int number){

        int factor=0;
        for( int count=1; count<=number; count++){
            if (number% count==0) factor= factor+1;
        }
        System.out.println(factor);

        return factor;
    }

     public int isSquare (int number){
        int result =0;
        result= number* number;
         return result;
     }
     public int isPalindrome (int number){
        boolean result = false;

        int  first = number/10000;

         int second = number/ 1000 % 10;

         int third = number / 100 % 10;

         int fourth = number / 10 % 10;

         int fifth = number % 10;

         if (first + second + third + fourth + fifth == fifth + fourth + third + second + first){
             result= true;
        }else result =false;

         return 0 ;
     }
     public int factorialOf(int number){
        int factorial=1;
        for (int count=1; count <=number; count+=1){
            factorial=factorial*count;
        }return factorial;
     }
}




