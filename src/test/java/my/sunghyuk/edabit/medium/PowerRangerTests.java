package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PowerRangerTests {
  @Test
  public void test1() {
    assertEquals(1, Challenge.powerRanger(5, 31, 33));
  }

  @Test
  public void test2() {
    assertEquals(3, Challenge.powerRanger(4, 250, 1300));
  }

  @Test
  public void test3() {
    assertEquals(2, Challenge.powerRanger(2, 49, 65));
  }

  @Test
  public void test4() {
    assertEquals(3, Challenge.powerRanger(3, 1, 27));
  }

  @Test
  public void test5() {
    assertEquals(1, Challenge.powerRanger(10, 1, 5));
  }

  @Test
  public void test6() {
    assertEquals(5, Challenge.powerRanger(1, 1, 5));
  }

  @Test
  public void test7() {
    assertEquals(10, Challenge.powerRanger(2, 1, 100));
  }
}
