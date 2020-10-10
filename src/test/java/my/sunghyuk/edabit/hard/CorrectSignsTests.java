package my.sunghyuk.edabit.hard;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CorrectSignsTests {
  @Test
  public void test1() {
    assertEquals(true, Challenge.correctSigns("3 < 7 < 11"));
  }

  @Test
  public void test2() {
    assertEquals(false, Challenge.correctSigns("13 > 44 > 33 > 1"));
  }

  @Test
  public void test3() {
    assertEquals(true, Challenge.correctSigns("1 < 2 < 6 < 9 > 3"));
  }

  @Test
  public void test4() {
    assertEquals(true, Challenge.correctSigns("4 > 3 > 2 > 1"));
  }

  @Test
  public void test5() {
    assertEquals(true, Challenge.correctSigns("5 < 7 > 1"));
  }

  @Test
  public void test6() {
    assertEquals(false, Challenge.correctSigns("5 > 7 > 1"));
  }

  @Test
  public void test7() {
    assertEquals(false, Challenge.correctSigns("9 < 9"));
  }

  @Test
  public void test8() {
    assertEquals(false, Challenge.correctSigns("10 < 20 > 17 < 19 > 21"));
  }
}
