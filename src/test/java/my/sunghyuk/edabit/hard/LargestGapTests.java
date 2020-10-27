package my.sunghyuk.edabit.hard;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class LargestGapTests {

  int[][] numVector = new int[][] { { 9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5 },
      { 14, 13, 7, 1, 4, 12, 3, 7, 7, 12, 11, 5, 7 }, { 13, 3, 8, 5, 5, 2, 13, 6, 14, 2, 11, 4, 10, 8, 1, 9 },
      { 21, 28, 0, 5, 11, 6, 17, 25, 2, 19 }, { 26, 17, 4, 25, 29, 26, 8, 30, 4, 20, 2, 7, 29, 7, 20, 30, 23, 5 } };
  int[] resVector = new int[] { 11, 4, 2, 6, 9 };

  @Test
  public void test1() {
    assertEquals(Program.largestGap(numVector[0]), resVector[0]);
  }

  @Test
  public void test2() {
    assertEquals(Program.largestGap(numVector[1]), resVector[1]);
  }

  @Test
  public void test3() {
    assertEquals(Program.largestGap(numVector[2]), resVector[2]);
  }

  @Test
  public void test4() {
    assertEquals(Program.largestGap(numVector[3]), resVector[3]);
  }

  @Test
  public void test55() {
    assertEquals(Program.largestGap(numVector[4]), resVector[4]);
  }
}