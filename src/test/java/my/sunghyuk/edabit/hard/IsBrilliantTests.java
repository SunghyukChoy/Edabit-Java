package my.sunghyuk.edabit.hard;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IsBrilliantTests {
  @Test
  public void test1() {
    assertEquals(false, Challenge.isBrilliant(11));
  }

  @Test
  public void test2() {
    assertEquals(true, Challenge.isBrilliant(9));
  }

  @Test
  public void test3() {
    assertEquals(true, Challenge.isBrilliant(21));
  }

  @Test
  public void test4() {
    assertEquals(false, Challenge.isBrilliant(22));
  }

  @Test
  public void test5() {
    assertEquals(false, Challenge.isBrilliant(1001));
  }

  @Test
  public void test6() {
    assertEquals(false, Challenge.isBrilliant(77));
  }

  @Test
  public void test7() {
    assertEquals(true, Challenge.isBrilliant(209));
  }

  @Test
  public void test8() {
    assertEquals(false, Challenge.isBrilliant(211));
  }

  @Test
  public void test9() {
    assertEquals(false, Challenge.isBrilliant(780));
  }

  @Test
  public void test10() {
    assertEquals(true, Challenge.isBrilliant(703));
  }

  @Test
  public void test11() {
    assertEquals(false, Challenge.isBrilliant(1000));
  }

  @Test
  public void test12() {
    assertEquals(true, Challenge.isBrilliant(1003));
  }

  @Test
  public void test13() {
    assertEquals(false, Challenge.isBrilliant(1008));
  }

  @Test
  public void test14() {
    assertEquals(true, Challenge.isBrilliant(16459));
  }

  @Test
  public void test15() {
    assertEquals(false, Challenge.isBrilliant(348166));
  }

  @Test
  public void test16() {
    assertEquals(true, Challenge.isBrilliant(768017));
  }
}
