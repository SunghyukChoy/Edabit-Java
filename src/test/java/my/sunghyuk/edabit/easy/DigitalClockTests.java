package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DigitalClockTests {
  @Test
  public void test1() {
    assertEquals("01:23:45", Challenge.digitalClock(5025));
  }

  @Test
  public void test2() {
    assertEquals("00:10:00", Challenge.digitalClock(87000));
  }

  @Test
  public void test3() {
    assertEquals("10:10:10", Challenge.digitalClock(36610));
  }

  @Test
  public void test4() {
    assertEquals("11:11:11", Challenge.digitalClock(40271));
  }

  @Test
  public void test5() {
    assertEquals("00:00:01", Challenge.digitalClock(1));
  }

  @Test
  public void test6() {
    assertEquals("00:00:00", Challenge.digitalClock(0));
  }

  @Test
  public void test7() {
    assertEquals("23:59:59", Challenge.digitalClock(86399));
  }
}
