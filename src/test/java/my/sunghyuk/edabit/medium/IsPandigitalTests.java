package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IsPandigitalTests {
  @Test
  public void test1() {
    assertEquals(false, Challenge.isPandigital(84847473937L));
  }

  @Test
  public void test2() {
    assertEquals(false, Challenge.isPandigital(546732965015L));
  }

  @Test
  public void test3() {
    assertEquals(true, Challenge.isPandigital(6781235184590L));
  }

  @Test
  public void test4() {
    assertEquals(true, Challenge.isPandigital(9432821089765L));
  }

  @Test
  public void test5() {
    assertEquals(false, Challenge.isPandigital(629764));
  }

  @Test
  public void test6() {
    assertEquals(false, Challenge.isPandigital(90864523148909L));
  }

  @Test
  public void test7() {
    assertEquals(false, Challenge.isPandigital(7296012));
  }

  @Test
  public void test8() {
    assertEquals(false, Challenge.isPandigital(647380265483206L));
  }

  @Test
  public void test9() {
    assertEquals(true, Challenge.isPandigital(38165975424790L));
  }

  @Test
  public void test10() {
    assertEquals(false, Challenge.isPandigital(8146327815320L));
  }

  @Test
  public void test11() {
    assertEquals(false, Challenge.isPandigital(768431605430L));
  }

  @Test
  public void test12() {
    assertEquals(true, Challenge.isPandigital(4920124852367763L));
  }

  @Test
  public void test13() {
    assertEquals(true, Challenge.isPandigital(60543981597247L));
  }

  @Test
  public void test14() {
    assertEquals(true, Challenge.isPandigital(10282343456789L));
  }
}