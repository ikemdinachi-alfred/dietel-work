package Chapter3;

public class HeartRates {
    private String firstName, lastName;
    private int date,month,year;

    public void setDate(int date){
        this.date=date;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName=lastName;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getAge() {
        return date+month+year;
    }
    public String fullName(){
        return firstName+lastName;
    }
}
