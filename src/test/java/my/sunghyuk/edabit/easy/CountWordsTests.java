package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CountWordsTests {
	@Test
	public void test1() {
		assertEquals(3, Program.countWords("It's high noon"));
	}

	@Test
	public void test2() {
		assertEquals(4, Program.countWords("Is this easy mode"));
	}

	@Test
	public void test3() {
		assertEquals(5, Program.countWords("What an easy task, right"));
	}

	@Test
	public void test4() {
		assertEquals(4, Program.countWords("This is a test"));
	}

	@Test
	public void test5() {
		assertEquals(6, Program.countWords("Just an example here move along"));
	}

	@Test
	public void test6() {
		assertEquals(4, Program.countWords("How are you today?"));
	}
}