package my.sunghyuk.edabit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FirstVowelTests {
	@Test 
	public void test1() {
		assertEquals(1, Challenge.firstVowel("hello"));
	}
	
	@Test 
	public void test2() {
		assertEquals(0, Challenge.firstVowel("apple"));
	}
	
	@Test 
	public void test3() {
		assertEquals(3, Challenge.firstVowel("string"));
	}
	
	@Test 
	public void test4() {
		assertEquals(3, Challenge.firstVowel("STRAWBERRY"));
	}
	
	@Test 
	public void test5() {
		assertEquals(1, Challenge.firstVowel("MELON"));
	}
	
	@Test 
	public void test6() {
		assertEquals(1, Challenge.firstVowel("piNNEaPLE"));
	}
}