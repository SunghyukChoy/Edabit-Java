package my.sunghyuk.edabit.easy;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class MinMaxTests {
	@Test 
	public void test1() {
		assertThat(Challenge.minMax(new double[]{14, 35, 6, 1, 34, 54}), is(new double[]{1, 54}));
	}
	
	@Test 
	public void test2() {
		assertThat(Challenge.minMax(new double[]{1.346, 1.6532, 1.8734, 1.8723}), is(new double[]{1.346, 1.8734}));
	}
	
	@Test 
	public void test3() {
		assertThat(Challenge.minMax(new double[]{0.432, 0.874, 0.523, 0.984, 0.327, 0.2345}), is(new double[]{0.2345, 0.984}));
	}
	
	@Test 
	public void test4() {
		assertThat(Challenge.minMax(new double[]{13, 72, 98, 43, 24, 65, 31}), is(new double[]{13, 98}));
	}
	
	@Test 
	public void test5() {
		assertThat(Challenge.minMax(new double[]{-54, -23, -54, -21}), is(new double[]{-54, -21}));
	}
	
	@Test 
	public void test6() {
		assertThat(Challenge.minMax(new double[]{-0.473, -0.6834, -0.1287, 0.5632}), is(new double[]{-0.6834, 0.5632}));
	}
	
	@Test 
	public void test7() {
		assertThat(Challenge.minMax(new double[]{0, 0, 0, 0}), is(new double[]{0, 0}));
	}
}