package my.sunghyuk.edabit.hard;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ClosestPalindromeTests {
  @Test
  public void test1() {
    assertEquals(888, Challenge.closestPalindrome(887));
  }

  @Test
  public void test2() {
    assertEquals(888, Challenge.closestPalindrome(888));
  }

  @Test
  public void test3() {
    assertEquals(22, Challenge.closestPalindrome(27));
  }

  @Test
  public void test4() {
    assertEquals(515, Challenge.closestPalindrome(519));
  }

  @Test
  public void test5() {
    assertEquals(4884, Challenge.closestPalindrome(4892));
  }

  @Test
  public void test6() {
    assertEquals(1, Challenge.closestPalindrome(1));
  }

  @Test
  public void test7() {
    assertEquals(99, Challenge.closestPalindrome(100));
  }

  @Test
  public void test8() {
    assertEquals(33333, Challenge.closestPalindrome(33344));
  }

  @Test
  public void test9() {
    assertEquals(123321, Challenge.closestPalindrome(123456));
  }

  @Test
  public void test10() {
    assertEquals(978212879, Challenge.closestPalindrome(978215236));
  }
}