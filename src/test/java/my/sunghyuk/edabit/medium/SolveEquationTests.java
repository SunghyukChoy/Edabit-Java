package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolveEquationTests {
  @Test
  public void test1() {
    assertEquals(7, Challenge.solveEquation("x + 43 = 50"));
  }

  @Test
  public void test2() {
    assertEquals(19, Challenge.solveEquation("x - 9 = 10"));
  }

  @Test
  public void test3() {
    assertEquals(-200, Challenge.solveEquation("x + 300 = 100"));
  }

  @Test
  public void test4() {
    assertEquals(0, Challenge.solveEquation("x - 0 = 0"));
  }

  @Test
  public void test5() {
    assertEquals(678, Challenge.solveEquation("x + 188 = 866"));
  }

  @Test
  public void test6() {
    assertEquals(300, Challenge.solveEquation("x + -500 = -200"));
  }

}