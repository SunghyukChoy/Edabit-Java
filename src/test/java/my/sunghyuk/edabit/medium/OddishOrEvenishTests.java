package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class OddishOrEvenishTests {
  @Test
  public void test1() {
    assertEquals("Oddish", Challenge.oddishOrEvenish(43));
  }

  @Test
  public void test2() {
    assertEquals("Oddish", Challenge.oddishOrEvenish(373));
  }

  @Test
  public void test3() {
    assertEquals("Oddish", Challenge.oddishOrEvenish(55551));
  }

  @Test
  public void test4() {
    assertEquals("Oddish", Challenge.oddishOrEvenish(694));
  }

  @Test
  public void test5() {
    assertEquals("Evenish", Challenge.oddishOrEvenish(4433));
  }

  @Test
  public void test6() {
    assertEquals("Evenish", Challenge.oddishOrEvenish(11));
  }

  @Test
  public void test7() {
    assertEquals("Evenish", Challenge.oddishOrEvenish(211112));
  }
}