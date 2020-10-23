package my.sunghyuk.edabit.hard;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IsDisariumTests {

  private int[] numVector = new int[] { 6, 75, 135, 466, 372, 175, 1, 696, 876, 89, 518, 598 };
  private boolean[] resVector = new boolean[] { true, false, true, false, false, true, true, false, false, true, true,
      true };

  @Test
  public void test01() {
    assertEquals(Program.isDisarium(numVector[0]), resVector[0]);
  }

  @Test
  public void test02() {
    assertEquals(Program.isDisarium(numVector[1]), resVector[1]);
  }

  @Test
  public void test03() {
    assertEquals(Program.isDisarium(numVector[2]), resVector[2]);
  }

  @Test
  public void test04() {
    assertEquals(Program.isDisarium(numVector[3]), resVector[3]);
  }

  @Test
  public void test05() {
    assertEquals(Program.isDisarium(numVector[4]), resVector[4]);
  }

  @Test
  public void test06() {
    assertEquals(Program.isDisarium(numVector[5]), resVector[5]);
  }

  @Test
  public void test07() {
    assertEquals(Program.isDisarium(numVector[6]), resVector[6]);
  }

  @Test
  public void test08() {
    assertEquals(Program.isDisarium(numVector[7]), resVector[7]);
  }

  @Test
  public void test09() {
    assertEquals(Program.isDisarium(numVector[8]), resVector[8]);
  }

  @Test
  public void test10() {
    assertEquals(Program.isDisarium(numVector[9]), resVector[9]);
  }

  @Test
  public void test11() {
    assertEquals(Program.isDisarium(numVector[10]), resVector[10]);
  }

  @Test
  public void test12() {
    assertEquals(Program.isDisarium(numVector[11]), resVector[11]);
  }
}
