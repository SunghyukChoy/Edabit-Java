package my.sunghyuk.edabit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DoubleLettersTests {
	@Test 
	public void test1() {
		assertEquals(true, Challenge.doubleLetters("loop"));
	}
	
	@Test 
	public void test2() {
		assertEquals(true, Challenge.doubleLetters("meeting"));
	}
	
	@Test 
	public void test3() {
		assertEquals(true, Challenge.doubleLetters("yummy"));
	}
	
	@Test 
	public void test4() {
		assertEquals(true, Challenge.doubleLetters("moo"));
	}
	
	@Test 
	public void test5() {
		assertEquals(true, Challenge.doubleLetters("toodles"));
	}
	
	@Test 
	public void test6() {
		assertEquals(true, Challenge.doubleLetters("droop"));
	}
	
	@Test 
	public void test7() {
		assertEquals(true, Challenge.doubleLetters("loot"));
	}
	
	@Test 
	public void test8() {
		assertEquals(false, Challenge.doubleLetters("orange"));
	}
	
	@Test 
	public void test9() {
		assertEquals(false, Challenge.doubleLetters("munchkin"));
	}
	
	@Test 
	public void test10() {
		assertEquals(false, Challenge.doubleLetters("forestry"));
	}
	
	@Test 
	public void test11() {
		assertEquals(false, Challenge.doubleLetters("raindrops"));
	}
	
	@Test 
	public void test12() {
		assertEquals(false, Challenge.doubleLetters("gold"));
	}
	
	@Test 
	public void test13() {
		assertEquals(false, Challenge.doubleLetters("paradise"));
	}
	
	@Test 
	public void test14() {
		assertEquals(false, Challenge.doubleLetters("chicken"));
	}
}