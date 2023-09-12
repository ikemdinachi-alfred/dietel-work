package Tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BikeTest {
    @Test
    public void turnOnBike(){
        Bike myBike = new Bike();
        myBike.switchOn();
        assertTrue(true);

    }
    @Test
    public void turnOffBike(){
        Bike kimco= new Bike();
        kimco.switchOn();
        kimco.switchOff();
        assertTrue(true);
    }
    @Test
    public void increaseBikeSpeedWhenInGearOne(){
        Bike qlink= new Bike();
        for (int count=1; count<=17;count+=1){
            qlink.increaseAcceleration();
        }
        assertEquals(17, qlink.getSpeed());
    }
    @Test
    public void decreaseBikeSpeedWhenInGearOne(){
        Bike myBike = new Bike();
        for (int count=1; count<15;count+=1){
            myBike.increaseAcceleration();
        }
        for (int count=1; count<5;count++){
            myBike.decreaseAcceleration();
        }
        assertEquals(10,myBike.getSpeed());

    }
    @Test
    public void increaseBikeSpeedWhenInGearTwo(){
        Bike myBike = new Bike();
        for (int count = 0; count < 22; count++){
            myBike.increaseAcceleration();
        }
        myBike.increaseAcceleration();
        myBike.increaseAcceleration();
        myBike.increaseAcceleration();
        assertEquals(23,myBike.getSpeed());

    }
}
