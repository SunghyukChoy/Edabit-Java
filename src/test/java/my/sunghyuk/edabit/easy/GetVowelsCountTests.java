package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GetVowelsCountTests {
	@Test
	public void test1() {
		assertEquals("Nope!", 5, Challenge.getVowelsCount("Celebration"));
	}

	@Test
	public void test2() {
		assertEquals("Nope!", 1, Challenge.getVowelsCount("Palm"));
	}

	@Test
	public void test3() {
		assertEquals("Nope!", 4, Challenge.getVowelsCount("Prediction"));
	}

	@Test
	public void test4() {
		assertEquals("Nope!", 3, Challenge.getVowelsCount("Suite"));
	}

	@Test
	public void test5() {
		assertEquals("Nope!", 3, Challenge.getVowelsCount("Quote"));
	}

	@Test
	public void test6() {
		assertEquals("Nope!", 3, Challenge.getVowelsCount("Portrait"));
	}

	@Test
	public void test7() {
		assertEquals("Nope!", 2, Challenge.getVowelsCount("Steam"));
	}

	@Test
	public void test8() {
		assertEquals("Nope!", 2, Challenge.getVowelsCount("Tape"));
	}

	@Test
	public void test9() {
		assertEquals("Nope!", 3, Challenge.getVowelsCount("Nightmare"));
	}

	@Test
	public void test10() {
		assertEquals("Nope!", 4, Challenge.getVowelsCount("Convention"));
	}
}