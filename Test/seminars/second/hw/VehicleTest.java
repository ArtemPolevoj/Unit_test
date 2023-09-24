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
}