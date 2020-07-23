package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LunarSumTests {
  @Test
  public void test1() {
    assertEquals(347, Challenge.lunarSum(246, 317));
  }

  @Test
  public void test2() {
    assertEquals(154, Challenge.lunarSum(134, 54));
  }

  @Test
  public void test3() {
    assertEquals(140, Challenge.lunarSum(20, 140));
  }

  @Test
  public void test4() {
    assertEquals(1, Challenge.lunarSum(1, 1));
  }

  @Test
  public void test5() {
    assertEquals(198, Challenge.lunarSum(198, 44));
  }

  @Test
  public void test6() {
    assertEquals(36696, Challenge.lunarSum(36602, 696));
  }

  @Test
  public void test7() {
    assertEquals(8893, Challenge.lunarSum(91, 8823));
  }

  @Test
  public void test8() {
    assertEquals(128, Challenge.lunarSum(123, 8));
  }

  @Test
  public void test9() {
    assertEquals(98212289, Challenge.lunarSum(2289, 98211285));
  }

  @Test
  public void test10() {
    assertEquals(19, Challenge.lunarSum(9, 11));
  }

  @Test
  public void test11() {
    assertEquals(22, Challenge.lunarSum(11, 22));
  }
}