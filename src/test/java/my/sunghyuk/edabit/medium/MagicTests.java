package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MagicTests {
  @Test
  public void test1() {
    assertEquals(true, Challenge.magic("1 1 2011"));
  }

  @Test
  public void test2() {
    assertEquals(false, Challenge.magic("4 1 2001"));
  }

  @Test
  public void test3() {
    assertEquals(true, Challenge.magic("2 4 2008"));
  }

  @Test
  public void test4() {
    assertEquals(true, Challenge.magic("3 3 2009"));
  }

  @Test
  public void test5() {
    assertEquals(true, Challenge.magic("5 2 2010"));
  }

  @Test
  public void test6() {
    assertEquals(false, Challenge.magic("1 2 2011"));
  }

  @Test
  public void test7() {
    assertEquals(false, Challenge.magic("9 2 2011"));
  }

  @Test
  public void test8() {
    assertEquals(false, Challenge.magic("1 4 2011"));
  }
}