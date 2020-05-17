package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IsBetweenTests {
  @Test
  public void test1() {
    assertEquals(true, Challenge.isBetween("apple", "banana", "azure"));
  }
	
	@Test
  public void test2() {
    assertEquals(true, Challenge.isBetween("bookcase", "zebra", "squid"));
  }
	
	@Test
  public void test3() {
    assertEquals(true, Challenge.isBetween("shrapnel", "tapenade", "tally"));
  }
	
	@Test
  public void test4() {
    assertEquals(true, Challenge.isBetween("monk", "monument", "monkey"));
  }
	
	@Test
  public void test5() {
    assertEquals(true, Challenge.isBetween("oath", "ostrich", "osteoporosis"));
  }
	
	@Test
  public void test6() {
    assertEquals(false, Challenge.isBetween("ostracize", "ostrich", "open"));
  }
	
	@Test
  public void test7() {
    assertEquals(false, Challenge.isBetween("bookend", "boolean", "boost"));
  }
	
	@Test
  public void test8() {
    assertEquals(false, Challenge.isBetween("tamer", "tanner", "timid"));
  }
	
	@Test
  public void test9() {
    assertEquals(false, Challenge.isBetween("rhino", "sorcerer", "quote"));
  }
	
	@Test
  public void test10() {
    assertEquals(false, Challenge.isBetween("body", "lung", "ace"));
  }
}