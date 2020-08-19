package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IsFactorialTests {
  @Test
  public void test1() {
    assertEquals(true, Program.isFactorial(2));
  }

  @Test
  public void test2() {
    assertEquals(false, Program.isFactorial(16));
  }

  @Test
  public void test3() {
    assertEquals(true, Program.isFactorial(24));
  }

  @Test
  public void test4() {
    assertEquals(false, Program.isFactorial(36));
  }

  @Test
  public void test5() {
    assertEquals(true, Program.isFactorial(120));
  }

  @Test
  public void test6() {
    assertEquals(false, Program.isFactorial(721));
  }

}