package chapter6;

public class CelsiusTemperature {
    public static String sportWetherCondition(int celcius){
        if(celcius >= 20 & celcius <=30){
            return "'it's lovely weather for sports today!";
        }
        if(celcius >= 30 & celcius <=40){
            return "'it's reasonable weather for sports today!";
        }
        else return " please exercise with care today, watch out for the weather";

    }

    public static void main(String[] args) {
        String weather = sportWetherCondition(12);
        System.out.println(weather);
    }
}
