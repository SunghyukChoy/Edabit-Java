package my.sunghyuk.edabit;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class FindEvenNumsTests {
	@Test 
	public void test1() {
		assertThat(Challenge.findEvenNums(4), is(new int[]{2, 4}));
	}
	
	@Test 
	public void test2() {
		assertThat(Challenge.findEvenNums(8), is(new int[]{2, 4 ,6, 8}));
	}
	
	@Test 
	public void test3() {
		assertThat(Challenge.findEvenNums(2), is(new int[]{2}));
	}
	
	@Test 
	public void test4() {
		assertThat(Challenge.findEvenNums(1), is(new int[]{}));
	}
	
	@Test 
	public void test5() {
		assertThat(Challenge.findEvenNums(9), is(new int[]{2, 4 ,6, 8}));
	}
	
	@Test 
	public void test6() {
		assertThat(Challenge.findEvenNums(11), is(new int[]{2, 4 ,6, 8, 10}));
	}
}