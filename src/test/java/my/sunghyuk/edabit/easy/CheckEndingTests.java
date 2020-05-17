package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CheckEndingTests {
	@Test
	public void test1() {
		assertEquals("Nope!", true, EasyChallenge.checkEnding("abc", "bc"));
	}

	@Test
	public void test2() {
		assertEquals("Nope!", false, EasyChallenge.checkEnding("abc", "d"));
	}

	@Test
	public void test3() {
		assertEquals("Nope!", false, EasyChallenge.checkEnding("samurai", "zi"));
	}

	@Test
	public void test4() {
		assertEquals("Nope!", true, EasyChallenge.checkEnding("feminine", "nine"));
	}

	@Test
	public void test5() {
		assertEquals("Nope!", false, EasyChallenge.checkEnding("convention", "tio"));
	}

	@Test
	public void test6() {
		assertEquals("Nope!", false, EasyChallenge.checkEnding("cooperative", "ooper"));
	}

	@Test
	public void test7() {
		assertEquals("Nope!", true, EasyChallenge.checkEnding("extraterrestrial", "xtraterrestrial"));
	}

	@Test
	public void test8() {
		assertEquals("Nope!", true, EasyChallenge.checkEnding("access", "ss"));
	}

	@Test
	public void test9() {
		assertEquals("Nope!", false, EasyChallenge.checkEnding("motorist", "is"));
	}
}