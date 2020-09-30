package my.sunghyuk.edabit.hard;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CommonLastVowelTests {
  @Test
  public void test1() {
    assertEquals("o", Challenge.commonLastVowel("Hello World!"));
  }

  @Test
  public void test2() {
    assertEquals("e", Challenge.commonLastVowel("Watch the characters dance!"));
  }

  @Test
  public void test3() {
    assertEquals("i", Challenge.commonLastVowel("OOI UUI EEI AAI"));
  }

  @Test
  public void test4() {
    assertEquals("a", Challenge.commonLastVowel("amy and acts"));
  }

  @Test
  public void test5() {
    assertEquals("u", Challenge.commonLastVowel("munch munch munch tasty tasty brunch"));
  }
}
