import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import staff.Employee;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee;

    @Before
    public void before(){
        employee = new Employee("Jeremy Corbyn", 123456, 30000);
    }

    @Test
    public void hasName(){
        assertEquals("Jeremy Corbyn", employee.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals(123456, employee.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(30000, employee.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        employee.raiseSalary(0.01);
        assertEquals(30300, employee.getSalary());
    }

    @Test
    public void canPayBonus(){
        assertEquals(new Double(300), employee.payBonus(0.01));
    }
}
