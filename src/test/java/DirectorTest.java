import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Ronald Gump", 198765, 1000, "Madness", 3000000.0);
    }

    @Test
    public void getBudget(){
        assertEquals(new Double(3000000.0), director.getBudget());
    }

    @Test
    public void payBonus(){
        assertEquals(new Double(20), director.payBonus());
    }
}
