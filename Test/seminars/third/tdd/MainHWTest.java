package seminars.third.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import thirdSeminar.hw.MainHW;

import static org.junit.jupiter.api.Assertions.*;

class MainHWTest {
    private MainHW mainHW;
    @BeforeEach
    void setUp() {
        mainHW = new MainHW();
    }

    @Test
    void chekEvenPositiveTrue() {
        assertTrue(mainHW.evenOddNumber(2));
    }
    @Test
    void chekEvenPositiveFalse() {
        assertFalse(mainHW.evenOddNumber(3));
    }
    @Test
    void chekEvenNegativeTrue() {
        assertTrue(mainHW.evenOddNumber(-2));
    }
    @Test
    void chekEvenNegativeFalse() {
        assertFalse(mainHW.evenOddNumber(-3));
    }

    @Test
    void interval24False() {
        assertFalse(mainHW.numberInInterval(24));
    }
    @Test
    void interval101False() {
        assertFalse(mainHW.numberInInterval(101));
    }
    @Test
    void interval25True() {
        assertTrue(mainHW.numberInInterval(25));
    }
    @Test
    void interval100True() {
        assertTrue(mainHW.numberInInterval(100));
    }
    @Test
    void interval50True() {
        assertTrue(mainHW.numberInInterval(50));
    }
}