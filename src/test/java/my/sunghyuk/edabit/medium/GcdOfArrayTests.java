package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GcdOfArrayTests {

  @Test
  public void test1() {
    assertEquals(10, Challenge.gcdOfArray(new int[] { 10, 20, 40 }));
  }

  @Test
  public void test2() {
    assertEquals(1, Challenge.gcdOfArray(new int[] { 7, 11 }));
  }

  @Test
  public void test3() {
    assertEquals(12, Challenge.gcdOfArray(new int[] { 156, 84, 60, 1188, 252 }));
  }

  @Test
  public void test4() {
    assertEquals(1, Challenge.gcdOfArray(new int[] { 1, 2, 3, 4, 5 }));
  }

  @Test
  public void test5() {
    assertEquals(7, Challenge.gcdOfArray(new int[] { 777, 77, 7, 14 }));
  }

  @Test
  public void test6() {
    assertEquals(43, Challenge.gcdOfArray(new int[] { 731, 43, 473, 2623 }));
  }

  @Test
  public void test7() {
    assertEquals(20, Challenge.gcdOfArray(new int[] { 20, 20, 40, 100 }));
  }
}