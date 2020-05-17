package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CardHideTests {
  @Test
  public void test1() {
    assertEquals("************5678", EasyChallenge.cardHide("1234123456785678"));
  }
	
	@Test
  public void test2() {
    assertEquals("************3213", EasyChallenge.cardHide("8754456321113213"));
  }
	
	@Test
  public void test3() {
    assertEquals("**********5523", EasyChallenge.cardHide("35123413355523"));
  }
}