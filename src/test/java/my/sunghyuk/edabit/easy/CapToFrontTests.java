package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CapToFrontTests {
  @Test
  public void test1() {
    assertEquals("APhpy", Challenge.capToFront("hApPy"));
  }
	
	@Test
  public void test2() {
    assertEquals("MENTmove", Challenge.capToFront("moveMENT"));
  }
	
	@Test
  public void test3() {
    assertEquals("PPEal", Challenge.capToFront("aPPlE"));
  }
	
	@Test
  public void test4() {
    assertEquals("OCAKEshrt", Challenge.capToFront("shOrtCAKE"));
  }
}