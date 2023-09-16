package Tdd;

public class BackToSenderLogisticServicesPay {
    public static void main(String[] args) {
        
    }
    public static int ridersPayment(int successfulDelivery) {
        int pay = 0;
        if (successfulDelivery < 50) {
            pay = successfulDelivery * 160 + 5000;
        } else if (successfulDelivery>=50 && successfulDelivery<=59) {
            pay = successfulDelivery * 200 + 5000;
        } else if (successfulDelivery >=60 && successfulDelivery<=69) {
            pay = successfulDelivery * 250 + 5000;
        } else if (successfulDelivery>=70) {
            pay= successfulDelivery * 500 + 5000;

        }
        return pay;
    }
}