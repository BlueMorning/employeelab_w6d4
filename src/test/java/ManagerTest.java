import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Tony Blair", 654321, 75000, "Larceny");
    }

    @Test
    public void hasDeptName(){
        assertEquals("Larceny", manager.getDeptName());
    }
}
