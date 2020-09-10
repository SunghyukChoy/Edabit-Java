package my.sunghyuk.edabit.hard;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ReverseTests {
  @Test
  public void test1() {
    assertEquals("cb89a", Challenge.reverse("ab89c"));
  }

  @Test
  public void test2() {
    assertEquals("onm5lk923j", Challenge.reverse("jkl5mn923o"));
  }

  @Test
  public void test3() {
    assertEquals("123a45", Challenge.reverse("123a45"));
  }

  @Test
  public void test4() {
    assertEquals("c1b1a", Challenge.reverse("a1b1c"));
  }
}
