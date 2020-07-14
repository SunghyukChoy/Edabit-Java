package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LongestZeroTests {

  @Test
  public void test1() {
    assertEquals("0000", Challenge.longestZero("01100001011000"));
  }

  @Test
  public void test2() {
    assertEquals("00", Challenge.longestZero("100100100"));
  }

  @Test
  public void test3() {
    assertEquals("0", Challenge.longestZero("111101"));
  }

  @Test
  public void test4() {
    assertEquals("0000000000", Challenge.longestZero("1000000000011101"));
  }

  @Test
  public void test5() {
    assertEquals("00000", Challenge.longestZero("100001110000100000"));
  }

  @Test
  public void test6() {
    assertEquals("00", Challenge.longestZero("101001101"));
  }

  @Test
  public void test7() {
    assertEquals("0", Challenge.longestZero("101010101"));
  }

  @Test
  public void test8() {
    assertEquals("00", Challenge.longestZero("1001001"));
  }

  @Test
  public void test9() {
    assertEquals("", Challenge.longestZero("111111"));
  }
}