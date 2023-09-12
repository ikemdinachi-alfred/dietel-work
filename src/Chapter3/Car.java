package Chapter3;

public class Car {
    private String model;
    private String year;
    private double price;

    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(String year){
        this.year= year;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public String getModel(){
        return model;
    }

    public double getPrice() {
        return price;
    }
    public String getYear(){
        return year;
    }
}
