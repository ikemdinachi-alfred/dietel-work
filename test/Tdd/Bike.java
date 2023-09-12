package Tdd;


public class Bike {
    public boolean isOn;
    public int gear = 0;
    public int speed=0;

    public void switchOn() {
        this.isOn = true;
    }

    public void switchOff() {
        this.isOn = false;
    }

    public void increaseAcceleration() {
        if (speed >= 0 && speed <=20) {
            speed += 1;
        } else if ( speed > 20 && speed <= 30) {
            speed += 2;
        } else if ( speed > 30 && speed <= 40) {
            speed += 3;
        } else if ( speed > 40) {
            speed += 4;
        }
    }

    public void decreaseAcceleration() {
        if (speed>=0 && speed<=20){
        speed-=1;
        } else if ( speed>20 && speed<=30) {
            speed -= 2;
        } else if ( speed>30 && speed<=40) {
            speed -= 3;
        } else if ( speed>40){
            speed-=4;
        }
    }

    public int getSpeed() {
        return speed;
    }





}