package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GetXOTests {
	@Test
	public void test1() {
		assertEquals(true, Program.getXO("ooxx"));
	}

	@Test
	public void test2() {
		assertEquals(false, Program.getXO("xooxx"));
	}

	@Test
	public void test3() {
		assertEquals(true, Program.getXO("ooxXm"));
	}

	@Test
	public void test4() {
		assertEquals(true, Program.getXO("zpzpzpp"));
	}

	@Test
	public void test5() {
		assertEquals(false, Program.getXO("zzoo"));
	}

	@Test
	public void test6() {
		assertEquals(true, Program.getXO("Xo"));
	}

	@Test
	public void test7() {
		assertEquals(false, Program.getXO("x"));
	}

	@Test
	public void test8() {
		assertEquals(false, Program.getXO("o"));
	}

	@Test
	public void test9() {
		assertEquals(false, Program.getXO("xxxoo"));
	}

	@Test
	public void test10() {
		assertEquals(true, Program.getXO(""));
	}
}