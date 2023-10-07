package seminars.sixth;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import secondSeminar.hw.Car;
import sixth.HwList;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestHwList {
     private ArrayList<Integer> temp;
    @BeforeEach
    void setUp(){
        temp = new HwList().getRandomInteger(50, 1, 3);
    }
    @Test
    void checkClass(){
        assertTrue(temp instanceof ArrayList<Integer>);
    }
    @Test
    void checkMin(){
        assertEquals(Collections.min(temp),1);
    }
    @Test
    void checkMax(){
        assertEquals(Collections.max(temp),2);
    }
    @Test
    void checkSize(){
        assertEquals(temp.size(),50);
    }
}
