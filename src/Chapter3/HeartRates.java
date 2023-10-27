package Chapter3;

public class HeartRates {
    private String fullName;
    private int day, month, year;


    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public void setBirthDay(int day, int month, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }
    public String getBirthday() {
        return day + ":" + month + ":" + year;
    }
    public int getAge() {
        return 2023 - year;
    }

    public String getFullName() {
        return fullName;
    }

    public int getMaximumHeartRate() {
        return 220 - getAge();
    }

    public int getTargetHeartRate() {
        return (int) (0.7 * getMaximumHeartRate());
    }
}
