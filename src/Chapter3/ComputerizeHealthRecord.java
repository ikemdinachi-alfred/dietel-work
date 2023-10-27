package Chapter3;

public class ComputerizeHealthRecord {
    private String firstName, lastName;
    private String day, month;
    private int year;
    private String gender;
    private double height;
    private int weight;

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getHeight() {
        return height / 100;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public String getBirthday() {
        return day + ":" + month + ":" + year;
    }
    public void setBirthday(String day, String month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public int getAge() {
        return 2023 - year;
    }
    
    public int getMaximumHeartRate() {
        return 220 - getAge();
    }

    public int getTargetHeartRate() {
        return (int) (0.7 * getMaximumHeartRate());
    }
    public double getBMI(){
        return (double) weight/(getHeight()*getHeight());
    }
}
