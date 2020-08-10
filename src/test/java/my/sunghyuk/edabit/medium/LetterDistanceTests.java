package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LetterDistanceTests {
  @Test
  public void test1() {
    assertEquals(11, Challenge.letterDistance("house", "fly"));
  }

  @Test
  public void test2() {
    assertEquals(1, Challenge.letterDistance("sharp", "sharq"));
  }

  @Test
  public void test3() {
    assertEquals(5, Challenge.letterDistance("abcde", "bcdef"));
  }

  @Test
  public void test4() {
    assertEquals(4, Challenge.letterDistance("abcde", "a"));
  }

  @Test
  public void test5() {
    assertEquals(8, Challenge.letterDistance("abcde", "e"));
  }

  @Test
  public void test6() {
    assertEquals(32, Challenge.letterDistance("abcde", "Abcde"));
  }

  @Test
  public void test7() {
    assertEquals(36, Challenge.letterDistance("abcde", "A"));
  }

  @Test
  public void test8() {
    assertEquals(67, Challenge.letterDistance("very", "fragile"));
  }
}