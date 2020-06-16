package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FiboTests {
  @Test
  public void test1() {
    assertEquals(1, Program.fib(2));
  }
	
	@Test
  public void test2() {
    assertEquals(5, Program.fib(5));
  }
	
	@Test
  public void test3() {
    assertEquals(21, Program.fib(8));
  }
	
	@Test
  public void test4() {
    assertEquals(144, Program.fib(12));
  }
	
	@Test
  public void test5() {
    assertEquals(0, Program.fib(0));
  }
	
	@Test
  public void test6() {
    assertEquals(1, Program.fib(1));
  }
}