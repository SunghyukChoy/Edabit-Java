package my.sunghyuk.edabit.hard;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IsPowerfulTests {
  @Test
  public void test1() {
    assertEquals(true, Challenge.isPowerful(36));
  }

  @Test
  public void test2() {
    assertEquals(true, Challenge.isPowerful(27));
  }

  @Test
  public void test3() {
    assertEquals(true, Challenge.isPowerful(32));
  }

  @Test
  public void test4() {
    assertEquals(true, Challenge.isPowerful(72));
  }

  @Test
  public void test5() {
    assertEquals(true, Challenge.isPowerful(243));
  }

  @Test
  public void test6() {
    assertEquals(true, Challenge.isPowerful(968));
  }

  @Test
  public void test7() {
    assertEquals(false, Challenge.isPowerful(951));
  }

  @Test
  public void test8() {
    assertEquals(true, Challenge.isPowerful(144));
  }

  @Test
  public void test9() {
    assertEquals(false, Challenge.isPowerful(674));
  }

  @Test
  public void test10() {
    assertEquals(false, Challenge.isPowerful(600));
  }

  @Test
  public void test11() {
    assertEquals(true, Challenge.isPowerful(500));
  }

  @Test
  public void test12() {
    assertEquals(false, Challenge.isPowerful(320));
  }

  @Test
  public void test13() {
    assertEquals(false, Challenge.isPowerful(720));
  }
}
