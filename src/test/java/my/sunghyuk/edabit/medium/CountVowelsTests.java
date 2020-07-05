package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CountVowelsTests {

  @Test
  public void test1() {
    assertEquals(2, Program.countVowels("apple"));
  }

  @Test
  public void test2() {
    assertEquals(5, Program.countVowels("cheesecake"));
  }

  @Test
  public void test3() {
    assertEquals(3, Program.countVowels("martini"));
  }

  @Test
  public void test4() {
    assertEquals(0, Program.countVowels("rhythm"));
  }

  @Test
  public void test5() {
    assertEquals(0, Program.countVowels(""));
  }

  @Test
  public void test6() {
    assertEquals(0, Program.countVowels("b"));
  }

  @Test
  public void test7() {
    assertEquals(1, Program.countVowels("a"));
  }

  @Test
  public void test8() {
    assertEquals(0, Program.countVowels("bbbbbb"));
  }

  @Test
  public void test9() {
    assertEquals(1, Program.countVowels("bbbbba"));
  }

  @Test
  public void test10() {
    assertEquals(1, Program.countVowels("abbbb"));
  }

  @Test
  public void test11() {
    assertEquals(1, Program.countVowels("bbbab"));
  }

  @Test
  public void test12() {
    assertEquals(2, Program.countVowels("bbaab"));
  }

  @Test
  public void test13() {
    assertEquals(3, Program.countVowels("baabab"));
  }
}