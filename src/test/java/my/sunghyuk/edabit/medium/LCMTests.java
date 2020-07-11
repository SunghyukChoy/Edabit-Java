package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LCMTests {

  @Test
  public void test1() {
    assertEquals(30, Challenge.lcm(6, 10));
  }

  @Test
  public void test2() {
    assertEquals(60, Challenge.lcm(30, 60));
  }

  @Test
  public void test3() {
    assertEquals(3330000, Challenge.lcm(10000, 333));
  }

  @Test
  public void test4() {
    assertEquals(675, Challenge.lcm(75, 135));
  }

  @Test
  public void test5() {
    assertEquals(102, Challenge.lcm(102, 2));
  }
}