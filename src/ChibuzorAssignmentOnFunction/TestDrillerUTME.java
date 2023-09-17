package ChibuzorAssignmentOnFunction;

public class TestDrillerUTME {
    public static void main(String[] args) {
        paperCopies(10);
    }

    public static int paperCopies(int noOfCopies) {
        int percopy = 0;
        if (noOfCopies >= 1 && noOfCopies <= 4) {
            percopy = 2000;
            System.out.println(percopy + " per copy");
        } else if (noOfCopies >= 5 && noOfCopies <= 9) {
            percopy = 1800;
            System.out.println(percopy + " per copy");
        } else if (noOfCopies >= 10 && noOfCopies <= 29) {
            percopy = 1600;
            System.out.println(percopy + " per copy");
        } else if (noOfCopies >= 30 && noOfCopies <= 49) {
            percopy = 1500;
            System.out.println(percopy + " per copy");
        } else if (noOfCopies >= 50 && noOfCopies <= 99) {
            percopy = 1300;
            System.out.println(percopy + " per copy");
        } else if (noOfCopies >= 100 && noOfCopies <= 199) {
            percopy = 1200;
            System.out.println(percopy + " per copy");
        } else if (noOfCopies >= 200 && noOfCopies <= 499) {
            percopy = 1100;
            System.out.println(percopy + " per copy");
        } else if (noOfCopies >= 500) {
            percopy = 1000;
            System.out.println(percopy + " per copy");
        }
        return percopy;
    }
}

