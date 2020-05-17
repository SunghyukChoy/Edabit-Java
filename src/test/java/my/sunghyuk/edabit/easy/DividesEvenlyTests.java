package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DividesEvenlyTests {
  @Test
  public void test1() {
    assertEquals(true, Challenge.dividesEvenly(98, 7));
  }
	
	@Test
  public void test2() {
    assertEquals(false, Challenge.dividesEvenly(87, 49));
  }
	
	@Test
  public void test3() {
    assertEquals(false, Challenge.dividesEvenly(34, 14));
  }
	
	@Test
  public void test4() {
    assertEquals(true, Challenge.dividesEvenly(78, 6));
  }
	
	@Test
  public void test5() {
    assertEquals(false, Challenge.dividesEvenly(30, 4));
  }
	
	@Test
  public void test6() {
    assertEquals(false, Challenge.dividesEvenly(87, 73));
  }
	
	@Test
  public void test7() {
    assertEquals(false, Challenge.dividesEvenly(74, 7));
  }
	
	@Test
  public void test8() {
    assertEquals(true, Challenge.dividesEvenly(87, 29));
  }
	
	@Test
  public void test9() {
    assertEquals(true, Challenge.dividesEvenly(48, 24));
  }
	
	@Test
  public void test10() {
    assertEquals(false, Challenge.dividesEvenly(99, 20));
  }
	
	@Test
  public void test11() {
    assertEquals(true, Challenge.dividesEvenly(98, 49));
  }
	
	@Test
  public void test12() {
    assertEquals(false, Challenge.dividesEvenly(100, 6));
  }
	
	@Test
  public void test13() {
    assertEquals(true, Challenge.dividesEvenly(64, 4));
  }
	
	@Test
  public void test14() {
    assertEquals(true, Challenge.dividesEvenly(70, 35));
  }
	
	@Test
  public void test15() {
    assertEquals(true, Challenge.dividesEvenly(38, 38));
  }
	
	@Test
  public void test16() {
    assertEquals(false, Challenge.dividesEvenly(29, 3));
  }
	
	@Test
  public void test17() {
    assertEquals(false, Challenge.dividesEvenly(20, 8));
  }
	
	@Test
  public void test18() {
    assertEquals(false, Challenge.dividesEvenly(66, 50));
  }
	
	@Test
  public void test19() {
    assertEquals(true, Challenge.dividesEvenly(95, 1));
  }
	
	@Test
  public void test20() {
    assertEquals(true, Challenge.dividesEvenly(58, 2));
  }
}