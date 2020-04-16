package my.sunghyuk.edabit;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class IsSpecialArrayTests {
	@Test
	public void test1() {
		assertThat(Challenge.isSpecialArray(new int[] { 2, 7, 4, 9, 6, 1, 6, 3 }), is(true));
	}

	@Test
	public void test2() {
		assertThat(Challenge.isSpecialArray(new int[] { 2, 7, 9, 1, 6, 1, 6, 3 }), is(false));
	}

	@Test
	public void test3() {
		assertThat(Challenge.isSpecialArray(new int[] { 2, 7, 8, 8, 6, 1, 6, 3 }), is(false));
	}

	@Test
	public void test4() {
		assertThat(Challenge.isSpecialArray(new int[] { 1, 1, 1, 2 }), is(false));
	}

	@Test
	public void test5() {
		assertThat(Challenge.isSpecialArray(new int[] { 2, 2, 2, 2 }), is(false));
	}

	@Test
	public void test6() {
		assertThat(Challenge.isSpecialArray(new int[] { 2, 1, 2, 1 }), is(true));
	}

	@Test
	public void test7() {
		assertThat(Challenge.isSpecialArray(new int[] { 4, 5, 6, 7 }), is(true));
	}

	@Test
	public void test8() {
		assertThat(Challenge.isSpecialArray(new int[] { 4, 5, 6, 7, 0, 5 }), is(true));
	}
}