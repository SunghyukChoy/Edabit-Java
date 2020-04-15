package my.sunghyuk.edabit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FlipEndCharsTests {
  @Test
  public void test1() {
    assertEquals(".at, dog, and mouseC", Program.flipEndChars("Cat, dog, and mouse."));
  }
	
	@Test
  public void test2() {
    assertEquals("anna, BananA", Program.flipEndChars("Anna, Banana"));
  }
	
	@Test
  public void test3() {
    assertEquals("][", Program.flipEndChars("[]"));
  }
	
	@Test
  public void test4() {
    assertEquals("Incompatible.", Program.flipEndChars(""));
  }
	
	@Test
  public void test5() {
    assertEquals("Two's a pair.", Program.flipEndChars("dfdkf49824fdfdfjhd"));
  }
	
	@Test
  public void test6() {
    assertEquals("Two's a pair.", Program.flipEndChars("#343473847#"));
  }
}