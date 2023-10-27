package Exercises;

import junit.framework.TestCase;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ClassTaskWithFemiTest extends TestCase {
    public void testReturnDominantNumber(){
        int [] input = {9,3, 10, 7, 4};
        int[] result = ClassTaskWithFemi.returnDominantNumber(input);
        int [] expected = {10, 7, 4};
        assertArrayEquals(result,expected);
    }
    public void testPalindrome(){
        String expected = "madam";
        String result = String.valueOf(ClassTaskWithFemi.stringPalindrome(expected));
        assertTrue(Boolean.parseBoolean(result));
    }
    public void testReverseOfString(){
        String expected = "We outside";
        String result = "edistuo eW";
        String actual = ClassTaskWithFemi.stringReverse(expected);
       assertEquals(result,actual);

    }
    public void testForNumbersThatAreDuplicate(){
        int [] actual = {2,2,3,5,6,8,9,7,8,5,7};
        int [] expected = {2,8,5,7};
        int [] result = ClassTaskWithFemi.findDuplicates(actual);
        assertArrayEquals(expected,result);
    }
 public void testForTargetIndex(){
       boolean result = ClassTaskWithFemi.reportTarget("78695",2,3,7);
        assertTrue(result);
 }
}