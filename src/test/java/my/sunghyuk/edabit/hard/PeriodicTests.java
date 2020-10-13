package my.sunghyuk.edabit.hard;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PeriodicTests {
  @Test
  public void test1() {
    assertEquals(1, Challenge.periodic("2"));
  }

  @Test
  public void test2() {
    assertEquals(13, Challenge.periodic("22"));
  }

  @Test
  public void test3() {
    assertEquals(4, Challenge.periodic("157"));
  }

  @Test
  public void test4() {
    assertEquals(943, Challenge.periodic("1234567"));
  }

  @Test
  public void test5() {
    assertEquals(1, Challenge.periodic("1818"));
  }

  @Test
  public void test6() {
    assertEquals(778, Challenge.periodic("0000001"));
  }
}