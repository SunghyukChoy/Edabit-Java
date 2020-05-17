package my.sunghyuk.edabit.easy;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class FindEvenNumsTests {
	@Test 
	public void test1() {
		assertThat(EasyChallenge.findEvenNums(4), is(new int[]{2, 4}));
	}
	
	@Test 
	public void test2() {
		assertThat(EasyChallenge.findEvenNums(8), is(new int[]{2, 4 ,6, 8}));
	}
	
	@Test 
	public void test3() {
		assertThat(EasyChallenge.findEvenNums(2), is(new int[]{2}));
	}
	
	@Test 
	public void test4() {
		assertThat(EasyChallenge.findEvenNums(1), is(new int[]{}));
	}
	
	@Test 
	public void test5() {
		assertThat(EasyChallenge.findEvenNums(9), is(new int[]{2, 4 ,6, 8}));
	}
	
	@Test 
	public void test6() {
		assertThat(EasyChallenge.findEvenNums(11), is(new int[]{2, 4 ,6, 8, 10}));
	}
}