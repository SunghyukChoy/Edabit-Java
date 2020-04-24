package my.sunghyuk.edabit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IndexMultiplierTests {

  @Test
  public void test1() {
    assertEquals(-4, Challenge.indexMultiplier(new int[]{9, 3, 7, -7}));
  }
  @Test
  public void test2() {
    assertEquals(8, Challenge.indexMultiplier(new int[]{3, 8, 6, -4}));
  }
  @Test
  public void test3() {
    assertEquals(-5, Challenge.indexMultiplier(new int[]{10, -9, -2, 0, 2}));
  }
  @Test
  public void test4() {
    assertEquals(-2, Challenge.indexMultiplier(new int[]{4, 4, 2, 2, -4}));
  }
  @Test
  public void test5() {
    assertEquals(14, Challenge.indexMultiplier(new int[]{9, 4, 7, 5, -1, -3}));
  }
  @Test
  public void test6() {
    assertEquals(45, Challenge.indexMultiplier(new int[]{-9, 5, 9, 5, -7, 7}));
  }
  @Test
  public void test7() {
    assertEquals(-1, Challenge.indexMultiplier(new int[]{-1, -2, 8, -5}));
  }
  @Test
  public void test8() {
    assertEquals(22, Challenge.indexMultiplier(new int[]{7, 10, -5, -4, 6, 2}));
  }
  @Test
  public void test9() {
    assertEquals(16, Challenge.indexMultiplier(new int[]{0, 1, 0, 1, 0, 1, 0, 1}));
  }
  @Test
  public void test10() {
    assertEquals(-8, Challenge.indexMultiplier(new int[]{-2, 5, -7, -23, 0, 14}));
  }
  @Test
  public void test11() {
    assertEquals(0, Challenge.indexMultiplier(new int[]{53, -43, 39, -2, -11, 3}));
  }
  @Test
  public void test12() {
    assertEquals(80, Challenge.indexMultiplier(new int[]{40, 32, -18, 48, -15}));
  }
  @Test
  public void test13() {
    assertEquals(170, Challenge.indexMultiplier(new int[]{1, -20, -11, 4, -12, 38, -30, 34}));
  }
  @Test
  public void test14() {
    assertEquals(24, Challenge.indexMultiplier(new int[]{-21, 30, 20, 6, -16}));
  }
  @Test
  public void test15() {
    assertEquals(-183, Challenge.indexMultiplier(new int[]{8, -24, -8, -23, 20, 32, -29, -20}));
  }
  @Test
  public void test16() {
    assertEquals(0, Challenge.indexMultiplier(new int[0]));
  }
}