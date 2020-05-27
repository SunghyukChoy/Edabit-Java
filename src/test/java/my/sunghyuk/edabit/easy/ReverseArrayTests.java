package my.sunghyuk.edabit.easy;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class ReverseArrayTests {

	@Test 
	public void test1() {
		assertThat(Challenge.reverse(new int[]{5, -7, 8, 3}), is(new int[]{3, 8, -7, 5}));
	}
	
	@Test 
	public void test2() {
		assertThat(Challenge.reverse(new int[0]), is(new int[0]));
	}
	
	@Test 
	public void test3() {
		assertThat(Challenge.reverse(new int[]{1,2,3,4,5}), is(new int[]{5,4,3,2,1}));
	}

}