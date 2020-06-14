package my.sunghyuk.edabit.easy;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class SortNumsAscendingTests {
	@Test
	public void test1() {
		assertThat(Program.sortNumsAscending(new int[]{1, 2, 10, 50, 5}), is(new int[]{1, 2, 5, 10, 50}));
	}
	
	@Test
	public void test2() {
		assertThat(Program.sortNumsAscending(new int[]{80, 29, 4, -95, -24, 85}), is(new int[]{-95, -24, 4, 29, 80, 85}));
	}
	
	@Test
	public void test3() {
		assertThat(Program.sortNumsAscending(new int[]{}), is(new int[]{}));
	}
	
	@Test
	public void test4() {
		assertThat(Program.sortNumsAscending(new int[]{47, 51, -17, -16, 91, 47, -85, -8, -16, -27}), is(new int[]{-85, -27, -17, -16, -16, -8, 47, 47, 51, 91}));
	}
	
	@Test
	public void test5() {
		assertThat(Program.sortNumsAscending(new int[]{-51, -73, 65, 69, -76, 74, -14}), is(new int[]{-76, -73, -51, -14, 65, 69, 74}));
	}
	
	@Test
	public void test6() {
		assertThat(Program.sortNumsAscending(new int[]{45, 98, 35, 65, 97, 21, 33}), is(new int[]{21, 33, 35, 45, 65, 97, 98}));
	}
	
	@Test
	public void test7() {
		assertThat(Program.sortNumsAscending(new int[]{-23, -69, -54, -2, -32}), is(new int[]{-69, -54, -32, -23, -2}));
	}
	
	@Test
	public void test8() {
		assertThat(Program.sortNumsAscending(new int[]{-21, -9, -96}), is(new int[]{-96, -21, -9}));
	}
	
	@Test
	public void test9() {
		assertThat(Program.sortNumsAscending(new int[]{0}), is(new int[]{0}));
  }
  
  @Test
	public void test10() {
		assertThat(Program.sortNumsAscending(null), is(new int[0]));
	}
}