package Tdd;

public class DrillerUTME {

    public static int paperCopies(int noOfCopies) {
        int percopy = 0;
        if (noOfCopies >= 1 && noOfCopies <= 4) { percopy = 2000;
        } else if (noOfCopies >= 5 && noOfCopies <= 9) {percopy = 1800;

        } else if (noOfCopies >= 10 && noOfCopies <= 29) {percopy = 1600;

        } else if (noOfCopies >= 30 && noOfCopies <= 49) {percopy = 1500;

        } else if (noOfCopies >= 50 && noOfCopies <= 99) {percopy = 1300;

        } else if (noOfCopies >= 100 && noOfCopies <= 199) {percopy = 1200;

        } else if (noOfCopies >= 200 && noOfCopies <= 499) {percopy = 1100;

        } else if (noOfCopies >= 500) {percopy = 1000;

        }
        return percopy;
    }
}

