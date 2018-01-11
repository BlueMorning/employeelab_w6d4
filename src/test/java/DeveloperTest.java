import org.junit.Before;
import techStaff.Developer;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Chris O'Dowd", 676767, 20000);
    }

}
