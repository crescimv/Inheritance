import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person p1;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        p1 = new Person("000001", "Miles", "Tester", "Mr.", 2003);
    }

    @org.junit.jupiter.api.Test
    void setID() {
        p1.setID("000001");
        assertEquals("000001", p1.getID());
    }

    @org.junit.jupiter.api.Test
    void setFirstName() {
        p1.setFirstName("Miles");
        assertEquals("Miles", p1.getFirstName());
    }

    @org.junit.jupiter.api.Test
    void setLastName() {
        p1.setLastName("Tester");
        assertEquals("Tester", p1.getLastName());
    }

    @org.junit.jupiter.api.Test
    void setTitle() {
        p1.setTitle("Mr.");
        assertEquals("Mr.", p1.getTitle());
    }

    @org.junit.jupiter.api.Test
    void setYOB() {
        p1.setYOB(2003);
        assertEquals(2003, p1.getYOB());
    }

    @org.junit.jupiter.api.Test
    void toCSV() {
        assertEquals("000001,Miles,Tester,Mr.,2003", p1.toCSV());
    }
}