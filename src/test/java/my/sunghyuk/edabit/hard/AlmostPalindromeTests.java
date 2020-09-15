package my.sunghyuk.edabit.hard;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AlmostPalindromeTests {
  @Test
  public void test1() {
    assertEquals(true, Challenge.almostPalindrome("abcdcbg"));
  }

  @Test
  public void test2() {
    assertEquals(true, Challenge.almostPalindrome("abccia"));
  }

  @Test
  public void test3() {
    assertEquals(false, Challenge.almostPalindrome("abcdaaa"));
  }

  @Test
  public void test4() {
    assertEquals(true, Challenge.almostPalindrome("gggfgig"));
  }

  @Test
  public void test5() {
    assertEquals(false, Challenge.almostPalindrome("gggffff"));
  }

  @Test
  public void test6() {
    assertEquals(true, Challenge.almostPalindrome("GIGGG"));
  }

  @Test
  public void test7() {
    assertEquals(true, Challenge.almostPalindrome("ggggi"));
  }

  @Test
  public void test8() {
    System.out.println("Should return false if already palindrome.");
    assertEquals(false, Challenge.almostPalindrome("ggggg"));
  }

  @Test
  public void test9() {
    System.out.println("Should return false if already palindrome.");
    assertEquals(false, Challenge.almostPalindrome("gggfggg"));
  }

  @Test
  public void test10() {
    assertEquals(false, Challenge.almostPalindrome("1234312"));
  }
}
