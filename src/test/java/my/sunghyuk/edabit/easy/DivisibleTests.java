package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DivisibleTests {
	@Test 
	public void test1() {
		assertEquals(false, Challenge.divisible(1));
	}
	
	@Test 
	public void test2() {
		assertEquals(true, Challenge.divisible(100));
	}
	
	@Test 
	public void test3() {
		assertEquals(true, Challenge.divisible(1000));
	}
	
	@Test 
	public void test4() {
		assertEquals(true, Challenge.divisible(111000));
	}
	
	@Test 
	public void test5() {
		System.out.println("Don't forget negatives");
		assertEquals(false, Challenge.divisible(-1));
	}
	
	@Test 
	public void test6() {
		System.out.println("Cover the 0 cases");
		assertEquals(true, Challenge.divisible(0));
	}
	
	@Test 
	public void test7() {
		System.out.println("-100 is divisible by 100");
		assertEquals(true, Challenge.divisible(-100));
	}
}