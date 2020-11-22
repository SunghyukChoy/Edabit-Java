package my.sunghyuk.edabit.easy;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class EndCoronaTests {

  @Test
  public void test01() {
    assertEquals(39, Program.endCorona(4000, 2000, 77000));
  }

  @Test
  public void test02() {
    assertEquals(51, Program.endCorona(3000, 2000, 50699));
  }

  @Test
  public void test03() {
    assertEquals(79, Program.endCorona(30000, 25000, 390205));
  }

  @Test
  public void test04() {
    assertEquals(4103, Program.endCorona(260000, 255000, 20511691));
  }

  @Test
  public void test05() {
    assertEquals(233, Program.endCorona(334, 231, 23954));
  }

  @Test
  public void test06() {
    assertEquals(103, Program.endCorona(487, 256, 23793));
  }
}
