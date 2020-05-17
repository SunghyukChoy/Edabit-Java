package my.sunghyuk.edabit.easy;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class GetFirstValueTests {
	@Test
  public void test1() {
		assertThat(Challenge.getFirstValue(new int[]{1, 2, 3, 4}), is(1));
	}
	
	@Test
  public void test2() {
		assertThat(Challenge.getFirstValue(new int[]{2, 4, 6, 8, 10}), is(2));
	}
	
	@Test
  public void test3() {
		assertThat(Challenge.getFirstValue(new int[]{1, 3, 5, 7, 9}), is(1));
	}
	
	@Test
  public void test4() {
		assertThat(Challenge.getFirstValue(new int[]{5, 7, 11, 25, 100, 200, 350}), is(5));
	}
	
	@Test
  public void test5() {
		assertThat(Challenge.getFirstValue(new int[]{-5, 7, 200, 350}), is(-5));
	}
}