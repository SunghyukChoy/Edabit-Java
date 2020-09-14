package my.sunghyuk.edabit.medium;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SwapXYTests {
  @Test
  public void test1() {
    assertEquals("(2, 1), (4, 3)", Challenge.swapXY("(1, 2), (3, 4)"));
  }

  @Test
  public void test2() {
    assertEquals("(23, 11), (99, 43)", Challenge.swapXY("(11, 23), (43, 99)"));
  }

  @Test
  public void test3() {
    assertEquals("(-3, -5), (4, 7)", Challenge.swapXY("(-5, -3), (7, 4)"));
  }

  @Test
  public void test4() {
    assertEquals("(-321, -1095), (-88, 0)", Challenge.swapXY("(-1095, -321), (0, -88)"));
  }
}
