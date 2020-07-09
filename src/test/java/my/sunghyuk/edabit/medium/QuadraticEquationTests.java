package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class QuadraticEquationTests {

  @Test
  public void test1() {
    assertEquals(1, Challenge.quadraticEquation(1, 2, -3));
  }

  @Test
  public void test2() {
    assertEquals(3, Challenge.quadraticEquation(2, -7, 3));
  }

  @Test
  public void test3() {
    assertEquals(14, Challenge.quadraticEquation(1, -12, -28));
  }
}
