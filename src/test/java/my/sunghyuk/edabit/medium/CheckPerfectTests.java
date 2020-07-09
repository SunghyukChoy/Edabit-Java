package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CheckPerfectTests {
  @Test
  public void test1() {
    assertEquals(true, Challenge.checkPerfect(6));
  }

  @Test
  public void test2() {
    assertEquals(true, Challenge.checkPerfect(28));
  }

  @Test
  public void test3() {
    assertEquals(true, Challenge.checkPerfect(496));
  }

  @Test
  public void test4() {
    assertEquals(true, Challenge.checkPerfect(8128));
  }

  @Test
  public void test5() {
    assertEquals(true, Challenge.checkPerfect(33550336));
  }

  @Test
  public void test6() {
    assertEquals(false, Challenge.checkPerfect(12));
  }

  @Test
  public void test7() {
    assertEquals(false, Challenge.checkPerfect(97));
  }

  @Test
  public void test8() {
    assertEquals(false, Challenge.checkPerfect(481));
  }

  @Test
  public void test9() {
    assertEquals(false, Challenge.checkPerfect(1001));
  }

  @Test
  public void test10() {
    assertEquals(false, Challenge.checkPerfect(55555));
  }
}