package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class InatorInatorTests {
  @Test
  public void test1() {
    assertEquals("Shrinkinator 6000", Challenge.inatorInator("Shrink"));
  }

  @Test
  public void test2() {
    assertEquals("Doominator 4000", Challenge.inatorInator("Doom"));
  }

  @Test
  public void test3() {
    assertEquals("EvilClone-inator 9000", Challenge.inatorInator("EvilClone"));
  }

  @Test
  public void test4() {
    assertEquals("Destroyinator 7000", Challenge.inatorInator("Destroy"));
  }

  @Test
  public void test5() {
    assertEquals("a-inator 1000", Challenge.inatorInator("a"));
  }

  @Test
  public void test6() {
    assertEquals("Shrekinator 5000", Challenge.inatorInator("Shrek"));
  }

  @Test
  public void test7() {
    assertEquals("bEE-inator 3000", Challenge.inatorInator("bEE"));
  }

  @Test
  public void test8() {
    assertEquals("CAPITALISE-inator 10000", Challenge.inatorInator("CAPITALISE"));
  }
}