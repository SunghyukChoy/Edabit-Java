package my.sunghyuk.edabit.medium;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IsHarshadTests {

  private int[] numVector = new int[] { 75, 171, 481, 89, 516, 200, 209, 12345, 53, 27 };
  private boolean[] resVector = new boolean[] { false, true, true, false, true, true, true, true, false, true };

  @Test
  public void test01() {
    assertEquals(Program.isHarshad(numVector[0]), resVector[0]);
  }

  @Test
  public void test02() {
    assertEquals(Program.isHarshad(numVector[1]), resVector[1]);
  }

  @Test
  public void test03() {
    assertEquals(Program.isHarshad(numVector[2]), resVector[2]);
  }

  @Test
  public void test04() {
    assertEquals(Program.isHarshad(numVector[3]), resVector[3]);
  }

  @Test
  public void test05() {
    assertEquals(Program.isHarshad(numVector[4]), resVector[4]);
  }

  @Test
  public void test06() {
    assertEquals(Program.isHarshad(numVector[5]), resVector[5]);
  }

  @Test
  public void test07() {
    assertEquals(Program.isHarshad(numVector[6]), resVector[6]);
  }

  @Test
  public void test08() {
    assertEquals(Program.isHarshad(numVector[7]), resVector[7]);
  }

  @Test
  public void test09() {
    assertEquals(Program.isHarshad(numVector[8]), resVector[8]);
  }

  @Test
  public void test10() {
    assertEquals(Program.isHarshad(numVector[9]), resVector[9]);
  }
}