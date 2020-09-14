package my.sunghyuk.edabit.hard;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BuggerTests {
  @Test
  public void test1() {
    assertEquals(3, Challenge.bugger(39));
  }

  @Test
  public void test2() {
    assertEquals(0, Challenge.bugger(4));
  }

  @Test
  public void test3() {
    assertEquals(2, Challenge.bugger(25));
  }

  @Test
  public void test4() {
    assertEquals(4, Challenge.bugger(999));
  }
}
