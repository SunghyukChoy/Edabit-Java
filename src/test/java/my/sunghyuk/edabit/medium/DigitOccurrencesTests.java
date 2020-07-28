package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DigitOccurrencesTests {
  @Test
  public void test1() {
    assertEquals(6, Challenge.digitOccurrences(51, 55, 5));
  }

  @Test
  public void test2() {
    assertEquals(0, Challenge.digitOccurrences(1, 8, 9));
  }

  @Test
  public void test3() {
    assertEquals(1, Challenge.digitOccurrences(71, 77, 2));
  }

  @Test
  public void test4() {
    assertEquals(2, Challenge.digitOccurrences(1, 14, 4));
  }

  @Test
  public void test5() {
    assertEquals(11, Challenge.digitOccurrences(20, 30, 2));
  }

  @Test
  public void test6() {
    assertEquals(10, Challenge.digitOccurrences(18, 37, 3));
  }

  @Test
  public void test7() {
    assertEquals(63, Challenge.digitOccurrences(5, 335, 6));
  }

  @Test
  public void test8() {
    assertEquals(3, Challenge.digitOccurrences(-19, 19, 0));
  }

  @Test
  public void test9() {
    assertEquals(1, Challenge.digitOccurrences(-8, -1, 8));
  }

  @Test
  public void test10() {
    assertEquals(0, Challenge.digitOccurrences(-5, -5, 4));
  }

  @Test
  public void test11() {
    assertEquals(1, Challenge.digitOccurrences(-5, -5, 5));
  }

  @Test
  public void test12() {
    assertEquals(5, Challenge.digitOccurrences(-50, -45, 4));
  }

  @Test
  public void test13() {
    assertEquals(190, Challenge.digitOccurrences(-500, -45, 4));
  }
}