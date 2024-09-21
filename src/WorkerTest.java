import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {
    Worker w1;

    @BeforeEach
    void setUp() {
        w1 = new Worker("000001", "Miles", "Worker", "Mr.", 2003, 25.00);
    }

    @Test
     void setHourlyPayRate() {
        w1.setHourlyPayRate(25.00);
        assertEquals(25.00, w1.getHourlyPayRate());
    }

    @Test
    void calculateWeeklyPay() {
        assertEquals(1000, w1.calculateWeeklyPay(40));
    }

    @Test
    void displayWeeklyPay() {
        assertEquals("", w1.displayWeeklyPay(40));
        assertEquals("", w1.displayWeeklyPay(50));
    }
}