package seminars.second.hw;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import secondSeminar.hw.Car;
import secondSeminar.hw.Motorcycle;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    static Car car;
    static Motorcycle motorcycle;

    @BeforeAll
    static void setUpp() {
        car = new Car("Company", "Model", 5);
        motorcycle = new Motorcycle("Company", "Model", 5);
    }

    /**
     * Проверить, что экземпляр объекта Car также является экземпляром
     * транспортного средства (используя оператор instanceof).
     */
    @Test
    void catInstanceOfCar() {
        assertTrue(car instanceof Car);

    }

    /**
     * Проверить, что объект Car создается с 4-мя колесами.
     */
    @Test
    void carHas4wheels() {
        assertEquals(car.getNumWheels(), 4);
    }

    /**
     * Проверить, что объект Motorcycle создается с 2-мя колесами.
     */
    @Test
    void motorcycleHas2wheels() {
        assertEquals(motorcycle.getNumWheels(), 2);
    }

    /**
     * Проверить, что объект Car развивает скорость 60 в режиме тестового
     * вождения (используя метод testDrive()).
     */
    @Test
    void carSpeed60testDrive() {
        car.testDrive();

        assertEquals(car.getSpeed(), 60);
    }

    /**
     * Проверить, что объект Motorcycle развивает скорость 75 в режиме
     * тестового вождения (используя метод testDrive()).
     */
    @Test
    void motorcycleSpeed75testDrive() {
        motorcycle.testDrive();

        assertEquals(motorcycle.getSpeed(), 75);
    }

    /**
     * Проверить, что в режиме парковки (сначала testDrive, потом park,
     * т.е. эмуляция движения транспорта) машина останавливается (speed = 0).
     */
    @Test
    void carStartParkSpeed0() {
        car.testDrive();
        car.park();
        assertEquals(car.getSpeed(), 0);
    }
}