package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GoTests {
	@Test 
	public void test1() {
		assertEquals("-", EasyChallenge.Go(1));
	}
	
	@Test 
	public void test2() {
		assertEquals("--", EasyChallenge.Go(2));
	}
	
	@Test 
	public void test3() {
		assertEquals("-------", EasyChallenge.Go(7));
	}
	
	@Test 
	public void test4() {
		assertEquals("--------", EasyChallenge.Go(8));
	}
	
	@Test 
	public void test5() {
		assertEquals("----------", EasyChallenge.Go(10));
	}
	
	@Test 
	public void test6() {
		assertEquals("-----------", EasyChallenge.Go(11));
	}
	
	@Test 
	public void test7() {
		assertEquals("------------", EasyChallenge.Go(12));
	}
	
	@Test 
	public void test8() {
		assertEquals("-------------------------------", EasyChallenge.Go(31));
	}
	
	@Test 
	public void test9() {
		assertEquals("------------------------------------------------------", EasyChallenge.Go(54));
	}
}