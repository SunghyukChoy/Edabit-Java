package my.sunghyuk.edabit.easy;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class NthSmallestTests {
	@Test 
	public void test1() {
		assertThat(Challenge.nthSmallest(new int[]{1, 3, 5, 7}, 1), is(1));
	}
	
	@Test 
	public void test2() {
		assertThat(Challenge.nthSmallest(new int[]{1, 3, 5, 7}, 3), is(5));
	}
	
	@Test 
	public void test3() {
		assertThat(Challenge.nthSmallest(new int[]{1, 3, 5, 7}, 5), is(-1));
	}
	
	@Test 
	public void test4() {
		assertThat(Challenge.nthSmallest(new int[]{7, 3, 5, 1}, 2), is(3));
	}
	
	@Test 
	public void test5() {
		assertThat(Challenge.nthSmallest(new int[]{5, 4, 3, 2, 1, -3}, 1), is(-3));
	}
	
	@Test 
	public void test6() {
		assertThat(Challenge.nthSmallest(new int[]{5, 4, 3, 2, 1, -3}, 5), is(4));
	}
	
	@Test 
	public void test7() {
		assertThat(Challenge.nthSmallest(new int[]{4, 5}, 3), is(-1));
	}
	
	@Test 
	public void test8() {
		assertThat(Challenge.nthSmallest(new int[]{4, 5}, 2), is(5));
	}
	
	@Test 
	public void test9() {
		assertThat(Challenge.nthSmallest(new int[]{4, 5}, 1), is(4));
	}
}