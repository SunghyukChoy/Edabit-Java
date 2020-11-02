
package my.sunghyuk.edabit.hard;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GapfulTests {

  @Test
  public void test1() {
    assertEquals(100, Challenge.gapful(25));
  }

  @Test
  public void test2() {
    assertEquals(100, Challenge.gapful(100));
  }

  @Test
  public void test3() {
    assertEquals(105, Challenge.gapful(103));
  }

  @Test
  public void test4() {
    assertEquals(1441, Challenge.gapful(1442));
  }

  @Test
  public void test5() {
    assertEquals(3333, Challenge.gapful(3345));
  }

  @Test
  public void test6() {
    assertEquals(4773, Challenge.gapful(4780));
  }

  @Test
  public void test7() {
    assertEquals(3078, Challenge.gapful(3078));
  }
}