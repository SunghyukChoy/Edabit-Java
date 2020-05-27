package my.sunghyuk.edabit.easy;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class LargestSwapTests {
	@Test 
	public void test1() {
		System.out.println("27 < 72, so not largest swap."); 
	 	assertThat(Challenge.largestSwap(27), is(false));
	}
	
	@Test 
	public void test2() {
		System.out.println("43 > 34, so largest swap."); 
	 	assertThat(Challenge.largestSwap(43), is(true));
	}
	
	@Test 
	public void test3() {
		System.out.println("14 < 41, so not largest swap.");
	 	assertThat(Challenge.largestSwap(14), is(false));
	}
	
	@Test 
	public void test4() {
		System.out.println("53 > 35, so largest swap.");
	 	assertThat(Challenge.largestSwap(53), is(true));
	}
	
	@Test 
	public void test5() {
		System.out.println("Cannot do better, so largest swap.");
	 	assertThat(Challenge.largestSwap(99), is(true));
	}
}