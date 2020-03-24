import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;


    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Pete", 70, 1000);
    }

    @Test
    public void getName() {
        assertEquals("Pete", databaseAdmin.getName());
    }

    @Test
    public void getNiNumber() {
        assertEquals(70, databaseAdmin.getNiNumber());
    }

    @Test
    public void getSalary() {
        assertEquals(1000, databaseAdmin.getSalary());
    }

    @Test
    public void testRaiseSalary() {
        databaseAdmin.raiseSalary(5000);
        assertEquals(6000, databaseAdmin.getSalary());
    }

    @Test
    public void testPayRise() {
        databaseAdmin.payBonus();
        assertEquals(10, databaseAdmin.payBonus());
    }
}

