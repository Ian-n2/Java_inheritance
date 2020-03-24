import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
   Director director;


    @Before
    public void before() {
        director = new Director("Ian", 69, 5000, "code", 2000000);
    }
    @Test
    public void canGetBudget(){
        assertEquals(2000000, director.getBudget());
    }

    @Test
    public void getName(){
        assertEquals("Ian", director.getName());
    }

    @Test
    public void getNiNumber(){
        assertEquals(69, director.getNiNumber());
    }
    @Test
    public void getSalary(){
        assertEquals(5000, director.getSalary());
    }
    @Test
    public void GetDeptName(){
        assertEquals("code", director.getDeptName());
    }

    @Test
    public void testRaiseSalary(){
        director.raiseSalary(5000);
        assertEquals(10000, director.getSalary());
    }
    @Test
    public void testPaybonus(){
        director.payBonus();
        assertEquals(100, director.payBonus());
    }

}
