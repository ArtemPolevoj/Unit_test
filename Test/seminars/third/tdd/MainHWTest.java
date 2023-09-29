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
    void numberInInterval() {
    }
}