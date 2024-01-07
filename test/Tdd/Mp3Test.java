package Tdd;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class  Mp3Test {
    public void turnOnMp3(){
        //Given that i have a brand new Mp3
        Mp3 myMp3 = new Mp3 ();
        myMp3.switchOn();
        assertTrue(true);
    }
    public void turnOffMp3(){
        Mp3 myMp3 = new Mp3();
        myMp3.switchOff();
        assertTrue(true);

    }
    public void increaseMp3Volume(){
        Mp3 myMp3 = new Mp3();
        myMp3.increaseVolume();
        for (int count=1; count<=5;count++){
            myMp3.increaseVolume();
        }
        myMp3.increaseVolume();
        myMp3.increaseVolume();
        myMp3.increaseVolume();
        assertEquals(9,myMp3.getVolume());
    }
    public void Mp3VolumeCanNotBeMoreThan10(){
        Mp3 myMp3 =new Mp3();
        for (int count=1; count<=15;count+=1){
            myMp3.increaseVolume();

        }
        assertEquals(10,myMp3.getVolume());
        System.out.println(myMp3.getVolume());

    }
    public void decreaseMp3Volume(){
        Mp3 myMp3 = new Mp3();
        myMp3.increaseVolume();
        for (int count=1; count<=5; count++){
            myMp3.increaseVolume();
        }
        myMp3.decreaseVolume();
        myMp3.decreaseVolume();
        myMp3.decreaseVolume();
       assertEquals(3,myMp3.getVolume());

    }
     public void checkThatVolumeCanNotBeNegative(){
        Mp3 myMp3= new Mp3();
        myMp3.increaseVolume();
        for (int count=1; count<=3;count+=1){
            myMp3.decreaseVolume();
            assertEquals(0,myMp3.getVolume());

        }
     }
}
