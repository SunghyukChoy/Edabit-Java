package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTests {
  @Test
  public void test1() {
    assertEquals(1, EasyChallenge.calculator(2, '/', 2));
  }
	
	@Test
  public void test2() {
    assertEquals(3, EasyChallenge.calculator(10, '-', 7));
  }
	
	@Test
  public void test3() {
    assertEquals(32, EasyChallenge.calculator(2, '*', 16));
  }
	
	@Test
  public void test4() {
    assertEquals(0, EasyChallenge.calculator(2, '-', 2));
  }
	
	@Test
  public void test5() {
    assertEquals(41, EasyChallenge.calculator(15, '+', 26));
  }
	
	@Test
  public void test6() {
    assertEquals(4, EasyChallenge.calculator(2, '+', 2));
  }
	
	@Test
  public void test7() {
    assertEquals(0, EasyChallenge.calculator(2, '/', 0));
  }
}