import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {

    SalaryWorker s1;
    Worker w1;

    @BeforeEach
    void setUp() {
        s1 = new SalaryWorker("000001", "Miles", "Worker", "Mr.", 2003, 120000);
        w1 = new Worker("000001", "Miles", "Worker", "Mr.", 2003, 25.00);
    }

    @Test
    void setAnnualSalary() {
        s1.setAnnualSalary(120000);
        assertEquals(120000, s1.getAnnualSalary());
    }

    @Test
    void calculateWeeklyPay() {
        assertEquals(2307.69, s1.calculateWeeklyPay(40), 0.01);
    }

    @Test
    void displayWeeklyPay() {
        assertEquals("Total Pay per 1 week out of 52 weeks: 2307.6923076923076", s1.displayWeeklyPay(40));
        assertEquals("Total Pay per 1 week out of 52 weeks: 2307.6923076923076", s1.displayWeeklyPay(50));
    }
}