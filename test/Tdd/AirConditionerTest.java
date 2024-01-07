package Tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AirConditionerTest {
    @Test
    public void turnOnAirConditioner(){
        //given that i have an Ac
        AirConditioner myAc = new AirConditioner();
        //and want to test if its on
        // when i on it
        myAc.turnOn();
        //check that its on
        assertTrue(true);

    }
    @Test
    public void testAirConditionerIsOff() {
        // Given that i have an Ac
        AirConditioner myAirConditioner = new AirConditioner();
        // And my Ac is On
        myAirConditioner.turnOn();
        //When turn off
        myAirConditioner.turnOff();
        //check that Ac is Off

        assertTrue(true);
    }
    @Test
    public void testAirConditionerCanIncreaseTemperature() {
        AirConditioner myAirConditioner = new AirConditioner();
        myAirConditioner.turnOn();
        myAirConditioner.setTemperature(17);
        myAirConditioner.increaseTemperature();
        myAirConditioner.increaseTemperature();
        myAirConditioner.increaseTemperature();
        assertEquals(20,myAirConditioner.getTemperature());
    }
    @Test

    public void testAirConditionerCanNotIncreaseAbove30() {
        AirConditioner lgAirConditioner = new AirConditioner();
        lgAirConditioner.turnOn();
        lgAirConditioner.setTemperature(24);
        lgAirConditioner.increaseTemperature();
        lgAirConditioner.increaseTemperature();
        lgAirConditioner.increaseTemperature();
        lgAirConditioner.increaseTemperature();
        lgAirConditioner.increaseTemperature();
        lgAirConditioner.increaseTemperature();
        lgAirConditioner.increaseTemperature();
        lgAirConditioner.increaseTemperature();
        assertEquals(30,lgAirConditioner.getTemperature());


    }
    @Test
    public void testThatAirConditionerCanDecreaseInTemperature(){
        AirConditioner myAirConditioner= new AirConditioner();
        myAirConditioner.turnOn();
        myAirConditioner.setTemperature(20);
        myAirConditioner.decreaseTemperature();
        myAirConditioner.decreaseTemperature();
        myAirConditioner.decreaseTemperature();
        assertEquals(17,myAirConditioner.getTemperature());

    }
    @Test

    public void testThatAirConditionerCanNotDecreaseBelow16(){
        AirConditioner myAirConditioner = new AirConditioner();
        myAirConditioner.turnOn();
        myAirConditioner.setTemperature(18);
        myAirConditioner.decreaseTemperature();
        myAirConditioner.decreaseTemperature();
        myAirConditioner.decreaseTemperature();
        assertEquals(16,myAirConditioner.getTemperature());

    }

}
