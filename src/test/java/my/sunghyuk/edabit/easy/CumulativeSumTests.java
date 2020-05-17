package my.sunghyuk.edabit.easy;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class CumulativeSumTests {
	@Test
	public void test1() {
		System.out.println("Should return an empty array if given an empty array.");
		assertThat(EasyProgram.cumulativeSum(new int[]{}), is (new int[]{}));
	}
	
	@Test
	public void test2() {
		System.out.println("Should work with 1 value.");
		assertThat(EasyProgram.cumulativeSum(new int[]{1}), is (new int[]{1}));
	}
	
	@Test
	public void test3() {
		System.out.println("Should work with multiple values.");
		assertThat(EasyProgram.cumulativeSum(new int[]{1, 2, 3}), is (new int[]{1, 3, 6}));
	}
	
	@Test
	public void test4() {
		System.out.println("Should work with multiple negative values.");
		assertThat(EasyProgram.cumulativeSum(new int[]{-1, -2, -3}), is (new int[]{-1, -3, -6}));
	}
	
	@Test
	public void test5() {
		System.out.println("Should work with multiple positive and negative values.");
		assertThat(EasyProgram.cumulativeSum(new int[]{1, -2, 3}), is (new int[]{1, -1, 2}));
	}
	
	@Test
	public void test6() {
		System.out.println("Should work with long array.");
		assertThat(EasyProgram.cumulativeSum(new int[]{3, 3, -2, 408, 3, 3, 0, 66, 2, -2, 2, 3, 4, 2, -47, 3, 3, 2}), is (new int[]{3, 6, 4, 412, 415, 418, 418, 484, 486, 484, 486, 489, 493, 495, 448, 451, 454, 456}));
	}
}