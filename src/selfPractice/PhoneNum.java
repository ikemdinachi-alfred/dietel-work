package selfPractice;


import java.util.Scanner;

public class PhoneNum {
    public String returnNumber(String number){
        if (mtnNumber(number)) return "Mtn";
        if (gLoNumber(number)) return "glo";
        if (airTelNumber(number)) return "Airtel";
        if (nineMobile(number)) return "9mobile";
        return "invalid number, check if number is correct";
    }
    public String firstFour(String number){
        return number.substring(0,4);
    }

    private boolean mtnNumber(String phoneNumber) {
        String[] checkMtn = { "0803", "0806", "0703", "0706", "0813", "0816", "0810", "0814", "0903", "0906", "0913", "0916", "07025", "07026","0704"};
        for (int mTn = 0; mTn < checkMtn.length; mTn++) {
            if (checkMtn[mTn].equals(firstFour(phoneNumber))) {
                return true;
            }
        }
        return false;
    }

        private boolean gLoNumber (String phoneNumber ) {
            String[] checkGlo = {"0805", "0705", "0807", "0815", "0811", "0905","0915"};
            for (int gLo = 0; gLo < checkGlo.length; gLo++) {
                if (checkGlo[gLo].equals(firstFour(phoneNumber))) {
                    return true;
                }
            }
            return false;
        }
    private boolean airTelNumber (String phoneNumber ) {
        String[] checkGlo = {"0802"," 0901", "0808", "0708", "0812","0701","0902", "0904", "0907", "0912"};
        for (int airTel = 0; airTel < checkGlo.length; airTel++) {
            if (checkGlo[airTel].equals(firstFour(phoneNumber))) {
                return true;
            }
        }
        return false;
    }

   private boolean nineMobile (String phoneNumber ) {
        String[] nineMobiles = {"0809", "0818", "0817", "0909", "0908"};

        for (int nineMobile = 0; nineMobile < nineMobiles.length; nineMobile++) {
            if (nineMobiles[nineMobile].equals(firstFour(phoneNumber))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        PhoneNum myPhone = new PhoneNum();

        System.out.println(" Enter phone number to know your network: ");
        String number= input.nextLine();
        System.out.println(myPhone.returnNumber(number));


    }


    }