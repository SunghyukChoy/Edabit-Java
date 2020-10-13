package my.sunghyuk.edabit.medium;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class NumberSplitTests {

  private int[] numVector = new int[] { 4, 10, 11, 0, 1, -4, -5, -9 };
  private int[][] resVector = new int[][] { { 2, 2 }, { 5, 5 }, { 5, 6 }, { 0, 0 }, { 0, 1 }, { -2, -2 }, { -3, -2 },
      { -5, -4 } };

  @Test
  public void test01() {
    assertArrayEquals(Program.numberSplit(numVector[0]), resVector[0]);
  }

  @Test
  public void test02() {
    assertArrayEquals(Program.numberSplit(numVector[1]), resVector[1]);
  }

  @Test
  public void test03() {
    assertArrayEquals(Program.numberSplit(numVector[2]), resVector[2]);
  }

  @Test
  public void test04() {
    assertArrayEquals(Program.numberSplit(numVector[3]), resVector[3]);
  }

  @Test
  public void test05() {
    assertArrayEquals(Program.numberSplit(numVector[4]), resVector[4]);
  }

  @Test
  public void test06() {
    assertArrayEquals(Program.numberSplit(numVector[5]), resVector[5]);
  }

  @Test
  public void test07() {
    assertArrayEquals(Program.numberSplit(numVector[6]), resVector[6]);
  }

  @Test
  public void test08() {
    assertArrayEquals(Program.numberSplit(numVector[7]), resVector[7]);
  }
}
