package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTests {
  @Test
  public void test1() {
    assertEquals(1, Challenge.calculator(2, '/', 2));
  }
	
	@Test
  public void test2() {
    assertEquals(3, Challenge.calculator(10, '-', 7));
  }
	
	@Test
  public void test3() {
    assertEquals(32, Challenge.calculator(2, '*', 16));
  }
	
	@Test
  public void test4() {
    assertEquals(0, Challenge.calculator(2, '-', 2));
  }
	
	@Test
  public void test5() {
    assertEquals(41, Challenge.calculator(15, '+', 26));
  }
	
	@Test
  public void test6() {
    assertEquals(4, Challenge.calculator(2, '+', 2));
  }
	
	@Test
  public void test7() {
    assertEquals(0, Challenge.calculator(2, '/', 0));
  }
}