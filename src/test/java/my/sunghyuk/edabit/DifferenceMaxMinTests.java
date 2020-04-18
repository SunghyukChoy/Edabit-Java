package my.sunghyuk.edabit;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class DifferenceMaxMinTests {
	@Test 
	public void test1() {
		assertThat(Challenge.differenceMaxMin(new int[]{10, 4, 1, 2, 8, 91}), is(90));
	}
	
	@Test 
	public void test2() {
		assertThat(Challenge.differenceMaxMin(new int[]{-70, 43, 34, 54, 22}), is(124));
	}
}