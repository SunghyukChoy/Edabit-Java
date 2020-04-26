package my.sunghyuk.edabit;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class ConcatTests {
	@Test 
	public void test1() {
		assertThat(Challenge.concat(new int[]{1, 3, 5}, new int[]{2, 6, 8}), is(new int[]{1, 3, 5, 2, 6, 8}));
	}
	
	@Test 
	public void test2() {
		assertThat(Challenge.concat(new int[]{7, 8}, new int[]{10, 9, 1, 1, 2}), is(new int[]{7, 8, 10, 9, 1, 1, 2}));
	}
	
	@Test 
	public void test3() {
		assertThat(Challenge.concat(new int[]{4, 5, 1}, new int[]{3, 3, 3, 3, 3}), is(new int[]{4, 5, 1, 3, 3, 3, 3, 3}));
	}
}