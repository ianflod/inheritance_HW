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
   public void managerHasDeptName(){
      assertEquals("Toys", manager.getDeptName());
   }



}
