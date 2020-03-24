import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manger manger;


    @Before
    public void before() {
        manger = new Manger("Ian", 69, 5000, "code");
    }
        @Test
        public void getName(){
            assertEquals("Ian", manger.getName());
        }

        @Test
        public void getNiNumber(){
        assertEquals(69, manger.getNiNumber());
        }
        @Test
        public void getSalary(){
        assertEquals(5000, manger.getSalary());
        }
        @Test
        public void GetDeptName(){
        assertEquals("code", manger.getDeptName());
        }

        @Test
        public void testRaiseSalary(){
            manger.raiseSalary(5000);
            assertEquals(10000, manger.getSalary());
        }
        @Test
        public void testPayRise(){
            manger.payBonus();
            assertEquals(50,manger.payBonus());
        }
    }

