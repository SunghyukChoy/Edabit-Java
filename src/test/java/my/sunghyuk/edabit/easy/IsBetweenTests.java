package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IsBetweenTests {
  @Test
  public void test1() {
    assertEquals(true, EasyChallenge.isBetween("apple", "banana", "azure"));
  }
	
	@Test
  public void test2() {
    assertEquals(true, EasyChallenge.isBetween("bookcase", "zebra", "squid"));
  }
	
	@Test
  public void test3() {
    assertEquals(true, EasyChallenge.isBetween("shrapnel", "tapenade", "tally"));
  }
	
	@Test
  public void test4() {
    assertEquals(true, EasyChallenge.isBetween("monk", "monument", "monkey"));
  }
	
	@Test
  public void test5() {
    assertEquals(true, EasyChallenge.isBetween("oath", "ostrich", "osteoporosis"));
  }
	
	@Test
  public void test6() {
    assertEquals(false, EasyChallenge.isBetween("ostracize", "ostrich", "open"));
  }
	
	@Test
  public void test7() {
    assertEquals(false, EasyChallenge.isBetween("bookend", "boolean", "boost"));
  }
	
	@Test
  public void test8() {
    assertEquals(false, EasyChallenge.isBetween("tamer", "tanner", "timid"));
  }
	
	@Test
  public void test9() {
    assertEquals(false, EasyChallenge.isBetween("rhino", "sorcerer", "quote"));
  }
	
	@Test
  public void test10() {
    assertEquals(false, EasyChallenge.isBetween("body", "lung", "ace"));
  }
}