package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CompTests {
	@Test
	public void basic_test_1() {
		assertEquals(false, EasyChallenge.comp("hello", "edabit"));
	}
	
	@Test
	public void basic_test_2() {
		assertEquals(true, EasyChallenge.comp("meow", "woof"));
	}
	
	@Test
	public void basic_test_3() {
		assertEquals(false, EasyChallenge.comp("jrnvjrnnt", "cvjknfjvmfvnfjn"));
	}
	
	@Test
	public void basic_test_4() {
		assertEquals(false, EasyChallenge.comp("jkvnjrt", "krnf"));
	}
	
	@Test
	public void capital_letter_test_1() {
		assertEquals(true, EasyChallenge.comp("AB", "CD"));
	}
	
	@Test
	public void capital_letter_test_2() {
		assertEquals(false, EasyChallenge.comp("ABC", "DE"));
	}
	
	@Test
	public void capital_letter_test_3() {
		assertEquals(true, EasyChallenge.comp("Facebook", "Snapchat"));
	}
}