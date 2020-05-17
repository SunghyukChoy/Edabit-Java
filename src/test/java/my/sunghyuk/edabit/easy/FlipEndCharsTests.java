package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FlipEndCharsTests {
  @Test
  public void test1() {
    assertEquals(".at, dog, and mouseC", EasyProgram.flipEndChars("Cat, dog, and mouse."));
  }
	
	@Test
  public void test2() {
    assertEquals("anna, BananA", EasyProgram.flipEndChars("Anna, Banana"));
  }
	
	@Test
  public void test3() {
    assertEquals("][", EasyProgram.flipEndChars("[]"));
  }
	
	@Test
  public void test4() {
    assertEquals("Incompatible.", EasyProgram.flipEndChars(""));
  }
	
	@Test
  public void test5() {
    assertEquals("Two's a pair.", EasyProgram.flipEndChars("dfdkf49824fdfdfjhd"));
  }
	
	@Test
  public void test6() {
    assertEquals("Two's a pair.", EasyProgram.flipEndChars("#343473847#"));
  }
}