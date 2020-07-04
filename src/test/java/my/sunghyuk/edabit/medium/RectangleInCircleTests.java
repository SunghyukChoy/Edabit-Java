package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RectangleInCircleTests {
  @Test
  public void test1() {
    assertEquals(true, Challenge.rectangleInCircle(5, 12, 7));
  }

  @Test
  public void test2() {
    assertEquals(false, Challenge.rectangleInCircle(5, 12, 6));
  }

  @Test
  public void test3() {
    assertEquals(true, Challenge.rectangleInCircle(3, 7, 4));
  }

  @Test
  public void test4() {
    assertEquals(false, Challenge.rectangleInCircle(4, 7, 4));
  }

  @Test
  public void test5() {
    assertEquals(true, Challenge.rectangleInCircle(11, 1, 6));
  }

  @Test
  public void test6() {
    assertEquals(false, Challenge.rectangleInCircle(21, 12, 12));
  }
}