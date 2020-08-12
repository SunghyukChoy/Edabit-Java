package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CombinationsTests {
  @Test
  public void test1() {
    assertEquals(2, Challenge.combinations(2));
  }

  @Test
  public void test2() {
    assertEquals(6, Challenge.combinations(2, 3));
  }

  @Test
  public void test3() {
    assertEquals(15, Challenge.combinations(3, 5));
  }

  @Test
  public void test4() {
    assertEquals(625, Challenge.combinations(5, 5, 5, 5));
  }

  @Test
  public void test5() {
    assertEquals(162, Challenge.combinations(3, 6, 9));
  }

  @Test
  public void test6() {
    assertEquals(3628800, Challenge.combinations(2, 3, 4, 5, 6, 7, 8, 9, 10));
  }

  @Test
  public void test7() {
    assertEquals(120, Challenge.combinations(4, 5, 6));
  }

  @Test
  public void test8() {
    assertEquals(1680, Challenge.combinations(5, 6, 7, 8));
  }

  @Test
  public void test9() {
    assertEquals(42, Challenge.combinations(6, 7, 0));
  }
}