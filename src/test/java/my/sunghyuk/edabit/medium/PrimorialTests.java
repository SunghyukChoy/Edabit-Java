package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrimorialTests {
  @Test
  public void test1() {
    assertEquals(2, Challenge.primorial(1));
  }

  @Test
  public void test2() {
    assertEquals(6, Challenge.primorial(2));
  }

  @Test
  public void test3() {
    assertEquals(30, Challenge.primorial(3));
  }

  @Test
  public void test4() {
    assertEquals(9699690, Challenge.primorial(8));
  }
}