package Chapter3;

public class ClockTest {
    public static void main(String[] args) {
        Clock myClock= new Clock();

        myClock.setSecond(59);
        myClock.setHour(23);
        myClock.setMinute(59);

        System.out.println(myClock.getHour()+ ":"+ myClock.getMinute()+ ":" + myClock.getSecond());
    }
}
