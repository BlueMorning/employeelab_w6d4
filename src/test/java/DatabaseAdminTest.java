import org.junit.Before;
import techStaff.DatabaseAdmin;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Richard Ayoade", 565656, 20000);
    }
}
