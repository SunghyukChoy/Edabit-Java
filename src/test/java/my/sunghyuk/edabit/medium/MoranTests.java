package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MoranTests {

  @Test
  public void test1() {
    assertEquals("H", Challenge.moran(132));
  }

  @Test
  public void test2() {
    assertEquals("M", Challenge.moran(133));
  }

  @Test
  public void test3() {
    assertEquals("Neither", Challenge.moran(134));
  }

  @Test
  public void test4() {
    assertEquals("M", Challenge.moran(3033));
  }

  @Test
  public void test5() {
    assertEquals("H", Challenge.moran(3030));
  }

  @Test
  public void test6() {
    assertEquals("Neither", Challenge.moran(491423));
  }

  @Test
  public void test7() {
    assertEquals("M", Challenge.moran(20937));
  }
}