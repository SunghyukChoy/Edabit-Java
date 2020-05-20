package my.sunghyuk.edabit.easy;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class PrefixesVsSuffixesTests {
	@Test
	public void test1() {
		assertThat(Program.isPrefix("automation", "auto-"), is(true));
	}

	@Test
	public void test2() {
		assertThat(Program.isPrefix("superfluous", "super-"), is(true));
	}

	@Test
	public void test3() {
		assertThat(Program.isPrefix("oration", "mega-"), is(false));
	}

	@Test
	public void test4() {
		assertThat(Program.isPrefix("retrospect", "sub-"), is(false));
	}

	@Test
	public void test5() {
		assertThat(Program.isSuffix("arachnophobia", "-phobia"), is(true));
	}

	@Test
	public void test6() {
		assertThat(Program.isSuffix("rhinoplasty", "-plasty"), is(true));
	}

	@Test
	public void test7() {
		assertThat(Program.isSuffix("movement", "-scope"), is(false));
	}

	@Test
	public void test8() {
		assertThat(Program.isSuffix("vocation", "-logy"), is(false));
	}
}