package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SumDigitTests {
  @Test
  public void test1() {
    assertEquals(15, Challenge.sumDigits(7, 8));
  }

  @Test
  public void test2() {
    assertEquals(29, Challenge.sumDigits(17, 20));
  }

  @Test
  public void test3() {
    assertEquals(6, Challenge.sumDigits(10, 12));
  }

  @Test
  public void test4() {
    assertEquals(56, Challenge.sumDigits(500, 506));
  }

  @Test
  public void test5() {
    assertEquals(9324, Challenge.sumDigits(66, 789));
  }

  @Test
  public void test6() {
    assertEquals(18, Challenge.sumDigits(10, 8));
  }

  @Test
  public void test7() {
    assertEquals(127, Challenge.sumDigits(43, 27));
  }
}