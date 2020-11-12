package my.sunghyuk.edabit.medium;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ShiftToLeftTests {

  private int[][] numVector = new int[][] { { 5, 2 }, { 10, 3 }, { -32, 2 }, { -6, 5 }, { 12, 4 }, { 46, 6 }, { 57, 0 },
      { 79, 1 } };
  private int[] resVector = new int[] { 20, 80, -128, -192, 192, 2944, 57, 158 };

  @Test
  public void test01() {
    assertEquals(Program.shiftToLeft(numVector[0][0], numVector[0][1]), resVector[0]);
  }

  @Test
  public void test02() {
    assertEquals(Program.shiftToLeft(numVector[1][0], numVector[1][1]), resVector[1]);
  }

  @Test
  public void test03() {
    assertEquals(Program.shiftToLeft(numVector[2][0], numVector[2][1]), resVector[2]);
  }

  @Test
  public void test04() {
    assertEquals(Program.shiftToLeft(numVector[3][0], numVector[3][1]), resVector[3]);
  }

  @Test
  public void test05() {
    assertEquals(Program.shiftToLeft(numVector[4][0], numVector[4][1]), resVector[4]);
  }

  @Test
  public void test06() {
    assertEquals(Program.shiftToLeft(numVector[5][0], numVector[5][1]), resVector[5]);
  }

  @Test
  public void test07() {
    assertEquals(Program.shiftToLeft(numVector[6][0], numVector[6][1]), resVector[6]);
  }

  @Test
  public void test08() {
    assertEquals(Program.shiftToLeft(numVector[7][0], numVector[7][1]), resVector[7]);
  }
}
