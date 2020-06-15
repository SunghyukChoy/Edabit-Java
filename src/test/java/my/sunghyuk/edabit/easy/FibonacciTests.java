package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FibonacciTests {
  @Test
  public void test1() {
    assertEquals(3, Challenge.Fibonacci(3));
  }

  @Test
  public void test2() {
    assertEquals(21, Challenge.Fibonacci(7));
  }

  @Test
  public void test3() {
    assertEquals(233, Challenge.Fibonacci(12));
  }

  @Test
  public void test4() {
    assertEquals(1, Challenge.Fibonacci(0));
  }

  @Test
  public void test5() {
    assertEquals(1, Challenge.Fibonacci(1));
  }
}