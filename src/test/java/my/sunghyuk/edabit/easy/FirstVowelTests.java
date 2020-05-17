package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FirstVowelTests {
	@Test 
	public void test1() {
		assertEquals(1, EasyChallenge.firstVowel("hello"));
	}
	
	@Test 
	public void test2() {
		assertEquals(0, EasyChallenge.firstVowel("apple"));
	}
	
	@Test 
	public void test3() {
		assertEquals(3, EasyChallenge.firstVowel("string"));
	}
	
	@Test 
	public void test4() {
		assertEquals(3, EasyChallenge.firstVowel("STRAWBERRY"));
	}
	
	@Test 
	public void test5() {
		assertEquals(1, EasyChallenge.firstVowel("MELON"));
	}
	
	@Test 
	public void test6() {
		assertEquals(1, EasyChallenge.firstVowel("piNNEaPLE"));
	}
}