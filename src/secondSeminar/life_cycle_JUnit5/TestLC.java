package secondSeminar.life_cycle_JUnit5;

import org.junit.jupiter.api.*;
import secondSeminar.hw.Car;

public class TestLC {
    @BeforeAll
    static void setup() {
        System.out.println("@BeforeAll");
        Car car = new Car("testCar","testMadel", 2);

    }

    @BeforeEach
    void setupThis() {
        System.out.println("@BeforeEach");
    }

    @Test
    void testOne() {
        System.out.println("testOne");
    }

    @Test
    void testTwo() {
        System.out.println("testTwo");
    }

    @AfterEach
    void tearThis() {
        System.out.println("@AfterEach");
    }

    @AfterAll
    static void tear() {
        System.out.println("@AfterAll");
    }
}
