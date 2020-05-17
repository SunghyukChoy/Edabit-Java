package my.sunghyuk.edabit.easy;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class IsFourLettersTests {
	@Test
	public void test1() {
		assertThat(EasyProgram.isFourLetters(new String[]{"Ryan", "Kieran", "Jason", "Matt"}), is(new String[]{"Ryan", "Matt"}));
	}
	
	@Test
	public void test2() {
		assertThat(EasyProgram.isFourLetters(new String[]{"Tomato", "Potato", "Pair"}), is(new String[]{"Pair"}));
	}
	
	@Test
	public void test3() {
		assertThat(EasyProgram.isFourLetters(new String[]{"Kangaroo", "Bear", "Fox"}), is(new String[]{"Bear"}));
	}
	
	@Test
	public void test4() {
		assertThat(EasyProgram.isFourLetters(new String[]{"Red", "Blue", "Green", "Pink"}), is(new String[]{"Blue", "Pink"}));
	}
	
	@Test
	public void test5() {
		assertThat(EasyProgram.isFourLetters(new String[]{"is", "up", "two", "elephant"}), is(new String[]{}));
	}
	
	@Test
	public void test6() {
		assertThat(EasyProgram.isFourLetters(new String[]{}), is(new String[]{}));
	}
	
	@Test
	public void test7() {
		assertThat(EasyProgram.isFourLetters(new String[]{"jazz", "quiz", "jump"}), is(new String[]{"jazz", "quiz", "jump"}));
	}
	
	@Test
	public void test8() {
		assertThat(EasyProgram.isFourLetters(new String[]{""}), is(new String[]{}));
	}
	
	@Test
	public void test9() {
		assertThat(EasyProgram.isFourLetters(new String[]{"Broccoli", "Carrot", "Spinach"}), is(new String[]{}));
	}
}