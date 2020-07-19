package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NumTypeTests {
  @Test
  public void test1() {
    assertEquals("Perfect", Challenge.numType(6));
  }

  @Test
  public void test2() {
    assertEquals("Amicable", Challenge.numType(2924));
  }

  @Test
  public void test3() {
    assertEquals("Neither", Challenge.numType(5010));
  }

  @Test
  public void test4() {
    assertEquals("Perfect", Challenge.numType(8128));
  }

  @Test
  public void test5() {
    assertEquals("Amicable", Challenge.numType(10744));
  }

  @Test
  public void test6() {
    assertEquals("Amicable", Challenge.numType(17296));
  }

  @Test
  public void test7() {
    assertEquals("Neither", Challenge.numType(498));
  }

  @Test
  public void test8() {
    assertEquals("Amicable", Challenge.numType(66992));
  }

  @Test
  public void test9() {
    assertEquals("Neither", Challenge.numType(5566));
  }
}