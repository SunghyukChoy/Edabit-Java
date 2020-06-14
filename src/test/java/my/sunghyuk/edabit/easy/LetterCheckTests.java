package my.sunghyuk.edabit.easy;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class LetterCheckTests {
	@Test
	public void test1() {
		assertThat(Program.letterCheck(new String[]{"trances", "nectar"}), is(true));
	}
	
	@Test
	public void test2() {
		assertThat(Program.letterCheck(new String[]{"THE EYES", "they see"}), is(true));
	}
	
	@Test
	public void test3() {
		assertThat(Program.letterCheck(new String[]{"assert", "staring"}), is(false));
	}
	
	@Test
	public void test4() {
		assertThat(Program.letterCheck(new String[]{"arches", "later"}), is(false));
	}
	
	@Test
	public void test5() {
		assertThat(Program.letterCheck(new String[]{"dale", "caller"}), is(false));
	}
	
	@Test
	public void test6() {
		assertThat(Program.letterCheck(new String[]{"parses", "parsecs"}), is(false));
	}
	
	@Test
	public void test7() {
		assertThat(Program.letterCheck(new String[]{"replays", "adam"}), is(false));
	}
	
	@Test
	public void test8() {
		assertThat(Program.letterCheck(new String[]{"mastering", "streaming"}), is(true));
	}
	
	@Test
	public void test9() {
		assertThat(Program.letterCheck(new String[]{"drapes", "compadres"}), is(false));
	}
	
	@Test
	public void test10() {
		assertThat(Program.letterCheck(new String[]{"deltas", "slated"}), is(true));
	}
}