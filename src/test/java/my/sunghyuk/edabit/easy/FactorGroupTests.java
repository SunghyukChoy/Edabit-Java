package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FactorGroupTests {

  @Test
  public void test1() {
    assertEquals("even", Challenge.factorGroup(33));
  }

  @Test
  public void test2() {
    assertEquals("odd", Challenge.factorGroup(36));
  }

  @Test
  public void test3() {
    assertEquals("even", Challenge.factorGroup(7));
  }

  @Test
  public void test4() {
    assertEquals("odd", Challenge.factorGroup(1));
  }

  @Test
  public void test5() {
    assertEquals("even", Challenge.factorGroup(19));
  }

  @Test
  public void test6() {
    assertEquals("even", Challenge.factorGroup(27));
  }

  @Test
  public void test7() {
    assertEquals("odd", Challenge.factorGroup(100));
  }

  @Test
  public void test8() {
    assertEquals("even", Challenge.factorGroup(18));
  }

  @Test
  public void test9() {
    assertEquals("odd", Challenge.factorGroup(16));
  }
}
