package Chapter3;

public class Clock {
    private int hour=0;
    private int minute=0;
    private int second=0;

    public void setHour(int hour ) {
        this.hour = hour;
    }
        public void setMinute(int minute){
            this.minute = minute;
        }
        public void setSecond(int second){
        this.second=second;
    }

    public int getHour() {
        if (hour>23)
        return 0;
        return hour;
    }

    public int getMinute() {
        if (minute > 59)
            return 0;
        return minute;
    }



    public int getSecond() {
        if (second>59)
            return 0;
        return second;
    }
}
