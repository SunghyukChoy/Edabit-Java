package my.sunghyuk.edabit.hard;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CarryDigitsTests {
  @Test
  public void test1() {
    assertEquals(1, Challenge.carryDigits(36, 135));
  }

  @Test
  public void test2() {
    assertEquals(3, Challenge.carryDigits(671, 329));
  }

  @Test
  public void test3() {
    assertEquals(0, Challenge.carryDigits(1111, 3333));
  }

  @Test
  public void test4() {
    assertEquals(1, Challenge.carryDigits(4, 5268));
  }

  @Test
  public void test5() {
    assertEquals(2, Challenge.carryDigits(53214, 16905));
  }

  @Test
  public void test6() {
    assertEquals(3, Challenge.carryDigits(53214, 56905));
  }

  @Test
  public void test7() {
    assertEquals(0, Challenge.carryDigits(515, 4));
  }

  @Test
  public void test8() {
    assertEquals(1, Challenge.carryDigits(515, 90));
  }

  @Test
  public void test9() {
    assertEquals(1, Challenge.carryDigits(63223, 70000));
  }

  @Test
  public void test10() {
    assertEquals(3, Challenge.carryDigits(477, 577));
  }

  @Test
  public void test11() {
    assertEquals(2, Challenge.carryDigits(809, 517));
  }
}
