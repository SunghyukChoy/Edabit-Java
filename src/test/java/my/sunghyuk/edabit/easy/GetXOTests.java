package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GetXOTests {
	@Test
	public void test1() {
		assertEquals(true, EasyProgram.getXO("ooxx"));
	}

	@Test
	public void test2() {
		assertEquals(false, EasyProgram.getXO("xooxx"));
	}

	@Test
	public void test3() {
		assertEquals(true, EasyProgram.getXO("ooxXm"));
	}

	@Test
	public void test4() {
		assertEquals(true, EasyProgram.getXO("zpzpzpp"));
	}

	@Test
	public void test5() {
		assertEquals(false, EasyProgram.getXO("zzoo"));
	}

	@Test
	public void test6() {
		assertEquals(true, EasyProgram.getXO("Xo"));
	}

	@Test
	public void test7() {
		assertEquals(false, EasyProgram.getXO("x"));
	}

	@Test
	public void test8() {
		assertEquals(false, EasyProgram.getXO("o"));
	}

	@Test
	public void test9() {
		assertEquals(false, EasyProgram.getXO("xxxoo"));
	}

	@Test
	public void test10() {
		assertEquals(true, EasyProgram.getXO(""));
	}
}