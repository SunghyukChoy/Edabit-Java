package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FirstNVowelsTests {
  @Test
  public void test1() {
    assertEquals("aei", Challenge.firstNVowels("sharpening skills", 3));
  }

  @Test
  public void test2() {
    assertEquals("aoeau", Challenge.firstNVowels("major league", 5));
  }

  @Test
  public void test3() {
    assertEquals("aa", Challenge.firstNVowels("crabby patty", 2));
  }

  @Test
  public void test4() {
    assertEquals("i", Challenge.firstNVowels("shrimp", 1));
  }

  @Test
  public void test5() {
    assertEquals("invalid", Challenge.firstNVowels("shrimpy", 2));
  }

  @Test
  public void test6() {
    assertEquals("invalid", Challenge.firstNVowels("hostess", 5));
  }
}