package my.sunghyuk.edabit.very_hard;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CountTests {
  private int[] numVector = new int[] { 0, 318, -92563, 4666, 314890, 654321, 638476, 12345, 1289396, -1232323,
      12839393, -231273683 };
  private int[] resVector = new int[] { 1, 3, 5, 4, 6, 6, 6, 5, 7, 7, 8, 9 };

  @Test
  public void test01() {
    assertEquals(Program.count(numVector[0]), resVector[0]);
  }

  @Test
  public void test02() {
    assertEquals(Program.count(numVector[1]), resVector[1]);
  }

  @Test
  public void test03() {
    assertEquals(Program.count(numVector[2]), resVector[2]);
  }

  @Test
  public void test04() {
    assertEquals(Program.count(numVector[3]), resVector[3]);
  }

  @Test
  public void test05() {
    assertEquals(Program.count(numVector[4]), resVector[4]);
  }

  @Test
  public void test06() {
    assertEquals(Program.count(numVector[5]), resVector[5]);
  }

  @Test
  public void test07() {
    assertEquals(Program.count(numVector[6]), resVector[6]);
  }

  @Test
  public void test08() {
    assertEquals(Program.count(numVector[7]), resVector[7]);
  }

  @Test
  public void test09() {
    assertEquals(Program.count(numVector[8]), resVector[8]);
  }

  @Test
  public void test10() {
    assertEquals(Program.count(numVector[9]), resVector[9]);
  }

  @Test
  public void test11() {
    assertEquals(Program.count(numVector[10]), resVector[10]);
  }

  @Test
  public void test12() {
    assertEquals(Program.count(numVector[11]), resVector[11]);
  }
}
