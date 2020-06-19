package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IsPalindromeTests {
  @Test
  public void test1() {
    assertEquals(true, Program.isPalindrome("A man, a plan, a cat, a ham, a yak, a yam, a hat, a canal-Panama!"));
  }
	
	@Test
  public void test2() {
    assertEquals(true, Program.isPalindrome("Neuquen"));
  }
	
	@Test
  public void test3() {
    assertEquals(false, Program.isPalindrome("Not a palindrome"));
  }
}