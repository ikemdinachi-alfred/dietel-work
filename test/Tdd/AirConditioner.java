package Tdd;

public class AirConditioner {
    private int temperature=16;
    private boolean isOn=false;

    public void turnOn(){
        this.isOn=true;
    }
    public void turnOff(){
        this.isOn=false;
    }

    public void setTemperature(int newTemperature) {
        if(this.isOn == true && newTemperature >= 16 && newTemperature < 30)
            this.temperature = newTemperature;
    }
    public void increaseTemperature(){
        if (isOn == true && temperature >= 16 && temperature < 30)
            temperature=temperature+1;
    }
    public void decreaseTemperature(){
        if (isOn && temperature>16 && temperature <30)
            temperature=temperature-1;
    }
    public int getTemperature() {
        return temperature;

    }

}



