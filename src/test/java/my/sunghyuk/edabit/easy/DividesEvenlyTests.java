package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DividesEvenlyTests {
  @Test
  public void test1() {
    assertEquals(true, EasyChallenge.dividesEvenly(98, 7));
  }
	
	@Test
  public void test2() {
    assertEquals(false, EasyChallenge.dividesEvenly(87, 49));
  }
	
	@Test
  public void test3() {
    assertEquals(false, EasyChallenge.dividesEvenly(34, 14));
  }
	
	@Test
  public void test4() {
    assertEquals(true, EasyChallenge.dividesEvenly(78, 6));
  }
	
	@Test
  public void test5() {
    assertEquals(false, EasyChallenge.dividesEvenly(30, 4));
  }
	
	@Test
  public void test6() {
    assertEquals(false, EasyChallenge.dividesEvenly(87, 73));
  }
	
	@Test
  public void test7() {
    assertEquals(false, EasyChallenge.dividesEvenly(74, 7));
  }
	
	@Test
  public void test8() {
    assertEquals(true, EasyChallenge.dividesEvenly(87, 29));
  }
	
	@Test
  public void test9() {
    assertEquals(true, EasyChallenge.dividesEvenly(48, 24));
  }
	
	@Test
  public void test10() {
    assertEquals(false, EasyChallenge.dividesEvenly(99, 20));
  }
	
	@Test
  public void test11() {
    assertEquals(true, EasyChallenge.dividesEvenly(98, 49));
  }
	
	@Test
  public void test12() {
    assertEquals(false, EasyChallenge.dividesEvenly(100, 6));
  }
	
	@Test
  public void test13() {
    assertEquals(true, EasyChallenge.dividesEvenly(64, 4));
  }
	
	@Test
  public void test14() {
    assertEquals(true, EasyChallenge.dividesEvenly(70, 35));
  }
	
	@Test
  public void test15() {
    assertEquals(true, EasyChallenge.dividesEvenly(38, 38));
  }
	
	@Test
  public void test16() {
    assertEquals(false, EasyChallenge.dividesEvenly(29, 3));
  }
	
	@Test
  public void test17() {
    assertEquals(false, EasyChallenge.dividesEvenly(20, 8));
  }
	
	@Test
  public void test18() {
    assertEquals(false, EasyChallenge.dividesEvenly(66, 50));
  }
	
	@Test
  public void test19() {
    assertEquals(true, EasyChallenge.dividesEvenly(95, 1));
  }
	
	@Test
  public void test20() {
    assertEquals(true, EasyChallenge.dividesEvenly(58, 2));
  }
}