package my.sunghyuk.edabit.easy;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ProbeTests {

  private int[][] numVector = new int[][] { { 3, 7, 2, 1, 7, 9, 10, 13 }, { -12, -24, -4, -6 }, { 22 },
      { 13, -55, 5, 7, 9, -21, 3 }, { 3, 19, 18973623, 2 }, { 4, 6, 6, 6, 372, 466, 876, 696 } };
  private int[] resVector = new int[] { 10, -4, 22, -1, 2, 876 };

  @Test
  public void test01() {
    assertEquals(Program.probe(numVector[0]), resVector[0]);
  }

  @Test
  public void test02() {
    assertEquals(Program.probe(numVector[1]), resVector[1]);
  }

  @Test
  public void test03() {
    assertEquals(Program.probe(numVector[2]), resVector[2]);
  }

  @Test
  public void test04() {
    assertEquals(Program.probe(numVector[3]), resVector[3]);
  }

  @Test
  public void test05() {
    assertEquals(Program.probe(numVector[4]), resVector[4]);
  }

  @Test
  public void test06() {
    assertEquals(Program.probe(numVector[5]), resVector[5]);
  }
}
