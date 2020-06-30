package my.sunghyuk.edabit.very_easy;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class GetLastItemTests {
	@Test
	public void test1() {
		assertThat(Program.getLastItem(new int[]{1, 2, 3}), is(3));
	}
	
	@Test
	public void test2() {
		assertThat(Program.getLastItem(new int[]{1, 2, 3, 56, 87, 23, 65, 45}), is(45));
	}
	
	@Test
	public void test3() {
		assertThat(Program.getLastItem(new int[]{1}), is(1));
	}
	
	@Test
	public void test4() {
		assertThat(Program.getLastItem(new int[]{0}), is(0));
	}
	
	@Test
	public void test5() {
		assertThat(Program.getLastItem(new int[]{-1, 3, 4, -45, -10}), is(-10));
  }
}
