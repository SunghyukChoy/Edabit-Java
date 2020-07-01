package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CollatzConjectureTests {
  @Test
  public void test1() {
    assertEquals(1, Challenge.collatzConjecture(2));
  }

  @Test
  public void test2() {
    assertEquals(7, Challenge.collatzConjecture(3));
  }

  @Test
  public void test3() {
    assertEquals(6, Challenge.collatzConjecture(10));
  }

  @Test
  public void test4() {
    assertEquals(8, Challenge.collatzConjecture(6));
  }

  @Test
  public void test5() {
    assertEquals(125, Challenge.collatzConjecture(345));
  }

  @Test
  public void test6() {
    assertEquals(22, Challenge.collatzConjecture(72));
  }
}