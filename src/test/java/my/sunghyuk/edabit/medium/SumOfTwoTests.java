package my.sunghyuk.edabit.medium;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SumOfTwoTests {
  @Test
  public void test1() {
    assertEquals(Program.sumOfTwo(new int[] { 1, 2, 3 }, new int[] { 10, 20, 30, 40, 50 }, 42), true);
  }

  @Test
  public void test2() {
    assertEquals(Program.sumOfTwo(new int[] { 1, 2, 3 }, new int[] { 10, 20, 30, 40, 50 }, 44), false);
  }

  @Test
  public void test3() {
    assertEquals(Program.sumOfTwo(new int[] { 1, 2, 3 }, new int[] { 10, 20, 30, 40, 50 }, 11), true);
  }

  @Test
  public void test4() {
    assertEquals(Program.sumOfTwo(new int[] { 1, 2, 3 }, new int[] { 10, 20, 30, 40, 50 }, 60), false);
  }

  @Test
  public void test5() {
    assertEquals(Program.sumOfTwo(new int[] { 1, 2, 3 }, new int[] { 10, 20, 30, 40, 50 }, 53), true);
  }

  @Test
  public void test6() {
    assertEquals(Program.sumOfTwo(new int[] { 1, 2, 3 }, new int[] { 10, 20, 30, 40, 50 }, 4), false);
  }

  @Test
  public void test7() {
    assertEquals(Program.sumOfTwo(new int[] { 1, 2 }, new int[] { 4, 5, 6 }, 5), true);
  }

  @Test
  public void test8() {
    assertEquals(Program.sumOfTwo(new int[] { 1, 2 }, new int[] { 4, 5, 6 }, 8), true);
  }

  @Test
  public void test9() {
    assertEquals(Program.sumOfTwo(new int[] { 1, 2 }, new int[] { 4, 5, 6 }, 3), false);
  }

  @Test
  public void test10() {
    assertEquals(Program.sumOfTwo(new int[] { 1, 2 }, new int[] { 4, 5, 6 }, 9), false);
  }
}
