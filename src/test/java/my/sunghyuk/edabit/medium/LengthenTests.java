package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LengthenTests {
  @Test
  public void test1() {
    assertEquals("abababa", Challenge.lengthen("abcdefg", "ab"));
  }

  @Test
  public void test2() {
    assertEquals("forestfo", Challenge.lengthen("ingenius", "forest"));
  }

  @Test
  public void test3() {
    assertEquals("clapclap", Challenge.lengthen("skipping", "clap"));
  }

  @Test
  public void test4() {
    assertEquals("kkkkkkkkk", Challenge.lengthen("k", "champagne"));
  }

  @Test
  public void test5() {
    assertEquals("DUHDUHDUH", Challenge.lengthen("DUH", "champagne"));
  }
}