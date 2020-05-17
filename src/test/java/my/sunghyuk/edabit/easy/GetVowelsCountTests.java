package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GetVowelsCountTests {
	@Test
	public void test1() {
		assertEquals("Nope!", 5, EasyChallenge.getVowelsCount("Celebration"));
	}

	@Test
	public void test2() {
		assertEquals("Nope!", 1, EasyChallenge.getVowelsCount("Palm"));
	}

	@Test
	public void test3() {
		assertEquals("Nope!", 4, EasyChallenge.getVowelsCount("Prediction"));
	}

	@Test
	public void test4() {
		assertEquals("Nope!", 3, EasyChallenge.getVowelsCount("Suite"));
	}

	@Test
	public void test5() {
		assertEquals("Nope!", 3, EasyChallenge.getVowelsCount("Quote"));
	}

	@Test
	public void test6() {
		assertEquals("Nope!", 3, EasyChallenge.getVowelsCount("Portrait"));
	}

	@Test
	public void test7() {
		assertEquals("Nope!", 2, EasyChallenge.getVowelsCount("Steam"));
	}

	@Test
	public void test8() {
		assertEquals("Nope!", 2, EasyChallenge.getVowelsCount("Tape"));
	}

	@Test
	public void test9() {
		assertEquals("Nope!", 3, EasyChallenge.getVowelsCount("Nightmare"));
	}

	@Test
	public void test10() {
		assertEquals("Nope!", 4, EasyChallenge.getVowelsCount("Convention"));
	}
}