package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CheckPalindromeTests {
	@Test 
	public void test1() {
		assertEquals(true, Challenge.checkPalindrome("mom"));
	}
	
	@Test 
	public void test2() {
		assertEquals(false, Challenge.checkPalindrome("scary"));
	}
	
	@Test 
	public void test3() {
		assertEquals(true, Challenge.checkPalindrome("reviver"));
	}
	
	@Test 
	public void test4() {
		assertEquals(false , Challenge.checkPalindrome("stressed"));
	}
	
	@Test 
	public void test5() {
		assertEquals(false, Challenge.checkPalindrome("good"));
	}
	
	@Test 
	public void test6() {
		assertEquals(true, Challenge.checkPalindrome("refer"));
	}
	
	@Test 
	public void test7() {
		assertEquals(false, Challenge.checkPalindrome("something"));
	}
	
	@Test 
	public void test8() {
		assertEquals(true, Challenge.checkPalindrome("redder"));
	}
	
	@Test 
	public void test9() {
		assertEquals(true, Challenge.checkPalindrome("civic"));
	}
}