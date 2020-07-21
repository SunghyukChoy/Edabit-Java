package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IsKaprekarTests {
  @Test
  public void test1() {
    assertEquals(true, Challenge.isKaprekar(1));
  }

  @Test
  public void test2() {
    assertEquals(false, Challenge.isKaprekar(2));
  }

  @Test
  public void test3() {
    assertEquals(false, Challenge.isKaprekar(3));
  }

  @Test
  public void test4() {
    assertEquals(false, Challenge.isKaprekar(5));
  }

  @Test
  public void test5() {
    assertEquals(true, Challenge.isKaprekar(9));
  }

  @Test
  public void test6() {
    assertEquals(false, Challenge.isKaprekar(65));
  }

  @Test
  public void test7() {
    assertEquals(true, Challenge.isKaprekar(99));
  }

  @Test
  public void test8() {
    assertEquals(true, Challenge.isKaprekar(297));
  }

  @Test
  public void test9() {
    assertEquals(false, Challenge.isKaprekar(348));
  }

  @Test
  public void test10() {
    assertEquals(false, Challenge.isKaprekar(666));
  }

  @Test
  public void test11() {
    assertEquals(false, Challenge.isKaprekar(1441));
  }

  @Test
  public void test12() {
    assertEquals(true, Challenge.isKaprekar(77778));
  }

  @Test
  public void test13() {
    assertEquals(false, Challenge.isKaprekar(102102));
  }

  @Test
  public void test14() {
    assertEquals(true, Challenge.isKaprekar(533170));
  }
}