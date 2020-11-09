package my.sunghyuk.edabit.medium;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IsCurzonTests {

  private int[] numVector = new int[] { 5, 10, 14, 18, 27, 33, 41, 54, 65, 86, 90, 115, 120, 194, 293 };
  private boolean[] resVector = new boolean[] { true, false, true, true, false, true, true, true, true, true, true,
      false, false, true, true };

  @Test
  public void test01() {
    assertEquals(Program.isCurzon(numVector[0]), resVector[0]);
  }

  @Test
  public void test02() {
    assertEquals(Program.isCurzon(numVector[1]), resVector[1]);
  }

  @Test
  public void test03() {
    assertEquals(Program.isCurzon(numVector[2]), resVector[2]);
  }

  @Test
  public void test04() {
    assertEquals(Program.isCurzon(numVector[3]), resVector[3]);
  }

  @Test
  public void test05() {
    assertEquals(Program.isCurzon(numVector[4]), resVector[4]);
  }

  @Test
  public void test06() {
    assertEquals(Program.isCurzon(numVector[5]), resVector[5]);
  }

  @Test
  public void test07() {
    assertEquals(Program.isCurzon(numVector[6]), resVector[6]);
  }

  @Test
  public void test08() {
    assertEquals(Program.isCurzon(numVector[7]), resVector[7]);
  }

  @Test
  public void test09() {
    assertEquals(Program.isCurzon(numVector[8]), resVector[8]);
  }

  @Test
  public void test10() {
    assertEquals(Program.isCurzon(numVector[9]), resVector[9]);
  }

  @Test
  public void test11() {
    assertEquals(Program.isCurzon(numVector[10]), resVector[10]);
  }

  @Test
  public void test12() {
    assertEquals(Program.isCurzon(numVector[11]), resVector[11]);
  }

  @Test
  public void test13() {
    assertEquals(Program.isCurzon(numVector[12]), resVector[12]);
  }

  @Test
  public void test14() {
    assertEquals(Program.isCurzon(numVector[13]), resVector[13]);
  }

  @Test
  public void test15() {
    assertEquals(Program.isCurzon(numVector[14]), resVector[14]);
  }
}
