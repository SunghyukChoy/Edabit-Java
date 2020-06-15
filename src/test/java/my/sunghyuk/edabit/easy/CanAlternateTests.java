package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CanAlternateTests {
  @Test
  public void test1() {
    assertEquals(true, Challenge.canAlternate("0001111"));
  }
	
	@Test
  public void test2() {
    assertEquals(true, Challenge.canAlternate("01001"));
  }
	
	@Test
  public void test3() {
    assertEquals(false, Challenge.canAlternate("010001"));
  }
	
	@Test
  public void test4() {
    assertEquals(false, Challenge.canAlternate("0100110111"));
  }
	
	@Test
  public void test5() {
    assertEquals(true, Challenge.canAlternate("10101010"));
  }
	
	@Test
  public void test6() {
    assertEquals(false, Challenge.canAlternate("010101000"));
  }
	
	@Test
  public void test7() {
    assertEquals(false, Challenge.canAlternate("0111"));
  }
	
	@Test
  public void test8() {
    assertEquals(false, Challenge.canAlternate("1111"));
  }
	
	@Test
  public void test9() {
    assertEquals(false, Challenge.canAlternate("00"));
  }
	
	@Test
  public void test10() {
    assertEquals(true, Challenge.canAlternate("101"));
  }
}