import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
   Manager manager;

   @Before
   public void before(){
      manager = new Manager("Zoe", 4455, 20000, "Toys");
   }


   @Test
   public void managerHasName(){
      assertEquals("Zoe", manager.getName());
   }

   @Test
   public void managerHasNINumber(){
      assertEquals(4455, manager.getNumberNI());
   }

   @Test
   public void managerHasSalary(){
      assertEquals(20000, manager.getSalary());
   }

   @Test
   public void canRaiseSalary(){
      manager.salary += manager.raiseSalary(0.05);
      assertEquals(21000, manager.getSalary());
   }
   @Test
   public void canPayBonus(){
      assertEquals(200, manager.payBonus(), 0.0);
   }

   @Test
   public void managerHasDeptName(){
      assertEquals("Toys", manager.getDeptName());
   }

}
