package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IsStrangePairTests {
  @Test
  public void test1() {
    assertEquals(true, Challenge.isStrangePair("ratio", "orator"));
  }
	
	@Test
  public void test2() {
    assertEquals(true, Challenge.isStrangePair("sparkling", "groups"));
  }
	
	@Test
  public void test3() {
    assertEquals(true, Challenge.isStrangePair("mentee", "eminem"));
  }
	
	@Test
  public void test4() {
    assertEquals(true, Challenge.isStrangePair("yahtzee", "easy"));
  }
	
	@Test
  public void test5() {
    assertEquals(false, Challenge.isStrangePair("bush", "hubris"));
  }
	
	@Test
  public void test6() {
    assertEquals(false, Challenge.isStrangePair("edit", "cheese"));
  }
	
	@Test
  public void test7() {
    assertEquals(false, Challenge.isStrangePair("false", "true"));
  }
	
	@Test
  public void test8() {
    assertEquals(false, Challenge.isStrangePair("cupid", "dionysus"));
  }
	
	@Test
  public void test9() {
    assertEquals(false, Challenge.isStrangePair("futile", "elephant"));
  }
	
	@Test
  public void test10() {
		System.out.println("Should work for single characters.");
    assertEquals(true, Challenge.isStrangePair("a", "a"));
  }
	
	@Test
  public void test11() {
		System.out.println("Should work for single characters.");
    assertEquals(false, Challenge.isStrangePair("a", "b"));
  }
	
	@Test
  public void test12() {
		System.out.println("Should work for special characters.");
    assertEquals(true, Challenge.isStrangePair("&", "&"));
  }
	
	@Test
  public void test13() {
		System.out.println("Should work for special characters.");
    assertEquals(true, Challenge.isStrangePair("&!", "!&"));
  }
	
	@Test
  public void test14() {
		System.out.println("Should work for numbers.");
    assertEquals(true, Challenge.isStrangePair("5556", "65"));
  }
	
	@Test
  public void test15() {
		System.out.println("Should work for pairs with empty strings.");
    assertEquals(true, Challenge.isStrangePair("", ""));
  }
	
	@Test
  public void test16() {
		System.out.println("Should work for pairs with empty strings.");
    assertEquals(false, Challenge.isStrangePair("", "abc"));
  }
}