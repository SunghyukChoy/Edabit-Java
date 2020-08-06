package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PersistenceTests {
  @Test
  public void test1() {
    assertEquals(0, Challenge.persistence(0));
  }

  @Test
  public void test2() {
    assertEquals(1, Challenge.persistence(10));
  }

  @Test
  public void test3() {
    assertEquals(2, Challenge.persistence(25));
  }

  @Test
  public void test4() {
    assertEquals(3, Challenge.persistence(39));
  }

  @Test
  public void test5() {
    assertEquals(4, Challenge.persistence(77));
  }

  @Test
  public void test6() {
    assertEquals(5, Challenge.persistence(679));
  }

  @Test
  public void test7() {
    assertEquals(6, Challenge.persistence(6788));
  }

  @Test
  public void test8() {
    assertEquals(7, Challenge.persistence(68889));
  }

  @Test
  public void test9() {
    assertEquals(8, Challenge.persistence(2677889));
  }

  @Test
  public void test10() {
    assertEquals(9, Challenge.persistence(26888999));
  }

  @Test
  public void test11() {
    assertEquals(10, Challenge.persistence(3778888999L));
  }

  @Test
  public void test12() {
    assertEquals(11, Challenge.persistence(277777788888899L));
  }
}