package my.sunghyuk.edabit.hard;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IntOrStringTests {
  @Test
  public void test1() {
    assertEquals("int", Program.intOrString(1));
  }

  @Test
  public void test2() {
    assertEquals("str", Program.intOrString("HELLO"));
  }

  @Test
  public void test3() {
    assertEquals("str", Program.intOrString("edabit"));
  }

  @Test
  public void test4() {
    assertEquals("int", Program.intOrString(873432874));
  }

  @Test
  public void test5() {
    assertEquals("int", Program.intOrString(5));
  }
}
