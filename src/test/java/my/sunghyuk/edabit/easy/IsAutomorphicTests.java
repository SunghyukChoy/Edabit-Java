package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IsAutomorphicTests {
  @Test
  public void test1() {
    assertEquals(true, Challenge.isAutomorphic(0));
  }

  @Test
  public void test2() {
    assertEquals(true, Challenge.isAutomorphic(1));
  }

  @Test
  public void test3() {
    assertEquals(true, Challenge.isAutomorphic(5));
  }

  @Test
  public void test4() {
    assertEquals(true, Challenge.isAutomorphic(6));
  }

  @Test
  public void test5() {
    assertEquals(true, Challenge.isAutomorphic(25));
  }

  @Test
  public void test6() {
    assertEquals(true, Challenge.isAutomorphic(76));
  }

  @Test
  public void test7() {
    assertEquals(true, Challenge.isAutomorphic(7109376));
  }

  @Test
  public void test8() {
    assertEquals(false, Challenge.isAutomorphic(36));
  }

  @Test
  public void test9() {
    assertEquals(false, Challenge.isAutomorphic(100));
  }

  @Test
  public void test10() {
    assertEquals(false, Challenge.isAutomorphic(11));
  }

  @Test
  public void test11() {
    assertEquals(false, Challenge.isAutomorphic(6025));
  }

  @Test
  public void test12() {
    assertEquals(false, Challenge.isAutomorphic(3));
  }

  @Test
  public void test13() {
    assertEquals(false, Challenge.isAutomorphic(1376));
  }
}