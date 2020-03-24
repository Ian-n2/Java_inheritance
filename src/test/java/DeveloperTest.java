import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;


    @Before
    public void before() {
        developer = new Developer("Ian", 69, 1000);
    }

    @Test
    public void setNoName(){
        developer.setName("");
        assertEquals("INVALID NAME", developer.getName());
    }

    @Test
    public void getName(){
        assertEquals("Ian", developer.getName());
    }

    @Test
    public void getNiNumber(){
        assertEquals(69, developer.getNiNumber());
    }
    @Test
    public void getSalary(){
        assertEquals(1000, developer.getSalary());
    }

    @Test
    public void testRaiseSalary(){
        developer.raiseSalary(5000);
        assertEquals(6000, developer.getSalary());
    }
    @Test
    public void testPayRise(){
        developer.payBonus();
        assertEquals(10,developer.payBonus());
    }
}
