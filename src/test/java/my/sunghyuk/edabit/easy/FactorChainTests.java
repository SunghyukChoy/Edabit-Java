package my.sunghyuk.edabit.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FactorChainTests {
  @Test
  public void test1() {
    assertEquals(Challenge.factorChain(new int[] { 1, 2, 4, 8, 16, 32 }), true);
  }

  @Test
  public void test2() {
    assertEquals(Challenge.factorChain(new int[] { 1, 1, 1, 1, 1, 1 }), true);
  }

  @Test
  public void test3() {
    assertEquals(Challenge.factorChain(new int[] { 2, 4, 6, 7, 12 }), false);
  }

  @Test
  public void test4() {
    assertEquals(Challenge.factorChain(new int[] { 10, 1 }), false);
  }

  @Test
  public void test5() {
    assertEquals(Challenge.factorChain(new int[] { 10, 20, 30, 40 }), false);
  }

  @Test
  public void test6() {
    assertEquals(Challenge.factorChain(new int[] { 10, 20, 40 }), true);
  }

  @Test
  public void test7() {
    assertEquals(Challenge.factorChain(new int[] { 1, 1, 1, 1, 7, 49 }), true);
  }
}
