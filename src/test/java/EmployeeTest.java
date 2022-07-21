import org.junit.Before;
import org.junit.Test;
import staff.Employee;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee;

    @Before
    public void before(){employee = new Manager("Dave", 3344, 10000, "Clubs");}

    @Test
    public void managerHasName(){
//        employee = new Manager("Dave", 3344, 10000, "Clubs");
        assertEquals("Dave", employee.getName());
    }

    @Test
    public void managerHasNINumber(){
//        employee = new Manager("Dave", 3344, 10000, "Clubs");
        assertEquals(3344, employee.getNumberNI());
    }

    @Test
    public void managerHasSalary(){
//        employee = new Manager("Dave", 3344, 10000, "Clubs");
        assertEquals(10000, employee.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        employee.salary += employee.raiseSalary(0.05);
        assertEquals(10500, employee.getSalary());
    }

//    @Test
//    public void canPayBonus(){
//        assertEquals(0.9, employee.payBonus());
//    }
}
