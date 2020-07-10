package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HighLowTests {
  @Test
  public void test1() {
    assertEquals("542 -214", Program.highLow("4 5 29 54 4 0 -214 542 -64 1 -3 6 -6"));
  }

  @Test
  public void test2() {
    assertEquals("1 -1", Program.highLow("1 -1"));
  }

  @Test
  public void test3() {
    assertEquals("1 1", Program.highLow("1 1"));
  }

  @Test
  public void test4() {
    assertEquals("-1 -1", Program.highLow("-1 -1"));
  }

  @Test
  public void test5() {
    assertEquals("1 -1", Program.highLow("1 -1 0"));
  }

  @Test
  public void test6() {
    assertEquals("1 0", Program.highLow("1 1 0"));
  }

  @Test
  public void test7() {
    assertEquals("0 -1", Program.highLow("-1 -1 0"));
  }

  @Test
  public void test8() {
    assertEquals("42 42", Program.highLow("42"));
  }
}