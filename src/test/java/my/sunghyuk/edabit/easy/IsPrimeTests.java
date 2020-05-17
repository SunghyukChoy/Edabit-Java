package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IsPrimeTests {
  @Test
  public void test1() {
    assertEquals(true, EasyChallenge.isPrime(31));
  }
	
	@Test
  public void test2() {
    assertEquals(false, EasyChallenge.isPrime(18));
  }
	
	@Test
  public void test3() {
    assertEquals(true, EasyChallenge.isPrime(11));
  }
	
	@Test
  public void test4() {
    assertEquals(false, EasyChallenge.isPrime(12));
  }
	
	@Test
  public void test5() {
    assertEquals(false, EasyChallenge.isPrime(1));
  }
	
	@Test
  public void test6() {
    assertEquals(true, EasyChallenge.isPrime(3));
  }
	
	@Test
  public void test7() {
    assertEquals(false, EasyChallenge.isPrime(48));
  }
	
	@Test
  public void test8() {
    assertEquals(true, EasyChallenge.isPrime(5));
  }
	
	@Test
  public void test9() {
    assertEquals(false, EasyChallenge.isPrime(77));
  }
	
	@Test
  public void test10() {
    assertEquals(true, EasyChallenge.isPrime(7));
  }
	
	@Test
  public void test11() {
    assertEquals(false, EasyChallenge.isPrime(10));
  }

  @Test
  public void test12() {
    assertEquals(false, EasyChallenge.isPrime(Integer.MAX_VALUE - 101));
  }

}