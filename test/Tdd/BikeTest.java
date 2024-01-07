package Tdd;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BikeTest {
    @Test
    public void turnOnBike() {
        Bike myBike = new Bike();
        myBike.switchOn();
        assertTrue(true);

    }
    @Test

    public void turnOffBike() {
        Bike kimco = new Bike();
        kimco.switchOn();
        kimco.switchOff();
        assertTrue(true);
    }
    @Test

    public void increaseBikeSpeedWhenInGearOne() {
        Bike qlink = new Bike();
        for (int count = 1; count <= 17; count += 1) {
            qlink.increaseAcceleration();
        }
        assertEquals(17, qlink.getGear());
    }
    @Test

    public void decreaseBikeSpeedWhenInGearOne() {
        Bike myBike = new Bike();
        for (int count = 1; count < 15; count += 1) {
            myBike.increaseAcceleration();
        }
        for (int count = 1; count < 5; count++) {
            myBike.decreaseAcceleration();
        }
        assertEquals(10, myBike.getGear());

    }
    @Test

    public void increaseBikeSpeedWhenInGearTwo() {
        Bike myBike = new Bike();
        for (int count = 1; count <= 21; count++) {
            myBike.increaseAcceleration();
        }
        myBike.increaseAcceleration();
        myBike.increaseAcceleration();
        assertEquals(25, myBike.getGear());

    }
    @Test

    public void increaseBikeSpeedWhenInGearThree() {
        Bike myBike = new Bike();
        for (int count = 1; count <= 20; count++) {
            myBike.increaseAcceleration();
        }
        for (int count = 1; count <= 6; count++) {
            myBike.increaseAcceleration();
        }
        for (int count = 1; count <= 3; count += 1) {
            myBike.increaseAcceleration();
        }
        assertEquals(40, myBike.getGear());
    }
    @Test

    public void increaseBikeSpeedWhenInGearFour() {
        Bike myBike = new Bike();
        for (int count = 1; count <= 20; count++) {
            myBike.increaseAcceleration();
        }
        for (int count = 1; count <= 6; count++) {
            myBike.increaseAcceleration();
        }
        for (int count = 1; count <= 3; count += 1) {
            myBike.increaseAcceleration();
        }
        myBike.increaseAcceleration();
        myBike.increaseAcceleration();
        assertEquals(47, myBike.getGear());
    }
    @Test

    public void decreaseBikeSpeedFromGearFourBackToOne() {
        Bike myBike = new Bike();
        for (int count = 1; count <= 20; count++) {
            myBike.increaseAcceleration();
        }
        for (int count = 1; count <= 6; count++) {
            myBike.increaseAcceleration();
        }
        for (int count = 1; count <= 3; count += 1) {
            myBike.increaseAcceleration();
        }
        myBike.increaseAcceleration();
        myBike.increaseAcceleration();

        //decreasing speed
        for (int count = 1; count < 30; count += 1) {
            myBike.decreaseAcceleration();
           // System.out.println(myBike.getGear());
        }
        assertEquals(1,myBike.getGear());
    }
} 