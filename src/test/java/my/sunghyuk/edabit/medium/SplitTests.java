package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SplitTests {
  @Test
  public void test1() {
    assertEquals("aebcd", Challenge.split("abcde"));
  }

  @Test
  public void test2() {
    assertEquals("eoHll!", Challenge.split("Hello!"));
  }

  @Test
  public void test3() {
    assertEquals("aeieWht's th tm?", Challenge.split("What's the time?"));
  }
}