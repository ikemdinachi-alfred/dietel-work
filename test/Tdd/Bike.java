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
        if ( speed >= 0 && speed <=20) {
            gear= speed += 1;
        } else if ( speed >20 && speed <= 30) {
            gear=speed += 2;
        } else if ( speed > 30 && speed <= 40) {
            gear=speed += 3;
        } else if ( speed > 40) {
            gear=speed += 4;
        }
    }

    public void decreaseAcceleration() {
        if (speed>=0 && speed<=20){
        gear=speed-=1;
        } else if ( speed>20 && speed<=30) {
           gear= speed -= 2;
        } else if ( speed>30 && speed<=40) {
            gear=speed -= 3;
        } else if ( speed>40){
            gear=speed-=4;
        }
    }

    public int getGear() {
        return gear;
    }





}