package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolveForExpTests {
  @Test
  public void test1() {
    assertEquals(5, Challenge.solveForExp(4, 1024));
  }
	
	@Test
  public void test2() {
    assertEquals(10, Challenge.solveForExp(2, 1024));
  }
	
	@Test
  public void test3() {
    assertEquals(9, Challenge.solveForExp(8, 134217728));
  }
	
	@Test
  public void test4() {
    assertEquals(6, Challenge.solveForExp(19, 47045881));
  }
	
	@Test
  public void test5() {
    assertEquals(8, Challenge.solveForExp(10, 100000000));
  }
}