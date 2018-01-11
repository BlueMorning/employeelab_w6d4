import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Jonhny Flair", 654321, 75000, "Liberty");
    }

    @Test
    public void hasDeptName(){
        assertEquals("Liberty", manager.getDeptName());
    }
}
