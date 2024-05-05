import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class RangeInputTest {
    RangeInput passengerTemperature1, passengerTemperature2, driverTemperature;

    @BeforeEach
    void setUp() {
        passengerTemperature1 = new RangeInput(50, 70);
        passengerTemperature2 = new RangeInput(55, 75);
        driverTemperature = new RangeInput();
    }

    @Test
    void getCurrentTemperatureForPassenger1() {
        passengerTemperature1.up();
        passengerTemperature1.up();
        passengerTemperature1.up();
        passengerTemperature1.up();
        assertEquals(64, passengerTemperature1.getCurrentTemperature());
        passengerTemperature1.down();
        passengerTemperature1.down();
        passengerTemperature1.up();
        assertEquals(63, passengerTemperature1.getCurrentTemperature());
    }
    @Test
    void getCurrentTemperatureForPassenger2() {
    }
    @Test
    void getCurrentTemperatureForPassenger4() {
    }
    @Test
    void getCurrentTemperatureForPassenger5() {
    }
    @Test
    void getCurrentTemperatureForPassenger6() {
    }
    @Test
    void getCurrentTemperatureForDriver1() {
    }
    @Test
    void getCurrentTemperatureForDriver2() {
    }
}