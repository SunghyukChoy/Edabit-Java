package my.sunghyuk.edabit.easy;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class FilterByLengthTests {

  private int[][] numVector = new int[][] { { 88, 232, 4, 9721, 555 }, { 2, 7, 8, 9, 1012 },
      { 32, 88, 74, 91, 300, 4050 }, { 5, 6, 8, 9 }, { 99, 838, 435, 7666, 989, 431 }, { 99, 838, 435, 7666, 989, 431 },
      { -1, -4, 0, 10, 412, 22, 8989128 } };
  private int[][] resVector = new int[][] { { 232, 555 }, { 2, 7, 8, 9 }, {}, { 5, 6, 8, 9 }, { 838, 435, 989, 431 },
      { 99 }, { -1, -4, 0 } };
  private int[] lenVector = new int[] { 3, 1, 1, 1, 3, 2, 1 };

  @Test
  public void test01() {
    assertArrayEquals(Program.filterByLength(numVector[0], lenVector[0]), resVector[0]);
  }

  @Test
  public void test02() {
    assertArrayEquals(Program.filterByLength(numVector[1], lenVector[1]), resVector[1]);
  }

  @Test
  public void test03() {
    assertArrayEquals(Program.filterByLength(numVector[2], lenVector[2]), resVector[2]);
  }

  @Test
  public void test04() {
    assertArrayEquals(Program.filterByLength(numVector[3], lenVector[3]), resVector[3]);
  }

  @Test
  public void test05() {
    assertArrayEquals(Program.filterByLength(numVector[4], lenVector[4]), resVector[4]);
  }

  @Test
  public void test06() {
    assertArrayEquals(Program.filterByLength(numVector[5], lenVector[5]), resVector[5]);
  }

  @Test
  public void test07() {
    assertArrayEquals(Program.filterByLength(numVector[6], lenVector[6]), resVector[6]);
  }
}
