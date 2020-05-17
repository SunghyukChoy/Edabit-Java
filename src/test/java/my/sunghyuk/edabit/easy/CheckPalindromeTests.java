package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CheckPalindromeTests {
	@Test 
	public void test1() {
		assertEquals(true, EasyChallenge.checkPalindrome("mom"));
	}
	
	@Test 
	public void test2() {
		assertEquals(false, EasyChallenge.checkPalindrome("scary"));
	}
	
	@Test 
	public void test3() {
		assertEquals(true, EasyChallenge.checkPalindrome("reviver"));
	}
	
	@Test 
	public void test4() {
		assertEquals(false , EasyChallenge.checkPalindrome("stressed"));
	}
	
	@Test 
	public void test5() {
		assertEquals(false, EasyChallenge.checkPalindrome("good"));
	}
	
	@Test 
	public void test6() {
		assertEquals(true, EasyChallenge.checkPalindrome("refer"));
	}
	
	@Test 
	public void test7() {
		assertEquals(false, EasyChallenge.checkPalindrome("something"));
	}
	
	@Test 
	public void test8() {
		assertEquals(true, EasyChallenge.checkPalindrome("redder"));
	}
	
	@Test 
	public void test9() {
		assertEquals(true, EasyChallenge.checkPalindrome("civic"));
	}
}