package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RetrieveTests {
  @Test
  public void test1() {
    assertEquals("6", Challenge.retrieveMajor("6.1.9"));
  }
	
	@Test
  public void test2() {
    assertEquals("1", Challenge.retrieveMinor("6.1.9"));
  }
	
	@Test
  public void test3() {
    assertEquals("9", Challenge.retrievePatch("6.1.9"));
  }
	
	@Test
  public void test4() {
    assertEquals("2", Challenge.retrieveMajor("2.1.0"));
  }
	
	@Test
  public void test5() {
    assertEquals("1", Challenge.retrieveMinor("2.1.0"));
  }
	
	@Test
  public void test6() {
    assertEquals("0", Challenge.retrievePatch("2.1.0"));
  }
	
	@Test
  public void test7() {
    assertEquals("5", Challenge.retrieveMajor("5.12.13"));
  }
	
	@Test
  public void test8() {
    assertEquals("12", Challenge.retrieveMinor("5.12.13"));
  }
	
	@Test
  public void test9() {
    assertEquals("13", Challenge.retrievePatch("5.12.13"));
  }
}