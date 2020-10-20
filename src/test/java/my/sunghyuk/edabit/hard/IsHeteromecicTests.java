package my.sunghyuk.edabit.hard;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IsHeteromecicTests {

  private int[] numVector = new int[] { 0, 2, 7, 110, 136, 156, 182, 218, 250, 272, 306, 362, 380, 422, 462, 600 };
  private boolean[] resVector = new boolean[] { true, true, false, true, false, true, true, false, false, true, true,
      false, true, false, true, true };

  @Test
  public void test01() {
    assertEquals(Program.isHeteromecic(numVector[0]), resVector[0]);
  }

  @Test
  public void test02() {
    assertEquals(Program.isHeteromecic(numVector[1]), resVector[1]);
  }

  @Test
  public void test03() {
    assertEquals(Program.isHeteromecic(numVector[2]), resVector[2]);
  }

  @Test
  public void test04() {
    assertEquals(Program.isHeteromecic(numVector[3]), resVector[3]);
  }

  @Test
  public void test05() {
    assertEquals(Program.isHeteromecic(numVector[4]), resVector[4]);
  }

  @Test
  public void test06() {
    assertEquals(Program.isHeteromecic(numVector[5]), resVector[5]);
  }

  @Test
  public void test07() {
    assertEquals(Program.isHeteromecic(numVector[6]), resVector[6]);
  }

  @Test
  public void test08() {
    assertEquals(Program.isHeteromecic(numVector[7]), resVector[7]);
  }

  @Test
  public void test09() {
    assertEquals(Program.isHeteromecic(numVector[8]), resVector[8]);
  }

  @Test
  public void test10() {
    assertEquals(Program.isHeteromecic(numVector[9]), resVector[9]);
  }

  @Test
  public void test11() {
    assertEquals(Program.isHeteromecic(numVector[10]), resVector[10]);
  }

  @Test
  public void test12() {
    assertEquals(Program.isHeteromecic(numVector[11]), resVector[11]);
  }

  @Test
  public void test13() {
    assertEquals(Program.isHeteromecic(numVector[12]), resVector[12]);
  }

  @Test
  public void test14() {
    assertEquals(Program.isHeteromecic(numVector[13]), resVector[13]);
  }

  @Test
  public void test15() {
    assertEquals(Program.isHeteromecic(numVector[14]), resVector[14]);
  }

  @Test
  public void test16() {
    assertEquals(Program.isHeteromecic(numVector[15]), resVector[15]);
  }
}