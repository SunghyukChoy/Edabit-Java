package my.sunghyuk.edabit.hard;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IsAutobiographicalTests {
  @Test
  public void test1() {
    assertEquals(Challenge.isAutobiographical(12345), false);
  }

  @Test
  public void test2() {
    assertEquals(Challenge.isAutobiographical(1210), true);
  }

  @Test
  public void test3() {
    assertEquals(Challenge.isAutobiographical(638), false);
  }

  @Test
  public void test4() {
    assertEquals(Challenge.isAutobiographical(0), false);
  }

  @Test
  public void test5() {
    assertEquals(Challenge.isAutobiographical(2020), true);
  }

  @Test
  public void test6() {
    assertEquals(Challenge.isAutobiographical(3211000), true);
  }

  @Test
  public void test7() {
    assertEquals(Challenge.isAutobiographical(3434343), false);
  }

  @Test
  public void test8() {
    assertEquals(Challenge.isAutobiographical(2100), false);
  }
}
