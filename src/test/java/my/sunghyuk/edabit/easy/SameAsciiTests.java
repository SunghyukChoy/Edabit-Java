package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SameAsciiTests {
  @Test
  public void test1() {
    assertEquals(true, Challenge.sameAscii("a", "a"));
  }
	
	@Test
  public void test2() {
    assertEquals(false, Challenge.sameAscii("A", "a"));
  }
	
	@Test
  public void test3() {
    assertEquals(false, Challenge.sameAscii("!", "g"));
  }
	
	@Test
  public void test4() {
    assertEquals(true, Challenge.sameAscii("aAAAaaAA", "~~~aa,"));
  }
	
	@Test
  public void test5() {
    assertEquals(false, Challenge.sameAscii("aUGSIGHIhiSJGijs", "~~~~~~~~~FF,"));
  }
	
	@Test
  public void test6() {
    assertEquals(true, Challenge.sameAscii("~~Tga2", "{}[]()I"));
  }
}