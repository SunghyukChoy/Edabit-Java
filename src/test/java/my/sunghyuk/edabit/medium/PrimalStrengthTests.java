package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrimalStrengthTests {
  @Test
  public void test1() {
    assertEquals("Balanced", Challenge.primalStrength(5));
  }

  @Test
  public void test2() {
    assertEquals("Balanced", Challenge.primalStrength(211));
  }

  @Test
  public void test3() {
    assertEquals("Balanced", Challenge.primalStrength(593));
  }

  @Test
  public void test4() {
    assertEquals("Strong", Challenge.primalStrength(1693));
  }

  @Test
  public void test5() {
    assertEquals("Strong", Challenge.primalStrength(599));
  }

  @Test
  public void test6() {
    assertEquals("Strong", Challenge.primalStrength(2203));
  }

  @Test
  public void test7() {
    assertEquals("Weak", Challenge.primalStrength(19));
  }

  @Test
  public void test8() {
    assertEquals("Weak", Challenge.primalStrength(2971));
  }

  @Test
  public void test9() {
    assertEquals("Weak", Challenge.primalStrength(1493));
  }
}