package seminars.sixth;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sixth.HwList;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

public class TestHwList {
    private ArrayList<Integer> temp;

    @BeforeEach
    void setUp() {
        temp = new HwList().getRandomInteger(50, 1, 3);
    }

    @Test
    void checkClass() {
        assertTrue(temp instanceof ArrayList<Integer>);
    }

    @Test
    void checkMin() {
        assertTrue(Collections.min(temp) >= 1);
    }

    @Test
    void checkMax() {
        assertTrue(Collections.max(temp) < 3);
    }

    @Test
    void checkSize() {
        assertEquals(temp.size(), 50);
    }
}