import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import staff.Employee;

public class EmployeeTest {

    Employee employee;

    @Before
    public void before(){
        employee = new Employee("Jeremy Corbyn", 123456, 30000);
    }

    @Test
    public void hasName(){
        Assert.assertEquals("Jeremy Corbyn", employee.getName());
    }
}
