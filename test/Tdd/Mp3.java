package Tdd;

public class Mp3 {
    private String name;
    private int volume = 0;

    private boolean isOn;


    public void switchOn() {isOn = true;
    }

    public void switchOff() {isOn = false;
    }

    public void increaseVolume() {
        if (volume >= 0 && volume < 10) volume += 1;
    }

    public void decreaseVolume() {
        if (volume > 0 && volume < 10) volume-= 1;
    }

    public int getVolume() {
        return volume;
    }

}
