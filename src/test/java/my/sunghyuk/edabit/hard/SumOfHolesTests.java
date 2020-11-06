package my.sunghyuk.edabit.hard;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SumOfHolesTests {

  @Test
  public void test1() {
    assertEquals(0, Challenge.sumOfHoles(1));
  }

  @Test
  public void test2() {
    assertEquals(1, Challenge.sumOfHoles(4));
  }

  @Test
  public void test3() {
    assertEquals(2, Challenge.sumOfHoles(6));
  }

  @Test
  public void test4() {
    assertEquals(4, Challenge.sumOfHoles(8));
  }

  @Test
  public void test5() {
    assertEquals(5, Challenge.sumOfHoles(9));
  }

  @Test
  public void test6() {
    assertEquals(6, Challenge.sumOfHoles(10));
  }

  @Test
  public void test7() {
    assertEquals(90, Challenge.sumOfHoles(88));
  }

  @Test
  public void test8() {
    assertEquals(22893, Challenge.sumOfHoles(10000));
  }

  @Test
  public void test9() {
    assertEquals(27991, Challenge.sumOfHoles(12345));
  }
}