package Tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TelevisionTest {
        public void testTelevisionIsOn() {
            Television myTelevision = new Television();
            myTelevision.turnOn();
            assertTrue(true);

        }

        public void testThatTelevisionIsOff() {
            Television myTelevision = new Television();
            myTelevision.turnOff();
            assertTrue(true);
        }


        public void testThatTelevisionIncreaseChannelIsFunctional() {
            Television myTelevision = new Television();
            myTelevision.turnOn();
            myTelevision.setChannel(100);
            myTelevision.channelUp();
            myTelevision.channelUp();
            assertEquals(102, myTelevision.getChannel());
        }

        public void testThatTelevisionChannelCannotBeMoreThan120() {
            Television myTelevision = new Television();
            myTelevision.turnOn();
            myTelevision.setChannel(118);
            myTelevision.channelUp();
            myTelevision.channelUp();
            myTelevision.channelUp();
            myTelevision.channelUp();
            assertEquals(120, myTelevision.getChannel());
        }

        public void testThatTelevisionChannelCanBeDecreased() {
            Television myTelevision = new Television();
            myTelevision.turnOn();
            myTelevision.setChannel(115);
            myTelevision.channelDown();
            myTelevision.channelDown();
            assertEquals(113, myTelevision.getChannel());


        }
        public void testThatTelevisionChannelCanNotBeDecreasedBelow1(){
            Television myTelevision = new Television();
            myTelevision.turnOn();;
            myTelevision.setChannel(5);
            myTelevision.channelDown();
            myTelevision.channelDown();
            myTelevision.channelDown();
            myTelevision.channelDown();
            myTelevision.channelDown();
            myTelevision.channelDown();
            assertEquals(1,myTelevision.getChannel());
        }

        public void testThatVolumeIncreases(){
            Television myTelevision= new Television();

            myTelevision.turnOn();
            myTelevision.setVolume(3);
            myTelevision.increaseVolume();
            myTelevision.increaseVolume();
            assertEquals(5,myTelevision.getVolumeLevel());

        }
        public void testThatTelevisionVolumeCanBedecreased() {
            Television myTelevision = new Television();
            myTelevision.turnOn();
            myTelevision.setVolume(5);
            myTelevision.increaseVolume();
            myTelevision.decreaseVolume();
            myTelevision.decreaseVolume();
            myTelevision.decreaseVolume();
            assertEquals(3, myTelevision.getVolumeLevel());

        }

        public void testThatVolumeCantBaIncreasedAbove7(){
            Television myTelevision= new Television();
            myTelevision.turnOn();
            myTelevision.setVolume(5);
            myTelevision.increaseVolume();
            myTelevision.increaseVolume();
            myTelevision.increaseVolume();
            myTelevision.increaseVolume();
            assertEquals(7,myTelevision.getVolumeLevel());
        }
        public void testThatVolumeCanNotBeDecreasedBelow1(){
            Television myTelevision = new Television();
            myTelevision.setVolume(3);
            myTelevision.decreaseVolume();
            myTelevision.decreaseVolume();
            myTelevision.decreaseVolume();
            myTelevision.decreaseVolume();
            assertEquals(1,myTelevision.getVolumeLevel());
        }
    }

