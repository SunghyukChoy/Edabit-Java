package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CardHideTests {
  @Test
  public void test1() {
    assertEquals("************5678", Challenge.cardHide("1234123456785678"));
  }
	
	@Test
  public void test2() {
    assertEquals("************3213", Challenge.cardHide("8754456321113213"));
  }
	
	@Test
  public void test3() {
    assertEquals("**********5523", Challenge.cardHide("35123413355523"));
  }
}