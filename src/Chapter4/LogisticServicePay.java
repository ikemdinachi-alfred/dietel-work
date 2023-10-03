package Chapter4;

public class LogisticServicePay {
    public static void main(String[] args) {
        paymentAmount(80);
    }

        public static void paymentAmount (int collection){
       int salary=0;
            if (collection < 50) {
                 salary = collection * 160 + 5000;
                System.out.println(salary);
            } else if (collection >= 50 && collection <= 59) {
                 salary = collection * 200 + 5000;
                System.out.println(salary);
            } else if (collection >= 60 && collection <= 69) {
                 salary = collection * 250 + 5000;
                System.out.println(salary);
            } else if (collection >= 70) {
                 salary = collection * 500 + 5000;
                System.out.println(salary);
            }
        }



}
