package my.sunghyuk.edabit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CompTests {
	@Test
	public void basic_test_1() {
		assertEquals(false, Challenge.comp("hello", "edabit"));
	}
	
	@Test
	public void basic_test_2() {
		assertEquals(true, Challenge.comp("meow", "woof"));
	}
	
	@Test
	public void basic_test_3() {
		assertEquals(false, Challenge.comp("jrnvjrnnt", "cvjknfjvmfvnfjn"));
	}
	
	@Test
	public void basic_test_4() {
		assertEquals(false, Challenge.comp("jkvnjrt", "krnf"));
	}
	
	@Test
	public void capital_letter_test_1() {
		assertEquals(true, Challenge.comp("AB", "CD"));
	}
	
	@Test
	public void capital_letter_test_2() {
		assertEquals(false, Challenge.comp("ABC", "DE"));
	}
	
	@Test
	public void capital_letter_test_3() {
		assertEquals(true, Challenge.comp("Facebook", "Snapchat"));
	}
}