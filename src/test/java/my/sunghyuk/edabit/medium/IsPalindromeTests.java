package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IsPalindromeTests {
  @Test
  public void test1() {
    assertEquals(true, Program.isPalindrome("abcba"));
  }
  
  @Test
  public void test2() {
    assertEquals(true, Program.isPalindrome("abbba"));
  }

  @Test
  public void test3() {
    assertEquals(true, Program.isPalindrome("abbbba"));
  }

  @Test
  public void test4() {
    assertEquals(false, Program.isPalindrome("abccdba"));
  }

  @Test
  public void test5() {
    assertEquals(false, Program.isPalindrome("abbaa"));
  }

  @Test
  public void test6() {
    assertEquals(false, Program.isPalindrome("abbbbb"));
  }

  @Test
  public void test7() {
    assertEquals(false, Program.isPalindrome("ad"));
  }

  @Test
  public void test8() {
    assertEquals(true, Program.isPalindrome("b"));
  }

  @Test
  public void test9() {
    assertEquals(true, Program.isPalindrome(""));
  }
}