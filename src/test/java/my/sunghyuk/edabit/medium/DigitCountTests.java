package my.sunghyuk.edabit.medium;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DigitCountTests {
  private long[] numVector = new long[] { 0, 12345, 1289396387328L, -1232323, 3463463874638476L, -231200000,
      1283939312321L, -231273683, 3200000, 314890000 };
  private int[] resVector = new int[] { 1, 5, 13, 7, 16, 9, 13, 9, 7, 9 };

  @Test
  public void test01() {
    assertEquals(Program.digitsCount(numVector[0]), resVector[0]);
  }

  @Test
  public void test02() {
    assertEquals(Program.digitsCount(numVector[1]), resVector[1]);
  }

  @Test
  public void test03() {
    assertEquals(Program.digitsCount(numVector[2]), resVector[2]);
  }

  @Test
  public void test04() {
    assertEquals(Program.digitsCount(numVector[3]), resVector[3]);
  }

  @Test
  public void test05() {
    assertEquals(Program.digitsCount(numVector[4]), resVector[4]);
  }

  @Test
  public void test06() {
    assertEquals(Program.digitsCount(numVector[5]), resVector[5]);
  }

  @Test
  public void test07() {
    assertEquals(Program.digitsCount(numVector[6]), resVector[6]);
  }

  @Test
  public void test08() {
    assertEquals(Program.digitsCount(numVector[7]), resVector[7]);
  }

  @Test
  public void test09() {
    assertEquals(Program.digitsCount(numVector[8]), resVector[8]);
  }

  @Test
  public void test10() {
    assertEquals(Program.digitsCount(numVector[9]), resVector[9]);
  }
}
