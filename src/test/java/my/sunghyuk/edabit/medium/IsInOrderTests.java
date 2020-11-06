package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IsInOrderTests {

  @Test
  public void test1() {
    assertEquals(true, Program.isInOrder("abc"));
  }

  @Test
  public void test2() {
    assertEquals(false, Program.isInOrder("edabit"));
  }

  @Test
  public void test3() {
    assertEquals(true, Program.isInOrder("xyz"));
  }

  @Test
  public void test4() {
    assertEquals(true, Program.isInOrder("xyzz"));
  }

  @Test
  public void test5() {
    assertEquals(true, Program.isInOrder("123"));
  }

  @Test
  public void test6() {
    assertEquals(false, Program.isInOrder("321"));
  }
}
