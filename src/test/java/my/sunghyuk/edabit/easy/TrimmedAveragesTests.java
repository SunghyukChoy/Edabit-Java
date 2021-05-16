package my.sunghyuk.edabit.easy;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TrimmedAveragesTests {
	@Test
	public void test01() {
		assertEquals(6, Challenge.trimmedAverages(new int[] { 4, 5, 7, 100 }));
	}

	@Test
	public void test02() {
		assertEquals(15, Challenge.trimmedAverages(new int[] { 10, 25, 5, 15, 20 }));
	}

	@Test
	public void test03() {
		assertEquals(1, Challenge.trimmedAverages(new int[] { 1, 1, 1 }));
	}

	@Test
	public void test04() {
		assertEquals(8, Challenge.trimmedAverages(new int[] { 14, 8, 8 }));
	}

	@Test
	public void test05() {
		assertEquals(18, Challenge.trimmedAverages(new int[] { 18, 19, 13 }));
	}

	@Test
	public void test06() {
		assertEquals(17, Challenge.trimmedAverages(new int[] { 18, 16, 20, 18, 3 }));
	}

	@Test
	public void test07() {
		assertEquals(13, Challenge.trimmedAverages(new int[] { 10, 15, 15, 11 }));
	}

	@Test
	public void test08() {
		assertEquals(9, Challenge.trimmedAverages(new int[] { 4, 12, 4, 17, 11 }));
	}

	@Test
	public void test09() {
		assertEquals(10, Challenge.trimmedAverages(new int[] { 9, 1, 11, 8, 15, 20, 5 }));
	}

	@Test
	public void test10() {
		assertEquals(12, Challenge.trimmedAverages(new int[] { 13, 10, 13, 6 }));
	}

	@Test
	public void test11() {
		assertEquals(23, Challenge.trimmedAverages(new int[] { 5, 4, 54, 4, 6, 46, 56 }));
	}

	@Test
	public void test12() {
		assertEquals(187, Challenge.trimmedAverages(new int[] { 4, 6, 46, 466, 4666, 5, 54, 544 }));
	}
}
// credit goes to the original author/publisher @Joshua Señoron